package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClientInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class ClientInfo   {
  @JsonProperty("ip")
  private String ip = null;

  @JsonProperty("ipv6")
  private String ipv6 = null;

  @JsonProperty("userAgent")
  private String userAgent = null;

  @JsonProperty("acceptHeader")
  private String acceptHeader = null;

  @JsonProperty("cookieId")
  private String cookieId = null;

  @JsonProperty("deviceId")
  private String deviceId = null;

  public ClientInfo ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * The customer's IP v4 address, e.g. \"67.23.211.9\"; this can be used for risk management purposes
   * @return ip
  **/
  @ApiModelProperty(example = "67.23.211.9", value = "The customer's IP v4 address, e.g. \"67.23.211.9\"; this can be used for risk management purposes")


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public ClientInfo ipv6(String ipv6) {
    this.ipv6 = ipv6;
    return this;
  }

   /**
   * The customer's IP v6 address, e.g. \"2001:0db8:85a3:08d3:1319:8a2e:0370:7344\"; this can be used for risk management purposes
   * @return ipv6
  **/
  @ApiModelProperty(example = "2001:0db8:85a3:08d3:1319:8a2e:0370:7344", value = "The customer's IP v6 address, e.g. \"2001:0db8:85a3:08d3:1319:8a2e:0370:7344\"; this can be used for risk management purposes")


  public String getIpv6() {
    return ipv6;
  }

  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }

  public ClientInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * The userAgent header string as provided by the customer's client, e.g. browser; this can be used for payment network selection
   * @return userAgent
  **/
  @ApiModelProperty(example = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:55.0) Gecko/20100101 Firefox/55.0 ", value = "The userAgent header string as provided by the customer's client, e.g. browser; this can be used for payment network selection")


  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public ClientInfo acceptHeader(String acceptHeader) {
    this.acceptHeader = acceptHeader;
    return this;
  }

   /**
   * The accept header string as provided by the customer's client, e.g. browser
   * @return acceptHeader
  **/
  @ApiModelProperty(example = "text/html,application/xhtml+xml,application/xml;q=0.9,*_/_*;q=0.8", value = "The accept header string as provided by the customer's client, e.g. browser")


  public String getAcceptHeader() {
    return acceptHeader;
  }

  public void setAcceptHeader(String acceptHeader) {
    this.acceptHeader = acceptHeader;
  }

  public ClientInfo cookieId(String cookieId) {
    this.cookieId = cookieId;
    return this;
  }

   /**
   * Tracking cookie ID; could be used by merchant to track or refer customers' web clients
   * @return cookieId
  **/
  @ApiModelProperty(value = "Tracking cookie ID; could be used by merchant to track or refer customers' web clients")


  public String getCookieId() {
    return cookieId;
  }

  public void setCookieId(String cookieId) {
    this.cookieId = cookieId;
  }

  public ClientInfo deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Unique device ID of a smartphone; i.e. this ID is called by Apple \"UUID\" and by Google \"Android ID\"
   * @return deviceId
  **/
  @ApiModelProperty(example = "62c7c7034725345c065", value = "Unique device ID of a smartphone; i.e. this ID is called by Apple \"UUID\" and by Google \"Android ID\"")


  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientInfo clientInfo = (ClientInfo) o;
    return Objects.equals(this.ip, clientInfo.ip) &&
        Objects.equals(this.ipv6, clientInfo.ipv6) &&
        Objects.equals(this.userAgent, clientInfo.userAgent) &&
        Objects.equals(this.acceptHeader, clientInfo.acceptHeader) &&
        Objects.equals(this.cookieId, clientInfo.cookieId) &&
        Objects.equals(this.deviceId, clientInfo.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, ipv6, userAgent, acceptHeader, cookieId, deviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientInfo {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
    sb.append("    cookieId: ").append(toIndentedString(cookieId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

