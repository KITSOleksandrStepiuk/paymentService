package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * RecurringCallback
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class RecurringCallback   {
  @JsonProperty("notificationUrl")
  private String notificationUrl = null;

  public RecurringCallback notificationUrl(String notificationUrl) {
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
    RecurringCallback recurringCallback = (RecurringCallback) o;
    return Objects.equals(this.notificationUrl, recurringCallback.notificationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringCallback {\n");
    
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

