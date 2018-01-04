package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ListLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class ListLinks   {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("customer")
  private String customer = null;

  public ListLinks self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Link to `LIST` session itself
   * @return self
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/lists/59e0b954148b5p4t1n6ds5mfjss451khui", required = true, value = "Link to `LIST` session itself")
  @NotNull


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public ListLinks customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Link to the registered customer of this `LIST` session; appears only if it was initialized with appropriate information
   * @return customer
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/customers/59e0b92c268ce9a8cd6u", value = "Link to the registered customer of this `LIST` session; appears only if it was initialized with appropriate information")


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
    ListLinks listLinks = (ListLinks) o;
    return Objects.equals(this.self, listLinks.self) &&
        Objects.equals(this.customer, listLinks.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLinks {\n");
    
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

