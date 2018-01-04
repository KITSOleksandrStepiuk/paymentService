package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Installment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Installment   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("planId")
  private String planId = null;

  public Installment count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of installments the payment should be split into
   * @return count
  **/
  @ApiModelProperty(example = "12", required = true, value = "Number of installments the payment should be split into")
  @NotNull


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Installment planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * An ID of selected installment plan
   * @return planId
  **/
  @ApiModelProperty(value = "An ID of selected installment plan")


  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installment installment = (Installment) o;
    return Objects.equals(this.count, installment.count) &&
        Objects.equals(this.planId, installment.planId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, planId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installment {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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

