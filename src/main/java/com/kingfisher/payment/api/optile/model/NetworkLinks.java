package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Collection of URLs to build the account form for this payment network and perform different actions with entered account. 
 */
@ApiModel(description = "Collection of URLs to build the account form for this payment network and perform different actions with entered account. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class NetworkLinks   {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("operation")
  private String operation = null;

  @JsonProperty("validation")
  private String validation = null;

  @JsonProperty("logo")
  private String logo = null;

  @JsonProperty("form")
  private String form = null;

  @JsonProperty("localizedForm")
  private String localizedForm = null;

  @JsonProperty("lang")
  private String lang = null;

  @JsonProperty("iFrame")
  private String iFrame = null;

  public NetworkLinks self(String self) {
    this.self = self;
    return this;
  }

   /**
   * URL to retrieve details about this payment network in context of initialized `LIST`
   * @return self
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/lists/59e0b7b82d264cgpi06c88r4dl/VISA", required = true, value = "URL to retrieve details about this payment network in context of initialized `LIST`")
  @NotNull


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public NetworkLinks operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * URL where operation data should be submitted (POSTed), if customer has decided to pay with this payment network
   * @return operation
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/lists/59e0b7b82d264cgpi06c88r4dl/VISA/charge", value = "URL where operation data should be submitted (POSTed), if customer has decided to pay with this payment network")


  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public NetworkLinks validation(String validation) {
    this.validation = validation;
    return this;
  }

   /**
   * URL to submit account for in-page validation if supported
   * @return validation
  **/
  @ApiModelProperty(example = "https://api.sandbox.oscato.com/pci/v1/59e0b7b82d264cgpi06c88r4dl/MYSHOP/de_DE/VISA/standard/validate", value = "URL to submit account for in-page validation if supported")


  public String getValidation() {
    return validation;
  }

  public void setValidation(String validation) {
    this.validation = validation;
  }

  public NetworkLinks logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * URL of this payment network logo (image)
   * @return logo
  **/
  @ApiModelProperty(example = "https://resources.sandbox.oscato.com/resource/network/MYSHOP/de_DE/VISA/logo.png", required = true, value = "URL of this payment network logo (image)")
  @NotNull


  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public NetworkLinks form(String form) {
    this.form = form;
    return this;
  }

   /**
   * URL to retrieve an account form template; template is an HTML snippet with account elements and message placeholders
   * @return form
  **/
  @ApiModelProperty(example = "https://resources.sandbox.oscato.com/resource/form/VISA/standard.html", value = "URL to retrieve an account form template; template is an HTML snippet with account elements and message placeholders")


  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }

  public NetworkLinks localizedForm(String localizedForm) {
    this.localizedForm = localizedForm;
    return this;
  }

   /**
   * URL to retrieve localized representation of account form; text placeholders are replaced by text in corresponding language, language is defined by `LIST` session 
   * @return localizedForm
  **/
  @ApiModelProperty(example = "https://resources.sandbox.oscato.com/resource/form/MYSHOP/DE/de_DE/VISA/standard.html", value = "URL to retrieve localized representation of account form; text placeholders are replaced by text in corresponding language, language is defined by `LIST` session ")


  public String getLocalizedForm() {
    return localizedForm;
  }

  public void setLocalizedForm(String localizedForm) {
    this.localizedForm = localizedForm;
  }

  public NetworkLinks lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * URL of language file that contains labels and messages to localize account forms and display errors for this payment network; language file is provided in Java properties format; see http://en.wikipedia.org/wiki/.properties 
   * @return lang
  **/
  @ApiModelProperty(example = "https://resources.sandbox.oscato.com/resource/lang/MYSHOP/de_DE/VISA.properties", required = true, value = "URL of language file that contains labels and messages to localize account forms and display errors for this payment network; language file is provided in Java properties format; see http://en.wikipedia.org/wiki/.properties ")
  @NotNull


  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public NetworkLinks iFrame(String iFrame) {
    this.iFrame = iFrame;
    return this;
  }

   /**
   * URL of iFrame what should been shown to the customer to collect account data; Present only in the case when `LIST` session was initilaized with `SELECTIVE_NATIVE` integration type 
   * @return iFrame
  **/
  @ApiModelProperty(example = "https://resources.sandbox.oscato.com/paymentpage/iframe.html?listId=59e0b7b82d264cgpi06c88r4dl&network=VISA", value = "URL of iFrame what should been shown to the customer to collect account data; Present only in the case when `LIST` session was initilaized with `SELECTIVE_NATIVE` integration type ")


  public String getIFrame() {
    return iFrame;
  }

  public void setIFrame(String iFrame) {
    this.iFrame = iFrame;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkLinks networkLinks = (NetworkLinks) o;
    return Objects.equals(this.self, networkLinks.self) &&
        Objects.equals(this.operation, networkLinks.operation) &&
        Objects.equals(this.validation, networkLinks.validation) &&
        Objects.equals(this.logo, networkLinks.logo) &&
        Objects.equals(this.form, networkLinks.form) &&
        Objects.equals(this.localizedForm, networkLinks.localizedForm) &&
        Objects.equals(this.lang, networkLinks.lang) &&
        Objects.equals(this.iFrame, networkLinks.iFrame);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, operation, validation, logo, form, localizedForm, lang, iFrame);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    localizedForm: ").append(toIndentedString(localizedForm)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    iFrame: ").append(toIndentedString(iFrame)).append("\n");
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

