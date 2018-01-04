package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Phones
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Phones   {
  @JsonProperty("home")
  private PhoneNumber home = null;

  @JsonProperty("work")
  private PhoneNumber work = null;

  @JsonProperty("mobile")
  private PhoneNumber mobile = null;

  @JsonProperty("mobileSecondary")
  private PhoneNumber mobileSecondary = null;

  @JsonProperty("company")
  private PhoneNumber company = null;

  @JsonProperty("fax")
  private PhoneNumber fax = null;

  @JsonProperty("other")
  private PhoneNumber other = null;

  public Phones home(PhoneNumber home) {
    this.home = home;
    return this;
  }

   /**
   * Where the customer is reachable when he/she is at home
   * @return home
  **/
  @ApiModelProperty(value = "Where the customer is reachable when he/she is at home")

  @Valid

  public PhoneNumber getHome() {
    return home;
  }

  public void setHome(PhoneNumber home) {
    this.home = home;
  }

  public Phones work(PhoneNumber work) {
    this.work = work;
    return this;
  }

   /**
   * Where the customer is reachable when he/she is at work
   * @return work
  **/
  @ApiModelProperty(value = "Where the customer is reachable when he/she is at work")

  @Valid

  public PhoneNumber getWork() {
    return work;
  }

  public void setWork(PhoneNumber work) {
    this.work = work;
  }

  public Phones mobile(PhoneNumber mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Mobile phone of the customer
   * @return mobile
  **/
  @ApiModelProperty(value = "Mobile phone of the customer")

  @Valid

  public PhoneNumber getMobile() {
    return mobile;
  }

  public void setMobile(PhoneNumber mobile) {
    this.mobile = mobile;
  }

  public Phones mobileSecondary(PhoneNumber mobileSecondary) {
    this.mobileSecondary = mobileSecondary;
    return this;
  }

   /**
   * Second mobile phone of the customer (e.g. from his/her work)
   * @return mobileSecondary
  **/
  @ApiModelProperty(value = "Second mobile phone of the customer (e.g. from his/her work)")

  @Valid

  public PhoneNumber getMobileSecondary() {
    return mobileSecondary;
  }

  public void setMobileSecondary(PhoneNumber mobileSecondary) {
    this.mobileSecondary = mobileSecondary;
  }

  public Phones company(PhoneNumber company) {
    this.company = company;
    return this;
  }

   /**
   * The general phone number of the customer's company; not to be confused with \"work\" number
   * @return company
  **/
  @ApiModelProperty(value = "The general phone number of the customer's company; not to be confused with \"work\" number")

  @Valid

  public PhoneNumber getCompany() {
    return company;
  }

  public void setCompany(PhoneNumber company) {
    this.company = company;
  }

  public Phones fax(PhoneNumber fax) {
    this.fax = fax;
    return this;
  }

   /**
   * A facsimile number (fax number) that can be used to reach the customer
   * @return fax
  **/
  @ApiModelProperty(value = "A facsimile number (fax number) that can be used to reach the customer")

  @Valid

  public PhoneNumber getFax() {
    return fax;
  }

  public void setFax(PhoneNumber fax) {
    this.fax = fax;
  }

  public Phones other(PhoneNumber other) {
    this.other = other;
    return this;
  }

   /**
   * Any customer's number that does not match any type from above, e.g. pager number
   * @return other
  **/
  @ApiModelProperty(value = "Any customer's number that does not match any type from above, e.g. pager number")

  @Valid

  public PhoneNumber getOther() {
    return other;
  }

  public void setOther(PhoneNumber other) {
    this.other = other;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phones phones = (Phones) o;
    return Objects.equals(this.home, phones.home) &&
        Objects.equals(this.work, phones.work) &&
        Objects.equals(this.mobile, phones.mobile) &&
        Objects.equals(this.mobileSecondary, phones.mobileSecondary) &&
        Objects.equals(this.company, phones.company) &&
        Objects.equals(this.fax, phones.fax) &&
        Objects.equals(this.other, phones.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(home, work, mobile, mobileSecondary, company, fax, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phones {\n");
    
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    mobileSecondary: ").append(toIndentedString(mobileSecondary)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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

