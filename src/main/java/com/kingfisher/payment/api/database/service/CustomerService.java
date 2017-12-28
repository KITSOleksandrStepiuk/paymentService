package com.kingfisher.payment.api.database.service;

import com.kingfisher.payment.api.database.repository.CustomerRepository;
import com.kingfisher.payment.api.database.model.CustomerRegistrationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Optional<CustomerRegistrationInfo> getCustomerRegistrationInfo(String profileId) {
        return customerRepository.findFirstByProfileId(profileId);
    }

}
