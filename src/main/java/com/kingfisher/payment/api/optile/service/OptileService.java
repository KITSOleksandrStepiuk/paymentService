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

import javax.validation.Validator;
import java.text.MessageFormat;

@Service
public class OptileService {


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
    private RestTemplateExtension restTemplateExtention;

    public NetworkList postListRequest(final Transaction listRequest) {

        HttpEntity<Transaction> entity = new HttpEntity<>(listRequest, getHeaders());

        return restTemplateExtention.execute(NetworkList.class,listEndpoint, HttpMethod.POST, entity).getBody();
    }

    public Payout closePaymentCharge(String chargeId, Transaction transaction) {

        HttpEntity<Transaction> entity = new HttpEntity<>(transaction, getHeaders());

        return restTemplateExtention.execute(Payout.class, MessageFormat.format(closeChargeEndpoint, chargeId), HttpMethod.POST, entity).getBody();
    }

    public Payout chargePayment(String listId, Operation operation) {
        HttpEntity<Operation> entity = new HttpEntity<>(operation, getHeaders());

        return restTemplateExtention.execute(Payout.class, MessageFormat.format(chargePaymentEndpoint, listId), HttpMethod.POST, entity).getBody();
    }

    public Payout refundPayment(String listId, Operation operation) {
       HttpEntity<Operation> entity = new HttpEntity<>(operation, getHeaders());

        return restTemplateExtention.execute(Payout.class, MessageFormat.format(refundChargeEndpoint, listId), HttpMethod.POST, entity).getBody();
    }

    public ResponseEntity cancelListSession(String listId) {
        HttpEntity<Operation> entity = new HttpEntity<>(getHeaders());

        return restTemplateExtention.execute(Payout.class, MessageFormat.format(cancelListSessionEndpoint, listId), HttpMethod.DELETE, entity);
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
