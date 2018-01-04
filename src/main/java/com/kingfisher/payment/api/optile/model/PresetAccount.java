package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * PresetAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class PresetAccount   {
  @JsonProperty("links")
  private PresetLinks links = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("maskedAccount")
  private AccountMask maskedAccount = null;

  public PresetAccount links(PresetLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Collection of links related to this preset network / account
   * @return links
  **/
  @ApiModelProperty(required = true, value = "Collection of links related to this preset network / account")
  @NotNull

  @Valid

  public PresetLinks getLinks() {
    return links;
  }

  public void setLinks(PresetLinks links) {
    this.links = links;
  }

  public PresetAccount code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code of preset payment network
   * @return code
  **/
  @ApiModelProperty(example = "MASTERCARD", required = true, value = "The code of preset payment network")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PresetAccount maskedAccount(AccountMask maskedAccount) {
    this.maskedAccount = maskedAccount;
    return this;
  }

   /**
   * Masked account of preset account; sensitive fields of the account are removed, truncated, or replaced with mask characters
   * @return maskedAccount
  **/
  @ApiModelProperty(value = "Masked account of preset account; sensitive fields of the account are removed, truncated, or replaced with mask characters")

  @Valid

  public AccountMask getMaskedAccount() {
    return maskedAccount;
  }

  public void setMaskedAccount(AccountMask maskedAccount) {
    this.maskedAccount = maskedAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresetAccount presetAccount = (PresetAccount) o;
    return Objects.equals(this.links, presetAccount.links) &&
        Objects.equals(this.code, presetAccount.code) &&
        Objects.equals(this.maskedAccount, presetAccount.maskedAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, code, maskedAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresetAccount {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    maskedAccount: ").append(toIndentedString(maskedAccount)).append("\n");
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

