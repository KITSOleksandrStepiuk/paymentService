package com.kingfisher.payment.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kingfisher.payment.api.optile.model.Transaction;
import com.kingfisher.payment.api.validator.groups.PaymentAPI;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ListRequestDTO extends Transaction{

    @JsonProperty(value = "orderId")
    @NotNull(groups = {PaymentAPI.class})
    @NotEmpty(groups = {PaymentAPI.class})
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
