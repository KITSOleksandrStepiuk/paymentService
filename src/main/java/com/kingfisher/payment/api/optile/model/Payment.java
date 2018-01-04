package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Payment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Payment   {
  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("invoiceId")
  private String invoiceId = null;

  @JsonProperty("longReference")
  private LongReference longReference = null;

  public Payment reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * A short description of the order by the merchant; will appear on bank statements or invoices for the customer whenever possible
   * @return reference
  **/
  @ApiModelProperty(example = "order nr. 04837", required = true, value = "A short description of the order by the merchant; will appear on bank statements or invoices for the customer whenever possible")
  @NotNull


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Payment amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The total amount (including taxes, shipping, etc.) of this order in native format using \".\" as decimal delimiter; this amount will be collected from the customer 
   * @return amount
  **/
  @ApiModelProperty(example = "17.99", required = true, value = "The total amount (including taxes, shipping, etc.) of this order in native format using \".\" as decimal delimiter; this amount will be collected from the customer ")
  @NotNull


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Payment currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of this payment; format according to ISO-4217 form, e.g. \"EUR\", \"USD\"
   * @return currency
  **/
  @ApiModelProperty(example = "EUR", required = true, value = "Currency of this payment; format according to ISO-4217 form, e.g. \"EUR\", \"USD\"")
  @NotNull


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Payment invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Invoice ID assigned by merchant to this payment; max 128 characters
   * @return invoiceId
  **/
  @ApiModelProperty(example = "O-21072017/035/0001635", value = "Invoice ID assigned by merchant to this payment; max 128 characters")


  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public Payment longReference(LongReference longReference) {
    this.longReference = longReference;
    return this;
  }

   /**
   * A long description of the order given by merchant
   * @return longReference
  **/
  @ApiModelProperty(value = "A long description of the order given by merchant")

  @Valid

  public LongReference getLongReference() {
    return longReference;
  }

  public void setLongReference(LongReference longReference) {
    this.longReference = longReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.reference, payment.reference) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.currency, payment.currency) &&
        Objects.equals(this.invoiceId, payment.invoiceId) &&
        Objects.equals(this.longReference, payment.longReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, amount, currency, invoiceId, longReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    longReference: ").append(toIndentedString(longReference)).append("\n");
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

