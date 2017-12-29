package com.kingfisher.payment.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kingfisher.payment.api.optile.model.Transaction;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ListRequestDTO extends Transaction{

    @JsonProperty(value = "orderId")
    @NotNull
    @Size(min=1)
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
