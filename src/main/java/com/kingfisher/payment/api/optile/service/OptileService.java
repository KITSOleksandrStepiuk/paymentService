package com.kingfisher.payment.api.optile.service;

import com.kingfisher.payment.api.optile.model.NetworkList;
import com.kingfisher.payment.api.optile.model.Operation;
import com.kingfisher.payment.api.optile.model.Payout;
import com.kingfisher.payment.api.optile.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;

@Service
public class OptileService {

    @Value("${optile.api.base.url}")
    private String baseURL;
    @Value("${optile.api.post.list}")
    private String listEndpoint;
    @Value("${optile.api.close.charge}")
    private String closeChargeEndpoint;
    @Value("${optile.api.charge.payment}")
    private String chargePaymentEndpoint;
    @Value("${optile.api.refund.charge}")
    private String refundChargeEndpoint;
    @Value("${optile.api.cancel.list.session}")
    private String cancelListSessionEndpoint;
    @Value("${optile.api.post.list.header.authorization}")
    private String authorizationHeader;
    @Value("${optile.api.post.list.header.content-type}")
    private String contentTypeHeader;
    @Value("${optile.api.post.list.header.accept}")
    private String acceptHeader;

    @Autowired
    private RestTemplate restTemplate;


    public NetworkList postListRequest(final Transaction listRequest) {

        HttpEntity<Transaction> entity = new HttpEntity<>(listRequest, getHeaders());

        return restTemplate.postForObject(
                baseURL + listEndpoint,
                entity,
                NetworkList.class);
    }

    public Payout closePaymentCharge(String chargeId, Transaction transaction) {

        HttpEntity<Transaction> entity = new HttpEntity<>(transaction, getHeaders());

        return restTemplate.postForObject(
                baseURL + MessageFormat.format(closeChargeEndpoint, chargeId),
                entity,
                Payout.class);
    }

    public Payout chargePayment(String listId, Operation operation) {
        HttpEntity<Operation> entity = new HttpEntity<>(operation, getHeaders());

        return restTemplate.postForObject(
                baseURL +MessageFormat.format(chargePaymentEndpoint, listId),
                entity,
                Payout.class);
    }

    public Payout refundPayment(String listId, Operation operation) {
       HttpEntity<Operation> entity = new HttpEntity<>(operation, getHeaders());

       return restTemplate.postForObject(
                baseURL +MessageFormat.format(refundChargeEndpoint, listId),
                entity,
                Payout.class);
    }

    public ResponseEntity cancelListSession(String listId) {
        HttpEntity<Operation> entity = new HttpEntity<>(getHeaders());
        return restTemplate.exchange(baseURL+MessageFormat.format(cancelListSessionEndpoint, listId), HttpMethod.DELETE, entity, Void.class);
    }

    //TODO authorization token will be different and dynamic in future. Below is for Test Optile sandbox.
    private HttpHeaders getHeaders(){

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", authorizationHeader);
        headers.set("Content-Type", contentTypeHeader);
        headers.set("Accept", acceptHeader);

        return headers;
    }

}
