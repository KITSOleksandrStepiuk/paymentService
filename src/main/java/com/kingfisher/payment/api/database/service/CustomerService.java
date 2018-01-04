package com.kingfisher.payment.api.database.service;

import com.kingfisher.payment.api.database.model.CustomerRegistrationInfo;
import com.kingfisher.payment.api.database.repository.CustomerRepository;
import com.kingfisher.payment.api.optile.model.Payout;
import com.kingfisher.payment.api.optile.model.Registration;
import com.kingfisher.payment.api.optile.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private TransactionLogService transactionLogService;

    public Optional<CustomerRegistrationInfo> getCustomerRegistrationInfo(String profileId) {
        return customerRepository.findFirstByProfileId(profileId);
    }

    public void populateRequestWithCustomerRegistrationInfo(CustomerRegistrationInfo registrationInfo, Transaction transactionRequest) {
        Registration registration = new Registration();
        registration.setId(registrationInfo.getOptileCustomerId());
        registration.setPassword(registrationInfo.getOptileCustomerPassword());
        transactionRequest.getCustomer().setRegistration(registration);
    }

    public void saveCustomerRegistrationInfo(Payout response) {
        response.getRedirect()
                .getParameters()
                .stream()
                .filter( p -> p.getName().equals("customerRegistrationId"))
                .findFirst()
                .ifPresent( customerRegId -> transactionLogService.getTransactionLogById(response.getIdentification().getTransactionId())
                        .ifPresent(transactionLogInfo -> {
                            transactionLogInfo.getCustomerRegistrationInfo().setOptileCustomerId(customerRegId.getValue());
                            transactionLogInfo.getCustomerRegistrationInfo().setOptileCustomerPassword("password1");
                            transactionLogInfo.setChargeId(response.getIdentification().getLongId());
                            transactionLogService.saveOrUpdateTransaction(transactionLogInfo);
                        }));
    }

    public boolean isCustomerRegistrationProvided(Transaction request) {
        Registration registration = request.getCustomer().getRegistration();
        return registration != null && registration.getId() != null;
    }


}
