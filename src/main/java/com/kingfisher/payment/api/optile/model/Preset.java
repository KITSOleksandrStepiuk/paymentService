package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Preset
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Preset   {
  @JsonProperty("links")
  private PresetLinks links = null;

  @JsonProperty("resultInfo")
  private String resultInfo = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("redirect")
  private Redirect redirect = null;

  @JsonProperty("network")
  private String network = null;

  @JsonProperty("maskedAccount")
  private AccountMask maskedAccount = null;

  @JsonProperty("interaction")
  private Interaction interaction = null;

  @JsonProperty("resultCode")
  private String resultCode = null;

  @JsonProperty("returnCode")
  private ReturnCode returnCode = null;

  @JsonProperty("identification")
  private Identification identification = null;

  @JsonProperty("timestamp")
  private DateTime timestamp = null;

  public Preset links(PresetLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Collection of links related to this `PRESET` operation
   * @return links
  **/
  @ApiModelProperty(required = true, value = "Collection of links related to this `PRESET` operation")
  @NotNull

  @Valid

  public PresetLinks getLinks() {
    return links;
  }

  public void setLinks(PresetLinks links) {
    this.links = links;
  }

  public Preset resultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * Descriptive information that complements the result code and interaction advice
   * @return resultInfo
  **/
  @ApiModelProperty(required = true, value = "Descriptive information that complements the result code and interaction advice")
  @NotNull


  public String getResultInfo() {
    return resultInfo;
  }

  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
  }

  public Preset status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Current status of this PRESET; see list of all [Status Codes](https://www.optile.io/opg#285186)
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Current status of this PRESET; see list of all [Status Codes](https://www.optile.io/opg#285186)")
  @NotNull

  @Valid

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Preset redirect(Redirect redirect) {
    this.redirect = redirect;
    return this;
  }

   /**
   * If present, merchant is advised to redirect customer to corresponding redirect URL; this will lead to either PSP web-site to complete initiated `PRESET`, or it will be pointing to one of the merchants callback URLs from `LIST` session 
   * @return redirect
  **/
  @ApiModelProperty(value = "If present, merchant is advised to redirect customer to corresponding redirect URL; this will lead to either PSP web-site to complete initiated `PRESET`, or it will be pointing to one of the merchants callback URLs from `LIST` session ")

  @Valid

  public Redirect getRedirect() {
    return redirect;
  }

  public void setRedirect(Redirect redirect) {
    this.redirect = redirect;
  }

  public Preset network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Network code of preset network / account
   * @return network
  **/
  @ApiModelProperty(required = true, value = "Network code of preset network / account")
  @NotNull


  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public Preset maskedAccount(AccountMask maskedAccount) {
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

  public Preset interaction(Interaction interaction) {
    this.interaction = interaction;
    return this;
  }

   /**
   * Interaction advice for this `PRESET` according to its current state
   * @return interaction
  **/
  @ApiModelProperty(required = true, value = "Interaction advice for this `PRESET` according to its current state")
  @NotNull

  @Valid

  public Interaction getInteraction() {
    return interaction;
  }

  public void setInteraction(Interaction interaction) {
    this.interaction = interaction;
  }

  public Preset resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Result code of this `PRESET` that reflects current state; see list of all [Result Codes](https://www.optile.io/opg#294007)
   * @return resultCode
  **/
  @ApiModelProperty(required = true, value = "Result code of this `PRESET` that reflects current state; see list of all [Result Codes](https://www.optile.io/opg#294007)")
  @NotNull


  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  public Preset returnCode(ReturnCode returnCode) {
    this.returnCode = returnCode;
    return this;
  }

   /**
   * Complements `resultCode` property with information about unified name and source of the operation code
   * @return returnCode
  **/
  @ApiModelProperty(value = "Complements `resultCode` property with information about unified name and source of the operation code")

  @Valid

  public ReturnCode getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(ReturnCode returnCode) {
    this.returnCode = returnCode;
  }

  public Preset identification(Identification identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Collection of identification information (references) for this PRESET
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Collection of identification information (references) for this PRESET")
  @NotNull

  @Valid

  public Identification getIdentification() {
    return identification;
  }

  public void setIdentification(Identification identification) {
    this.identification = identification;
  }

  public Preset timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Date and time this `PRESET` was initiated at
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Date and time this `PRESET` was initiated at")
  @NotNull

  @Valid

  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preset preset = (Preset) o;
    return Objects.equals(this.links, preset.links) &&
        Objects.equals(this.resultInfo, preset.resultInfo) &&
        Objects.equals(this.status, preset.status) &&
        Objects.equals(this.redirect, preset.redirect) &&
        Objects.equals(this.network, preset.network) &&
        Objects.equals(this.maskedAccount, preset.maskedAccount) &&
        Objects.equals(this.interaction, preset.interaction) &&
        Objects.equals(this.resultCode, preset.resultCode) &&
        Objects.equals(this.returnCode, preset.returnCode) &&
        Objects.equals(this.identification, preset.identification) &&
        Objects.equals(this.timestamp, preset.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, resultInfo, status, redirect, network, maskedAccount, interaction, resultCode, returnCode, identification, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preset {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    maskedAccount: ").append(toIndentedString(maskedAccount)).append("\n");
    sb.append("    interaction: ").append(toIndentedString(interaction)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

