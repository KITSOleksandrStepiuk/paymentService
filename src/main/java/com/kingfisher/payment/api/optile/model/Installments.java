package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Installments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Installments   {
  @JsonProperty("originalPayment")
  private PaymentAmount originalPayment = null;

  @JsonProperty("plans")
  private List<InstallmentsPlan> plans = null;

  public Installments originalPayment(PaymentAmount originalPayment) {
    this.originalPayment = originalPayment;
    return this;
  }

   /**
   * An information about original payment
   * @return originalPayment
  **/
  @ApiModelProperty(value = "An information about original payment")

  @Valid

  public PaymentAmount getOriginalPayment() {
    return originalPayment;
  }

  public void setOriginalPayment(PaymentAmount originalPayment) {
    this.originalPayment = originalPayment;
  }

  public Installments plans(List<InstallmentsPlan> plans) {
    this.plans = plans;
    return this;
  }

  public Installments addPlansItem(InstallmentsPlan plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<InstallmentsPlan>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Collection of calculated installments plans what should be present to customer
   * @return plans
  **/
  @ApiModelProperty(value = "Collection of calculated installments plans what should be present to customer")

  @Valid

  public List<InstallmentsPlan> getPlans() {
    return plans;
  }

  public void setPlans(List<InstallmentsPlan> plans) {
    this.plans = plans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installments installments = (Installments) o;
    return Objects.equals(this.originalPayment, installments.originalPayment) &&
        Objects.equals(this.plans, installments.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalPayment, plans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installments {\n");
    
    sb.append("    originalPayment: ").append(toIndentedString(originalPayment)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

