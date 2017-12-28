package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChargeLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class ChargeLinks   {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("customer")
  private String customer = null;

  @JsonProperty("payout")
  private String payout = null;

  @JsonProperty("closing")
  private String closing = null;

  public ChargeLinks self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Link to `CHARGE` operation itself
   * @return self
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/charges/59c117dfcb4396be3263efc", required = true, value = "Link to `CHARGE` operation itself")
  @NotNull


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public ChargeLinks customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Link to the registered customer; appears only if `CHARGE` was initiated with registered customer information, or if a new customer was registered during this `CHARGE` 
   * @return customer
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/customers/59e0b92c268ce9a8cd6u", value = "Link to the registered customer; appears only if `CHARGE` was initiated with registered customer information, or if a new customer was registered during this `CHARGE` ")


  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public ChargeLinks payout(String payout) {
    this.payout = payout;
    return this;
  }

   /**
   * Link to `PAYOUT` operation; appears only if current state of this `CHARGE` allows pay outs
   * @return payout
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/charges/59c117dfcb4396be3263efc/payout", value = "Link to `PAYOUT` operation; appears only if current state of this `CHARGE` allows pay outs")


  public String getPayout() {
    return payout;
  }

  public void setPayout(String payout) {
    this.payout = payout;
  }

  public ChargeLinks closing(String closing) {
    this.closing = closing;
    return this;
  }

   /**
   * Link to `CLOSING` operation; appears only in scope of deferred `CHARGE` and if current state of the `CHARGE` allows closings
   * @return closing
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/charges/59c117dfcb4396be3263efc/closing", value = "Link to `CLOSING` operation; appears only in scope of deferred `CHARGE` and if current state of the `CHARGE` allows closings")


  public String getClosing() {
    return closing;
  }

  public void setClosing(String closing) {
    this.closing = closing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeLinks chargeLinks = (ChargeLinks) o;
    return Objects.equals(this.self, chargeLinks.self) &&
        Objects.equals(this.customer, chargeLinks.customer) &&
        Objects.equals(this.payout, chargeLinks.payout) &&
        Objects.equals(this.closing, chargeLinks.closing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, customer, payout, closing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    payout: ").append(toIndentedString(payout)).append("\n");
    sb.append("    closing: ").append(toIndentedString(closing)).append("\n");
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

