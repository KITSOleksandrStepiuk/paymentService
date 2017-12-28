package com.kingfisher.payment.api.database.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class TransactionLogInfo {

    @Id
    private String transactionId;
    private long timestamp;
    @NotNull
    @NotEmpty
    private String listId;
    @NotNull
    @NotEmpty
    private String orderId;
    private String chargeId;

    @ManyToOne(targetEntity = CustomerRegistrationInfo.class, cascade = CascadeType.MERGE)
    private CustomerRegistrationInfo customerRegistrationInfo;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public CustomerRegistrationInfo getCustomerRegistrationInfo() {
        return customerRegistrationInfo;
    }

    public void setCustomerRegistrationInfo(CustomerRegistrationInfo customerRegistrationInfo) {
        this.customerRegistrationInfo = customerRegistrationInfo;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }


    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
