package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.Address;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerAddresses
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class CustomerAddresses   {
  @JsonProperty("shipping")
  private Address shipping = null;

  @JsonProperty("residential")
  private Address residential = null;

  @JsonProperty("billing")
  private Address billing = null;

  @JsonProperty("useBillingAsShippingAddress")
  private Boolean useBillingAsShippingAddress = null;

  public CustomerAddresses shipping(Address shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * Shipping address information
   * @return shipping
  **/
  @ApiModelProperty(value = "Shipping address information")

  @Valid

  public Address getShipping() {
    return shipping;
  }

  public void setShipping(Address shipping) {
    this.shipping = shipping;
  }

  public CustomerAddresses residential(Address residential) {
    this.residential = residential;
    return this;
  }

   /**
   * Customer residential address information
   * @return residential
  **/
  @ApiModelProperty(value = "Customer residential address information")

  @Valid

  public Address getResidential() {
    return residential;
  }

  public void setResidential(Address residential) {
    this.residential = residential;
  }

  public CustomerAddresses billing(Address billing) {
    this.billing = billing;
    return this;
  }

   /**
   * Billing address information
   * @return billing
  **/
  @ApiModelProperty(value = "Billing address information")

  @Valid

  public Address getBilling() {
    return billing;
  }

  public void setBilling(Address billing) {
    this.billing = billing;
  }

  public CustomerAddresses useBillingAsShippingAddress(Boolean useBillingAsShippingAddress) {
    this.useBillingAsShippingAddress = useBillingAsShippingAddress;
    return this;
  }

   /**
   * If set to `true` and no SHIPPING address is provided the BILLING address will be used in place of SHIPPING address; default `false`
   * @return useBillingAsShippingAddress
  **/
  @ApiModelProperty(value = "If set to `true` and no SHIPPING address is provided the BILLING address will be used in place of SHIPPING address; default `false`")


  public Boolean getUseBillingAsShippingAddress() {
    return useBillingAsShippingAddress;
  }

  public void setUseBillingAsShippingAddress(Boolean useBillingAsShippingAddress) {
    this.useBillingAsShippingAddress = useBillingAsShippingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAddresses customerAddresses = (CustomerAddresses) o;
    return Objects.equals(this.shipping, customerAddresses.shipping) &&
        Objects.equals(this.residential, customerAddresses.residential) &&
        Objects.equals(this.billing, customerAddresses.billing) &&
        Objects.equals(this.useBillingAsShippingAddress, customerAddresses.useBillingAsShippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipping, residential, billing, useBillingAsShippingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAddresses {\n");
    
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    useBillingAsShippingAddress: ").append(toIndentedString(useBillingAsShippingAddress)).append("\n");
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

