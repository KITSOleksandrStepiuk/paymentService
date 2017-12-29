package com.kingfisher.payment.api.controller;

import com.kingfisher.payment.api.database.model.CustomerRegistrationInfo;
import com.kingfisher.payment.api.database.model.TransactionLogInfo;
import com.kingfisher.payment.api.database.service.CustomerService;
import com.kingfisher.payment.api.database.service.TransactionLogService;
import com.kingfisher.payment.api.error.InputDTOValidationException;
import com.kingfisher.payment.api.model.ListRequestDTO;
import com.kingfisher.payment.api.optile.error.model.ErrorResponse;
import com.kingfisher.payment.api.optile.model.*;
import com.kingfisher.payment.api.optile.service.OptileService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.dozer.DozerBeanMapper;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import java.net.UnknownHostException;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

@CrossOrigin
@RestController
@RequestMapping("api/v1/payment")
public class PaymentAPI {

    @Autowired
    private OptileService optileService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private TransactionLogService transactionLogService;
    @Autowired
    private DozerBeanMapper dozerBeanMapper;
    @Autowired
    private Validator validator;
    @Autowired
    Environment environment;
    @Value("${optile.DTO.transaction.integration.mode}")
    private String integrationMode;
    @Value("${optile.DTO.transaction.updateOnly}")
    private boolean updateOnly;
    @Value("${otile.notification.url}")
    private String notificationUrl;

