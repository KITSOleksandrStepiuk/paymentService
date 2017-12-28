package com.kingfisher.payment.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kingfisher.payment.api.optile.model.Transaction;

public class ListRequestDTO extends Transaction{

    @JsonProperty(value = "orderId")
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
