package com.kingfisher.payment.api.database.repository;

import com.kingfisher.payment.api.database.model.TransactionLogInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Repository
public interface TransactionLogRepository extends CrudRepository<TransactionLogInfo, String> {

    Optional<TransactionLogInfo> findFirstByOrderIdOrderByTimestampDesc (@NotNull String orderId);

}

