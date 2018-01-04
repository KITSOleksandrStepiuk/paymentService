package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Identification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Identification   {
  @JsonProperty("longId")
  private String longId = null;

  @JsonProperty("shortId")
  private String shortId = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("pspId")
  private String pspId = null;

  @JsonProperty("institutionId")
  private String institutionId = null;

  public Identification longId(String longId) {
    this.longId = longId;
    return this;
  }

   /**
   * Globally unique operation identifier assigned by OPG platform
   * @return longId
  **/
  @ApiModelProperty(example = "59e48b51018709cc7cc", required = true, value = "Globally unique operation identifier assigned by OPG platform")
  @NotNull


  public String getLongId() {
    return longId;
  }

  public void setLongId(String longId) {
    this.longId = longId;
  }

  public Identification shortId(String shortId) {
    this.shortId = shortId;
    return this;
  }

   /**
   * Short identifier assigned by OPG platform to operation; unlike longId this identifier is not guaranteed to be unique
   * @return shortId
  **/
  @ApiModelProperty(example = "03059-69977", required = true, value = "Short identifier assigned by OPG platform to operation; unlike longId this identifier is not guaranteed to be unique")
  @NotNull


  public String getShortId() {
    return shortId;
  }

  public void setShortId(String shortId) {
    this.shortId = shortId;
  }

  public Identification transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Original transaction ID provided by merchant during `LIST` session initialization, or during recurring `CHARGE`
   * @return transactionId
  **/
  @ApiModelProperty(example = "order-00008312", required = true, value = "Original transaction ID provided by merchant during `LIST` session initialization, or during recurring `CHARGE`")
  @NotNull


  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Identification pspId(String pspId) {
    this.pspId = pspId;
    return this;
  }

   /**
   * ID assigned by PSP if successful communication with PSP took place in scope of this operation
   * @return pspId
  **/
  @ApiModelProperty(example = "31HA07BC8138E78D0391337D8AFED8AA", value = "ID assigned by PSP if successful communication with PSP took place in scope of this operation")


  public String getPspId() {
    return pspId;
  }

  public void setPspId(String pspId) {
    this.pspId = pspId;
  }

  public Identification institutionId(String institutionId) {
    this.institutionId = institutionId;
    return this;
  }

   /**
   * ID assigned by financial institution if successful communication with institution took place in scope of this operation
   * @return institutionId
  **/
  @ApiModelProperty(value = "ID assigned by financial institution if successful communication with institution took place in scope of this operation")


  public String getInstitutionId() {
    return institutionId;
  }

  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identification identification = (Identification) o;
    return Objects.equals(this.longId, identification.longId) &&
        Objects.equals(this.shortId, identification.shortId) &&
        Objects.equals(this.transactionId, identification.transactionId) &&
        Objects.equals(this.pspId, identification.pspId) &&
        Objects.equals(this.institutionId, identification.institutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longId, shortId, transactionId, pspId, institutionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identification {\n");
    
    sb.append("    longId: ").append(toIndentedString(longId)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    pspId: ").append(toIndentedString(pspId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
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

