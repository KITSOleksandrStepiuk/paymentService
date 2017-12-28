package com.kingfisher.payment.api.database.service;

import com.kingfisher.payment.api.database.model.TransactionLogInfo;
import com.kingfisher.payment.api.database.repository.TransactionLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Service
public class TransactionLogService {

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

}
