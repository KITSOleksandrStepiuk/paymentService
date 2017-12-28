package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.MandateAuthentication;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mandate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Mandate   {
  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("creditorId")
  private String creditorId = null;

  @JsonProperty("authentication")
  private MandateAuthentication authentication = null;

  public Mandate reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The SEPA mandate reference (aka Mandate ID) proposed by the merchant; has to be unique in the scope of his creditorId
   * @return reference
  **/
  @ApiModelProperty(example = "12980_W6456187767", required = true, value = "The SEPA mandate reference (aka Mandate ID) proposed by the merchant; has to be unique in the scope of his creditorId")
  @NotNull


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Mandate creditorId(String creditorId) {
    this.creditorId = creditorId;
    return this;
  }

   /**
   * The SEPA creditor ID of the merchant; could also be configured for some PSP within a contract, then this parameter is optional; in case when PSP uses its own creditor ID it will be returned in reply and status notification 
   * @return creditorId
  **/
  @ApiModelProperty(example = "CH07ZZZ00000012345", value = "The SEPA creditor ID of the merchant; could also be configured for some PSP within a contract, then this parameter is optional; in case when PSP uses its own creditor ID it will be returned in reply and status notification ")


  public String getCreditorId() {
    return creditorId;
  }

  public void setCreditorId(String creditorId) {
    this.creditorId = creditorId;
  }

  public Mandate authentication(MandateAuthentication authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Required by some PSPs for SEPA transactions
   * @return authentication
  **/
  @ApiModelProperty(value = "Required by some PSPs for SEPA transactions")

  @Valid

  public MandateAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(MandateAuthentication authentication) {
    this.authentication = authentication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mandate mandate = (Mandate) o;
    return Objects.equals(this.reference, mandate.reference) &&
        Objects.equals(this.creditorId, mandate.creditorId) &&
        Objects.equals(this.authentication, mandate.authentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, creditorId, authentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandate {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
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

