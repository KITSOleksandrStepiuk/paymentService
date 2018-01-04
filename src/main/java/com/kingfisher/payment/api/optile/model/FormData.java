package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * FormData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class FormData   {
  @JsonProperty("account")
  private AccountFormData account = null;

  @JsonProperty("customer")
  private CustomerFormData customer = null;

  @JsonProperty("installments")
  private Installments installments = null;

  @JsonProperty("dataPrivacyConsentUrl")
  private String dataPrivacyConsentUrl = null;

  public FormData account(AccountFormData account) {
    this.account = account;
    return this;
  }

   /**
   * Account-related data to pre-fill a form
   * @return account
  **/
  @ApiModelProperty(value = "Account-related data to pre-fill a form")

  @Valid

  public AccountFormData getAccount() {
    return account;
  }

  public void setAccount(AccountFormData account) {
    this.account = account;
  }

  public FormData customer(CustomerFormData customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Customer-related data to pre-fill a form
   * @return customer
  **/
  @ApiModelProperty(value = "Customer-related data to pre-fill a form")

  @Valid

  public CustomerFormData getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerFormData customer) {
    this.customer = customer;
  }

  public FormData installments(Installments installments) {
    this.installments = installments;
    return this;
  }

   /**
   * Data about possible installments plans
   * @return installments
  **/
  @ApiModelProperty(value = "Data about possible installments plans")

  @Valid

  public Installments getInstallments() {
    return installments;
  }

  public void setInstallments(Installments installments) {
    this.installments = installments;
  }

  public FormData dataPrivacyConsentUrl(String dataPrivacyConsentUrl) {
    this.dataPrivacyConsentUrl = dataPrivacyConsentUrl;
    return this;
  }

   /**
   * URL to data privacy consent document.
   * @return dataPrivacyConsentUrl
  **/
  @ApiModelProperty(value = "URL to data privacy consent document.")


  public String getDataPrivacyConsentUrl() {
    return dataPrivacyConsentUrl;
  }

  public void setDataPrivacyConsentUrl(String dataPrivacyConsentUrl) {
    this.dataPrivacyConsentUrl = dataPrivacyConsentUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormData formData = (FormData) o;
    return Objects.equals(this.account, formData.account) &&
        Objects.equals(this.customer, formData.customer) &&
        Objects.equals(this.installments, formData.installments) &&
        Objects.equals(this.dataPrivacyConsentUrl, formData.dataPrivacyConsentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, installments, dataPrivacyConsentUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormData {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    dataPrivacyConsentUrl: ").append(toIndentedString(dataPrivacyConsentUrl)).append("\n");
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

