package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kingfisher.payment.api.validator.annotation.DisallowedField;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Callback
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Callback   {
  @JsonProperty("returnUrl")
  private String returnUrl = null;

  @JsonProperty("summaryUrl")
  private String summaryUrl = null;

  @JsonProperty("cancelUrl")
  private String cancelUrl = null;

  @JsonProperty("notificationUrl")
  @DisallowedField
  private String notificationUrl = null;

  public Callback returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * URL of landing page in merchants shop system for successful payment; the customer will be redirected to this URL after successful purchase 
   * @return returnUrl
  **/
  @ApiModelProperty(required = true, value = "URL of landing page in merchants shop system for successful payment; the customer will be redirected to this URL after successful purchase ")
  @NotNull


  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public Callback summaryUrl(String summaryUrl) {
    this.summaryUrl = summaryUrl;
    return this;
  }

   /**
   * URL of landing page in merchants shop system after customer select payment method; this URL is mandatory for the `LIST` session with `presetFirst` option 
   * @return summaryUrl
  **/
  @ApiModelProperty(value = "URL of landing page in merchants shop system after customer select payment method; this URL is mandatory for the `LIST` session with `presetFirst` option ")


  public String getSummaryUrl() {
    return summaryUrl;
  }

  public void setSummaryUrl(String summaryUrl) {
    this.summaryUrl = summaryUrl;
  }

  public Callback cancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * URL of landing page in merchants shop system for cancelled or failed payment; the customer will be redirected to this URL after canceled or permanently failed purchase 
   * @return cancelUrl
  **/
  @ApiModelProperty(required = true, value = "URL of landing page in merchants shop system for cancelled or failed payment; the customer will be redirected to this URL after canceled or permanently failed purchase ")
  @NotNull


  public String getCancelUrl() {
    return cancelUrl;
  }

  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  public Callback notificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
    return this;
  }

   /**
   * Notification URL; the OPG system will send asynchronous status notifications about this payment to this URL
   * @return notificationUrl
  **/
  @ApiModelProperty(value = "Notification URL; the OPG system will send asynchronous status notifications about this payment to this URL")


  public String getNotificationUrl() {
    return notificationUrl;
  }

  public void setNotificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Callback callback = (Callback) o;
    return Objects.equals(this.returnUrl, callback.returnUrl) &&
        Objects.equals(this.summaryUrl, callback.summaryUrl) &&
        Objects.equals(this.cancelUrl, callback.cancelUrl) &&
        Objects.equals(this.notificationUrl, callback.notificationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnUrl, summaryUrl, cancelUrl, notificationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Callback {\n");
    
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    summaryUrl: ").append(toIndentedString(summaryUrl)).append("\n");
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
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