    @ApiOperation(value = "Create Payment session for new transaction")
    @ApiResponses({
            @ApiResponse(code =  404, message ="Not found", response = ErrorResponse.class),
            @ApiResponse(code =  400, message ="Invalid input", response = ErrorResponse.class),
            @ApiResponse(code =  503, message ="Server Internal Error", response = ErrorResponse.class)
    })
    @PostMapping(
            path="/session/create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NetworkList> createPaymentSession(@RequestBody ListRequestDTO request) throws InputDTOValidationException {

        Set<ConstraintViolation<ListRequestDTO>> violations = validator.validate(request);

        if(!violations.isEmpty()) {
            throw new InputDTOValidationException(violations);
        }

        Transaction transaction = dozerBeanMapper.map(request, Transaction.class);
        populateTransactionWithStaticDataAndGenerateTransactionId(transaction, request.getOrderId());

        Optional<CustomerRegistrationInfo> registrationInfo = customerService.getCustomerRegistrationInfo(request.getCustomer().getNumber());
        registrationInfo.ifPresent(regInfo -> populateRequestWithCustomerRegistrationInfo(regInfo, transaction));

        NetworkList response = optileService.postListRequest(transaction);

        initAndSaveNewTransactionLogInfo(transaction, response, request.getOrderId(), registrationInfo);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @ApiOperation(value = "Close session transaction from ATG")
    @ApiResponses({
            @ApiResponse(code =  404, message ="Not found", response = ErrorResponse.class),
            @ApiResponse(code =  400, message ="Invalid input", response = ErrorResponse.class),
            @ApiResponse(code =  503, message ="Server Internal Error", response = ErrorResponse.class)
    })
    @PostMapping(
            path = "/session/close/{profileId}/{orderId}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Payout> closePaymentCharge(@PathVariable("profileId") String profileId,
                                                     @PathVariable("orderId") String orderId,
                                                     @RequestBody Transaction transaction) {

        //TODO handle case with chargeId not found
        String chargeId = "";
        Optional<TransactionLogInfo> logInfo = transactionLogService.getLatestOrderTransaction(orderId);

        if(logInfo.isPresent() && logInfo.get().getCustomerRegistrationInfo().getProfileId().equalsIgnoreCase(profileId)) {
            chargeId = logInfo.get().getChargeId();
        }

        return ResponseEntity.status(HttpStatus.OK).body(optileService.closePaymentCharge(chargeId, transaction));
    }

    @ApiOperation(value = "Charge payment from ATG")
    @ApiResponses({
            @ApiResponse(code =  503, message ="Server Internal Error", response = ErrorResponse.class)
    })
    @PostMapping(
            path = "/session/charge/{profileId}/{orderId}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Payout> chargePayment(@PathVariable("profileId") String profileId,
                                                @PathVariable("orderId") String orderId,
                                                @RequestBody Operation operation) {

        final AtomicReference<Payout> payout = new AtomicReference<>();

        Optional<TransactionLogInfo> transactionLogInfo = transactionLogService.getLatestOrderTransaction(orderId);

        transactionLogInfo.ifPresent(trnLogInfo -> {
            if (trnLogInfo.getCustomerRegistrationInfo().getProfileId().equalsIgnoreCase(profileId)){
                payout.set(optileService.chargePayment(trnLogInfo.getListId(), operation));
                saveCustomerRegistrationInfo(payout.get());
            }

        });

        return ResponseEntity.status(HttpStatus.OK).body(payout.get());
    }

    //TODO refactor like chargePayment with input parameters order or profileId or both.
    @ApiOperation(value = "Refund payment")
    @ApiResponses({
            @ApiResponse(code =  404, message ="Not found", response = ErrorResponse.class),
            @ApiResponse(code =  400, message ="Invalid input", response = ErrorResponse.class),
            @ApiResponse(code =  503, message ="Server Internal Error", response = ErrorResponse.class)
    })
    @PostMapping(
            path = "/session/refund/{chargeId}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Payout> refundPayment(@PathVariable("chargeId") String chargeId,
                                                @RequestBody Operation operation) {
        return ResponseEntity.status(HttpStatus.OK).body(optileService.refundPayment(chargeId, operation));
    }

    @ApiOperation(value = "Cancel session transaction")
    @ApiResponses({
            @ApiResponse(code =  404, message ="Not found", response = ErrorResponse.class),
            @ApiResponse(code =  400, message ="Invalid input", response = ErrorResponse.class),
            @ApiResponse(code =  503, message ="Server Internal Error", response = ErrorResponse.class)
    })
    @DeleteMapping(
            path = "/session/cancel/{listId}")
    public ResponseEntity closePaymentCharge(@PathVariable("listId") String listId) {
        ResponseEntity entity = optileService.cancelListSession(listId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


    private void populateTransactionWithStaticDataAndGenerateTransactionId(Transaction transaction, String orderId) {
        transaction.setIntegration(Transaction.IntegrationEnum.fromValue(integrationMode));
        transaction.setTransactionId(generateTransactionId(orderId, transaction.getCustomer().getNumber()));
        transaction.setUpdateOnly(updateOnly);
        transaction.getCallback().setNotificationUrl(notificationUrl);
    }

    private String generateTransactionId(@NotNull String orderId, @NotNull String custromerId) {

        return new StringBuilder()
                .append(DateTime.now().getMillis())
                .append("-")
                .append(orderId)
                .append("-")
                .append(custromerId).toString();

    }

    private void populateRequestWithCustomerRegistrationInfo(CustomerRegistrationInfo registrationInfo, Transaction transactionRequest) {
        Registration registration = new Registration();
        registration.setId(registrationInfo.getOptileCustomerId());
        registration.setPassword(registrationInfo.getOptileCustomerPassword());
        transactionRequest.getCustomer().setRegistration(registration);
    }

    private void initAndSaveNewTransactionLogInfo(Transaction request, NetworkList response, String orderId, Optional<CustomerRegistrationInfo> registrationInfo) {

        CustomerRegistrationInfo customerRegistrationInfo;

        if(!registrationInfo.isPresent()) {
            customerRegistrationInfo = new CustomerRegistrationInfo(request.getCustomer().getNumber());
        }else {
            customerRegistrationInfo = registrationInfo.get();
        }

        TransactionLogInfo transactionLogInfo = new TransactionLogInfo();
        transactionLogInfo.setTimestamp(DateTime.now().getMillis());
        transactionLogInfo.setCustomerRegistrationInfo(customerRegistrationInfo);
        transactionLogInfo.setTransactionId(response.getIdentification().getTransactionId());
        transactionLogInfo.setListId(response.getIdentification().getLongId());
        transactionLogInfo.setOrderId(orderId);

        transactionLogService.saveOrUpdateTransaction(transactionLogInfo);
    }

    private void saveCustomerRegistrationInfo(Payout response) {
        response.getRedirect()
                .getParameters()
                .stream()
                .filter( p -> p.getName().equals("customerRegistrationId"))
                .findFirst()
                .ifPresent( customerRegId -> {
                    transactionLogService.getTransactionLogById(response.getIdentification().getTransactionId())
                            .ifPresent(transactionLogInfo -> {
                                transactionLogInfo.getCustomerRegistrationInfo().setOptileCustomerId(customerRegId.getValue());
                                transactionLogInfo.getCustomerRegistrationInfo().setOptileCustomerPassword("password1");
                                transactionLogInfo.setChargeId(response.getIdentification().getLongId());
                                transactionLogService.saveOrUpdateTransaction(transactionLogInfo);
                            });
                });
    }

    private boolean isCustomerRegistrationProvided(Transaction request) {
        Registration registration = request.getCustomer().getRegistration();
        return registration != null && registration.getId() != null;
    }



    @ExceptionHandler({UnknownHostException.class})
    public ResponseEntity handle(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }


}

