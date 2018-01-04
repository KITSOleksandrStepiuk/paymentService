package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Charge
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Charge   {
  @JsonProperty("links")
  private ChargeLinks links = null;

  @JsonProperty("timestamp")
  private DateTime timestamp = null;

  /**
   * Type of this operation
   */
  public enum OperationEnum {
    CHARGE("CHARGE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation = null;

  @JsonProperty("network")
  private String network = null;

  @JsonProperty("maskedAccount")
  private AccountMask maskedAccount = null;

  @JsonProperty("resultCode")
  private String resultCode = null;

  @JsonProperty("resultInfo")
  private String resultInfo = null;

  @JsonProperty("pspCode")
  private String pspCode = null;

  @JsonProperty("institutionCode")
  private String institutionCode = null;

  @JsonProperty("returnCode")
  private ReturnCode returnCode = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("interaction")
  private Interaction interaction = null;

  @JsonProperty("clearing")
  private Clearing clearing = null;

  @JsonProperty("identification")
  private Identification identification = null;

  @JsonProperty("redirect")
  private Redirect redirect = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("mandate")
  private Mandate mandate = null;

  public Charge links(ChargeLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Collection of links related to this `CHARGE` operation
   * @return links
  **/
  @ApiModelProperty(required = true, value = "Collection of links related to this `CHARGE` operation")
  @NotNull

  @Valid

  public ChargeLinks getLinks() {
    return links;
  }

  public void setLinks(ChargeLinks links) {
    this.links = links;
  }

  public Charge timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Date and time this `CHARGE` was initiated at
   * @return timestamp
  **/
  @ApiModelProperty(example = "2017-09-22T13:53:46.410+0000", required = true, value = "Date and time this `CHARGE` was initiated at")
  @NotNull

  @Valid

  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Charge operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Type of this operation
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "Type of this operation")
  @NotNull


  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public Charge network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Network code of this operation
   * @return network
  **/
  @ApiModelProperty(example = "AMEX", required = true, value = "Network code of this operation")
  @NotNull


  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public Charge maskedAccount(AccountMask maskedAccount) {
    this.maskedAccount = maskedAccount;
    return this;
  }

   /**
   * Masked account of used account; sensitive fields of the account are removed, truncated, or replaced with mask characters
   * @return maskedAccount
  **/
  @ApiModelProperty(value = "Masked account of used account; sensitive fields of the account are removed, truncated, or replaced with mask characters")

  @Valid

  public AccountMask getMaskedAccount() {
    return maskedAccount;
  }

  public void setMaskedAccount(AccountMask maskedAccount) {
    this.maskedAccount = maskedAccount;
  }

  public Charge resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Result code of this `CHARGE` that reflects current state; see list of all [Result Codes](https://www.optile.io/opg#294007)
   * @return resultCode
  **/
  @ApiModelProperty(example = "45000.HEIDELPAY.800.100.152", required = true, value = "Result code of this `CHARGE` that reflects current state; see list of all [Result Codes](https://www.optile.io/opg#294007)")
  @NotNull


  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  public Charge resultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * Descriptive information that complements the result code and interaction advice
   * @return resultInfo
  **/
  @ApiModelProperty(example = "AUTHORIZATION_VALIDATION: transaction declined by authorization system", required = true, value = "Descriptive information that complements the result code and interaction advice")
  @NotNull


  public String getResultInfo() {
    return resultInfo;
  }

  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
  }

  public Charge pspCode(String pspCode) {
    this.pspCode = pspCode;
    return this;
  }

   /**
   * Code of a PSP service that was involved into this operation processing; every PSP has a unique code assigned by OPG platform
   * @return pspCode
  **/
  @ApiModelProperty(example = "HEIDELPAY", value = "Code of a PSP service that was involved into this operation processing; every PSP has a unique code assigned by OPG platform")


  public String getPspCode() {
    return pspCode;
  }

  public void setPspCode(String pspCode) {
    this.pspCode = pspCode;
  }

  public Charge institutionCode(String institutionCode) {
    this.institutionCode = institutionCode;
    return this;
  }

   /**
   * Code of a financial institution service that was involved into this operation processing; every financial institution has a unique code assigned by OPG platform 
   * @return institutionCode
  **/
  @ApiModelProperty(value = "Code of a financial institution service that was involved into this operation processing; every financial institution has a unique code assigned by OPG platform ")


  public String getInstitutionCode() {
    return institutionCode;
  }

  public void setInstitutionCode(String institutionCode) {
    this.institutionCode = institutionCode;
  }

  public Charge returnCode(ReturnCode returnCode) {
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

  public Charge status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Current status of this CHARGE; see list of all [Status Codes](https://www.optile.io/opg#285186)
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Current status of this CHARGE; see list of all [Status Codes](https://www.optile.io/opg#285186)")
  @NotNull

  @Valid

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Charge interaction(Interaction interaction) {
    this.interaction = interaction;
    return this;
  }

   /**
   * Interaction advice for this `CHARGE` according to its current state
   * @return interaction
  **/
  @ApiModelProperty(required = true, value = "Interaction advice for this `CHARGE` according to its current state")
  @NotNull

  @Valid

  public Interaction getInteraction() {
    return interaction;
  }

  public void setInteraction(Interaction interaction) {
    this.interaction = interaction;
  }

  public Charge clearing(Clearing clearing) {
    this.clearing = clearing;
    return this;
  }

   /**
   * Clearing object provides information on the transaction as it had been processed
   * @return clearing
  **/
  @ApiModelProperty(value = "Clearing object provides information on the transaction as it had been processed")

  @Valid

  public Clearing getClearing() {
    return clearing;
  }

  public void setClearing(Clearing clearing) {
    this.clearing = clearing;
  }

  public Charge identification(Identification identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Collection of identification information (references) for this CHARGE
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Collection of identification information (references) for this CHARGE")
  @NotNull

  @Valid

  public Identification getIdentification() {
    return identification;
  }

  public void setIdentification(Identification identification) {
    this.identification = identification;
  }

  public Charge redirect(Redirect redirect) {
    this.redirect = redirect;
    return this;
  }

   /**
   * If present, merchant is advised to redirect customer to corresponding redirect URL; this will lead to either PSP web-site to complete initiated payment, or it will be pointing to one of the merchants callback URLs from `LIST` session 
   * @return redirect
  **/
  @ApiModelProperty(value = "If present, merchant is advised to redirect customer to corresponding redirect URL; this will lead to either PSP web-site to complete initiated payment, or it will be pointing to one of the merchants callback URLs from `LIST` session ")

  @Valid

  public Redirect getRedirect() {
    return redirect;
  }

  public void setRedirect(Redirect redirect) {
    this.redirect = redirect;
  }

  public Charge customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Holds customer's data; includes customer registration information, which is essential for recurring payments; see [Recurring Charges](https://www.optile.io/opg#628670) 
   * @return customer
  **/
  @ApiModelProperty(value = "Holds customer's data; includes customer registration information, which is essential for recurring payments; see [Recurring Charges](https://www.optile.io/opg#628670) ")

  @Valid

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Charge mandate(Mandate mandate) {
    this.mandate = mandate;
    return this;
  }

   /**
   * Mandate information required for SEPA payment networks processing; duplicates data from request (Transaction / Operation object), or reflects information generated by PSP 
   * @return mandate
  **/
  @ApiModelProperty(value = "Mandate information required for SEPA payment networks processing; duplicates data from request (Transaction / Operation object), or reflects information generated by PSP ")

  @Valid

  public Mandate getMandate() {
    return mandate;
  }

  public void setMandate(Mandate mandate) {
    this.mandate = mandate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.links, charge.links) &&
        Objects.equals(this.timestamp, charge.timestamp) &&
        Objects.equals(this.operation, charge.operation) &&
        Objects.equals(this.network, charge.network) &&
        Objects.equals(this.maskedAccount, charge.maskedAccount) &&
        Objects.equals(this.resultCode, charge.resultCode) &&
        Objects.equals(this.resultInfo, charge.resultInfo) &&
        Objects.equals(this.pspCode, charge.pspCode) &&
        Objects.equals(this.institutionCode, charge.institutionCode) &&
        Objects.equals(this.returnCode, charge.returnCode) &&
        Objects.equals(this.status, charge.status) &&
        Objects.equals(this.interaction, charge.interaction) &&
        Objects.equals(this.clearing, charge.clearing) &&
        Objects.equals(this.identification, charge.identification) &&
        Objects.equals(this.redirect, charge.redirect) &&
        Objects.equals(this.customer, charge.customer) &&
        Objects.equals(this.mandate, charge.mandate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, timestamp, operation, network, maskedAccount, resultCode, resultInfo, pspCode, institutionCode, returnCode, status, interaction, clearing, identification, redirect, customer, mandate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    maskedAccount: ").append(toIndentedString(maskedAccount)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    pspCode: ").append(toIndentedString(pspCode)).append("\n");
    sb.append("    institutionCode: ").append(toIndentedString(institutionCode)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    interaction: ").append(toIndentedString(interaction)).append("\n");
    sb.append("    clearing: ").append(toIndentedString(clearing)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
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

