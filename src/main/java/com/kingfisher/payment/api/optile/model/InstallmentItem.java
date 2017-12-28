package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import org.joda.time.LocalDate;
import java.util.Objects;

/**
 * InstallmentItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class InstallmentItem   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("date")
  private LocalDate date = null;

  public InstallmentItem amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * An amount of this installment in major units
   * @return amount
  **/
  @ApiModelProperty(value = "An amount of this installment in major units")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public InstallmentItem date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * An installment (or payment) date
   * @return date
  **/
  @ApiModelProperty(value = "An installment (or payment) date")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentItem installmentItem = (InstallmentItem) o;
    return Objects.equals(this.amount, installmentItem.amount) &&
        Objects.equals(this.date, installmentItem.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentItem {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

