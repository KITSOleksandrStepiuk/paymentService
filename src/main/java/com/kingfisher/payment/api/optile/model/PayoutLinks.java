package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * PayoutLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class PayoutLinks   {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("customer")
  private String customer = null;

  public PayoutLinks self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Link to `PAYOUT` operation itself
   * @return self
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/charges/59c51cb42ca6b49e1f081o", required = true, value = "Link to `PAYOUT` operation itself")
  @NotNull


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public PayoutLinks customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Link to the registered customer; appears only if `PAYOUT` refers a `CHARGE` with registered customer information
   * @return customer
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/customers/59e0b92c268ce9a8cd6u", value = "Link to the registered customer; appears only if `PAYOUT` refers a `CHARGE` with registered customer information")


  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutLinks payoutLinks = (PayoutLinks) o;
    return Objects.equals(this.self, payoutLinks.self) &&
        Objects.equals(this.customer, payoutLinks.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

