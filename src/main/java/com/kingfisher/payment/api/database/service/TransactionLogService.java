package com.kingfisher.payment.api.database.service;

import com.kingfisher.payment.api.database.model.CustomerRegistrationInfo;
import com.kingfisher.payment.api.database.model.TransactionLogInfo;
import com.kingfisher.payment.api.database.repository.TransactionLogRepository;
import com.kingfisher.payment.api.optile.model.NetworkList;
import com.kingfisher.payment.api.optile.model.Transaction;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Service
public class TransactionLogService {

    @Value("${optile.DTO.transaction.integration.mode}")
    private String integrationMode;
    @Value("${optile.DTO.transaction.updateOnly}")
    private boolean updateOnly;
    @Value("${optile.notification.url}")
    private String notificationUrl;

    @Autowired
    private TransactionLogRepository repository;


    public void saveOrUpdateTransaction(TransactionLogInfo transactionLogInfo) {
        repository.save(transactionLogInfo);
    }

    public Optional<TransactionLogInfo> getTransactionLogById(@NotNull String transactionId) {
        return  repository.findById(transactionId);
    }

    public Optional<TransactionLogInfo> getLatestOrderTransaction(String orderId) {
        return repository.findFirstByOrderIdOrderByTimestampDesc(orderId);
    }

    public void populateTransactionWithOptileStaticDataAndGenerateTransactionId(Transaction transaction, String orderId) {
        transaction.setIntegration(Transaction.IntegrationEnum.fromValue(integrationMode));
        transaction.setTransactionId(generateTransactionId(orderId, transaction.getCustomer().getNumber()));
        transaction.setUpdateOnly(updateOnly);
        transaction.getCallback().setNotificationUrl(notificationUrl);
    }

    public void initAndSaveNewTransactionLogInfo(Transaction request, NetworkList response, String orderId, Optional<CustomerRegistrationInfo> registrationInfo) {

        CustomerRegistrationInfo customerRegistrationInfo;

        if(!registrationInfo.isPresent()) {
            customerRegistrationInfo = new CustomerRegistrationInfo(request.getCustomer().getNumber());
        }else {
            customerRegistrationInfo = registrationInfo.get();
        }

        TransactionLogInfo transactionLogInfo = new TransactionLogInfo();
        transactionLogInfo.setTimestamp(response.getTimestamp().getMillis());
        transactionLogInfo.setCustomerRegistrationInfo(customerRegistrationInfo);
        transactionLogInfo.setTransactionId(response.getIdentification().getTransactionId());
        transactionLogInfo.setListId(response.getIdentification().getLongId());
        transactionLogInfo.setOrderId(orderId);

        saveOrUpdateTransaction(transactionLogInfo);
    }

    private String generateTransactionId(@NotNull String orderId, @NotNull String customerId) {

        return new StringBuilder()
                .append(DateTime.now().getMillis())
                .append("-")
                .append(orderId)
                .append("-")
                .append(customerId).toString();

    }

}
