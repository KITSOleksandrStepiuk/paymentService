package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhoneNumber
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class PhoneNumber   {
  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("areaCode")
  private String areaCode = null;

  @JsonProperty("subscriberNumber")
  private String subscriberNumber = null;

  @JsonProperty("unstructuredNumber")
  private String unstructuredNumber = null;

  public PhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * A country code with numbers only, e.g. \"49\" for Germany, \"7\" for Russia
   * @return countryCode
  **/
  @ApiModelProperty(example = "49", value = "A country code with numbers only, e.g. \"49\" for Germany, \"7\" for Russia")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PhoneNumber areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

   /**
   * An area code with numbers only, e.g. \"89\" for Munich city
   * @return areaCode
  **/
  @ApiModelProperty(example = "89", value = "An area code with numbers only, e.g. \"89\" for Munich city")


  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public PhoneNumber subscriberNumber(String subscriberNumber) {
    this.subscriberNumber = subscriberNumber;
    return this;
  }

   /**
   * A subscriber number (without country and area code) with numbers only, e.g. \"88008800\"
   * @return subscriberNumber
  **/
  @ApiModelProperty(example = "88008800", value = "A subscriber number (without country and area code) with numbers only, e.g. \"88008800\"")


  public String getSubscriberNumber() {
    return subscriberNumber;
  }

  public void setSubscriberNumber(String subscriberNumber) {
    this.subscriberNumber = subscriberNumber;
  }

  public PhoneNumber unstructuredNumber(String unstructuredNumber) {
    this.unstructuredNumber = unstructuredNumber;
    return this;
  }

   /**
   * Use this for a full phone number including country and/or area codes, e.g. \"+49 (0)89 880088-00\"; could be provided as an option instead of structured number fields 
   * @return unstructuredNumber
  **/
  @ApiModelProperty(example = "+49 (0)89 880088-00", value = "Use this for a full phone number including country and/or area codes, e.g. \"+49 (0)89 880088-00\"; could be provided as an option instead of structured number fields ")


  public String getUnstructuredNumber() {
    return unstructuredNumber;
  }

  public void setUnstructuredNumber(String unstructuredNumber) {
    this.unstructuredNumber = unstructuredNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(this.countryCode, phoneNumber.countryCode) &&
        Objects.equals(this.areaCode, phoneNumber.areaCode) &&
        Objects.equals(this.subscriberNumber, phoneNumber.subscriberNumber) &&
        Objects.equals(this.unstructuredNumber, phoneNumber.unstructuredNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, areaCode, subscriberNumber, unstructuredNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    subscriberNumber: ").append(toIndentedString(subscriberNumber)).append("\n");
    sb.append("    unstructuredNumber: ").append(toIndentedString(unstructuredNumber)).append("\n");
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

