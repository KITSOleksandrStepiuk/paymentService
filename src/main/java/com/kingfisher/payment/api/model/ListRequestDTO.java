package com.kingfisher.payment.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kingfisher.payment.api.optile.model.Transaction;
import com.kingfisher.payment.api.validator.groups.PaymentAPI;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListRequestDTO)) return false;
        if (!super.equals(o)) return false;
        ListRequestDTO that = (ListRequestDTO) o;
        return Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), orderId);
    }
}
