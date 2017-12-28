package com.kingfisher.payment.api.database.repository;

import com.kingfisher.payment.api.database.model.CustomerRegistrationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerRegistrationInfo, Long>{

    Optional<CustomerRegistrationInfo> findFirstByProfileId(String profileId);

}
