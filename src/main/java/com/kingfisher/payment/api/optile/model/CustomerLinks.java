package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * CustomerLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class CustomerLinks   {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("charge")
  private String charge = null;

  public CustomerLinks self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Link to this customer resource
   * @return self
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/customers/59e0b92c268ce9a8cd6u", required = true, value = "Link to this customer resource")
  @NotNull


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public CustomerLinks charge(String charge) {
    this.charge = charge;
    return this;
  }

   /**
   * URL where recurring `CHARGE` data be submitted (POSTed)
   * @return charge
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/customers/59e0b92c268ce9a8cd6u/charge", required = true, value = "URL where recurring `CHARGE` data be submitted (POSTed)")
  @NotNull


  public String getCharge() {
    return charge;
  }

  public void setCharge(String charge) {
    this.charge = charge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLinks customerLinks = (CustomerLinks) o;
    return Objects.equals(this.self, customerLinks.self) &&
        Objects.equals(this.charge, customerLinks.charge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, charge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
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

