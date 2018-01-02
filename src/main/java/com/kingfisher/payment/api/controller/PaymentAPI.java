package com.kingfisher.payment.api.controller;

import com.kingfisher.payment.api.database.model.CustomerRegistrationInfo;
import com.kingfisher.payment.api.database.model.TransactionLogInfo;
import com.kingfisher.payment.api.database.service.CustomerService;
import com.kingfisher.payment.api.database.service.TransactionLogService;
import com.kingfisher.payment.api.error.InputDTOValidationException;
import com.kingfisher.payment.api.model.ListRequestDTO;
import com.kingfisher.payment.api.optile.error.model.ErrorResponse;
import com.kingfisher.payment.api.optile.model.NetworkList;
import com.kingfisher.payment.api.optile.model.Operation;
import com.kingfisher.payment.api.optile.model.Payout;
import com.kingfisher.payment.api.optile.model.Transaction;
import com.kingfisher.payment.api.optile.service.OptileService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
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
        transactionLogService.populateTransactionWithOptileStaticDataAndGenerateTransactionId(transaction, request.getOrderId());

        Optional<CustomerRegistrationInfo> registrationInfo = customerService.getCustomerRegistrationInfo(request.getCustomer().getNumber());
        registrationInfo.ifPresent(regInfo -> customerService.populateRequestWithCustomerRegistrationInfo(regInfo, transaction));

        NetworkList response = optileService.postListRequest(transaction);

        transactionLogService.initAndSaveNewTransactionLogInfo(transaction, response, request.getOrderId(), registrationInfo);

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
                customerService.saveCustomerRegistrationInfo(payout.get());
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
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}

