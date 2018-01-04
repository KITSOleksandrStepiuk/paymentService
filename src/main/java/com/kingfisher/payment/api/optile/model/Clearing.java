package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Clearing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Clearing   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("reference")
  private String reference = null;

  public Clearing amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Cleared amount of this operation, confirmed by PSP or financial institution; amount is provided in native format using \".\" as decimal delimiter, e.g. 12.99 
   * @return amount
  **/
  @ApiModelProperty(example = "12.99", value = "Cleared amount of this operation, confirmed by PSP or financial institution; amount is provided in native format using \".\" as decimal delimiter, e.g. 12.99 ")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Clearing currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the cleared amount; format according to ISO-4217 form, e.g. \"EUR\", \"USD\"
   * @return currency
  **/
  @ApiModelProperty(example = "USD", value = "Currency of the cleared amount; format according to ISO-4217 form, e.g. \"EUR\", \"USD\"")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Clearing reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Reference to this payment operation provided by PSP or financial institution that should appear on the customer's bill
   * @return reference
  **/
  @ApiModelProperty(example = "Order #1652", value = "Reference to this payment operation provided by PSP or financial institution that should appear on the customer's bill")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clearing clearing = (Clearing) o;
    return Objects.equals(this.amount, clearing.amount) &&
        Objects.equals(this.currency, clearing.currency) &&
        Objects.equals(this.reference, clearing.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clearing {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

