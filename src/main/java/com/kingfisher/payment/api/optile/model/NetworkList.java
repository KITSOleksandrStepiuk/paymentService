package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * NetworkList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class NetworkList   {
  @JsonProperty("links")
  private ListLinks links = null;

  @JsonProperty("timestamp")
//  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
  private DateTime timestamp = null;

  /**
   * Type of this operation
   */
  public enum OperationEnum {
    LIST("LIST");

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

  @JsonProperty("resultCode")
  private String resultCode = null;

  @JsonProperty("resultInfo")
  private String resultInfo = null;

  @JsonProperty("returnCode")
  private ReturnCode returnCode = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("interaction")
  private Interaction interaction = null;

  @JsonProperty("identification")
  private Identification identification = null;

  @JsonProperty("accounts")
  private List<AccountRegistration> accounts = null;

  @JsonProperty("networks")
  private Networks networks = null;

  @JsonProperty("extraElements")
  private ExtraElements extraElements = null;

  @JsonProperty("redirect")
  private Redirect redirect = null;

  @JsonProperty("presetAccount")
  private PresetAccount presetAccount = null;

  /**
   * Types of operaton what could been triggered by `LIST` session
   */
  public enum OperationTypeEnum {
    CHARGE("CHARGE"),
    
    PAYOUT("PAYOUT"),
    
    PRESET("PRESET"),
    
    UPDATE("UPDATE");

    private String value;

    OperationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationTypeEnum fromValue(String text) {
      for (OperationTypeEnum b : OperationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operationType")
  private OperationTypeEnum operationType = null;

  public NetworkList links(ListLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Collection of links related to this `LIST` session
   * @return links
  **/
  @ApiModelProperty(required = true, value = "Collection of links related to this `LIST` session")
  @NotNull

  @Valid

  public ListLinks getLinks() {
    return links;
  }

  public void setLinks(ListLinks links) {
    this.links = links;
  }

  public NetworkList timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Date and time this `LIST` session was initialized at
   * @return timestamp
  **/
  @ApiModelProperty(example = "2017-09-27T13:18:42.940+0000", required = true, value = "Date and time this `LIST` session was initialized at")
  @NotNull

  @Valid

  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public NetworkList operation(OperationEnum operation) {
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

  public NetworkList resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Result code of this `LIST` initialization; see see list of all [Result Codes](https://www.optile.io/opg#294007)
   * @return resultCode
  **/
  @ApiModelProperty(example = "00000.11.000", required = true, value = "Result code of this `LIST` initialization; see see list of all [Result Codes](https://www.optile.io/opg#294007)")
  @NotNull


  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  public NetworkList resultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * Descriptive information that complements the result code and interaction advice
   * @return resultInfo
  **/
  @ApiModelProperty(example = "5 applicable and 2 registered networks are found", required = true, value = "Descriptive information that complements the result code and interaction advice")
  @NotNull


  public String getResultInfo() {
    return resultInfo;
  }

  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
  }

  public NetworkList returnCode(ReturnCode returnCode) {
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

  public NetworkList status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Current status of this `LIST` session; see list of all [Status Codes](https://www.optile.io/opg#285186)
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Current status of this `LIST` session; see list of all [Status Codes](https://www.optile.io/opg#285186)")
  @NotNull

  @Valid

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public NetworkList interaction(Interaction interaction) {
    this.interaction = interaction;
    return this;
  }

   /**
   * Interaction advice for this `LIST` session according to its current state
   * @return interaction
  **/
  @ApiModelProperty(required = true, value = "Interaction advice for this `LIST` session according to its current state")
  @NotNull

  @Valid

  public Interaction getInteraction() {
    return interaction;
  }

  public void setInteraction(Interaction interaction) {
    this.interaction = interaction;
  }

  public NetworkList identification(Identification identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Collection of identification information (references) for this `LIST` session
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Collection of identification information (references) for this `LIST` session")
  @NotNull

  @Valid

  public Identification getIdentification() {
    return identification;
  }

  public void setIdentification(Identification identification) {
    this.identification = identification;
  }

  public NetworkList accounts(List<AccountRegistration> accounts) {
    this.accounts = accounts;
    return this;
  }

  public NetworkList addAccountsItem(AccountRegistration accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<AccountRegistration>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Collection of registered accounts (if available) for recurring customer
   * @return accounts
  **/
  @ApiModelProperty(value = "Collection of registered accounts (if available) for recurring customer")

  @Valid

  public List<AccountRegistration> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccountRegistration> accounts) {
    this.accounts = accounts;
  }

  public NetworkList networks(Networks networks) {
    this.networks = networks;
    return this;
  }

   /**
   * Payment networks applicable for this `LIST` session
   * @return networks
  **/
  @ApiModelProperty(value = "Payment networks applicable for this `LIST` session")

  @Valid

  public Networks getNetworks() {
    return networks;
  }

  public void setNetworks(Networks networks) {
    this.networks = networks;
  }

  public NetworkList extraElements(ExtraElements extraElements) {
    this.extraElements = extraElements;
    return this;
  }

   /**
   * Extra elements that should be rendered on payment page; intended for additional labels and checkboxes
   * @return extraElements
  **/
  @ApiModelProperty(value = "Extra elements that should be rendered on payment page; intended for additional labels and checkboxes")

  @Valid

  public ExtraElements getExtraElements() {
    return extraElements;
  }

  public void setExtraElements(ExtraElements extraElements) {
    this.extraElements = extraElements;
  }

  public NetworkList redirect(Redirect redirect) {
    this.redirect = redirect;
    return this;
  }

   /**
   * If present, merchant is advised to redirect customer to corresponding redirect URL; applicable for hosted integration scenario, will lead to payment page hosted by optile 
   * @return redirect
  **/
  @ApiModelProperty(value = "If present, merchant is advised to redirect customer to corresponding redirect URL; applicable for hosted integration scenario, will lead to payment page hosted by optile ")

  @Valid

  public Redirect getRedirect() {
    return redirect;
  }

  public void setRedirect(Redirect redirect) {
    this.redirect = redirect;
  }

  public NetworkList presetAccount(PresetAccount presetAccount) {
    this.presetAccount = presetAccount;
    return this;
  }

   /**
   * An information about alredy preset network / account in this `LIST` session; present only in `LIST` session with `presetFirst` option 
   * @return presetAccount
  **/
  @ApiModelProperty(value = "An information about alredy preset network / account in this `LIST` session; present only in `LIST` session with `presetFirst` option ")

  @Valid

  public PresetAccount getPresetAccount() {
    return presetAccount;
  }

  public void setPresetAccount(PresetAccount presetAccount) {
    this.presetAccount = presetAccount;
  }

  public NetworkList operationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Types of operaton what could been triggered by `LIST` session
   * @return operationType
  **/
  @ApiModelProperty(value = "Types of operaton what could been triggered by `LIST` session")


  public OperationTypeEnum getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationTypeEnum operationType) {
    this.operationType = operationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkList networkList = (NetworkList) o;
    return Objects.equals(this.links, networkList.links) &&
        Objects.equals(this.timestamp, networkList.timestamp) &&
        Objects.equals(this.operation, networkList.operation) &&
        Objects.equals(this.resultCode, networkList.resultCode) &&
        Objects.equals(this.resultInfo, networkList.resultInfo) &&
        Objects.equals(this.returnCode, networkList.returnCode) &&
        Objects.equals(this.status, networkList.status) &&
        Objects.equals(this.interaction, networkList.interaction) &&
        Objects.equals(this.identification, networkList.identification) &&
        Objects.equals(this.accounts, networkList.accounts) &&
        Objects.equals(this.networks, networkList.networks) &&
        Objects.equals(this.extraElements, networkList.extraElements) &&
        Objects.equals(this.redirect, networkList.redirect) &&
        Objects.equals(this.presetAccount, networkList.presetAccount) &&
        Objects.equals(this.operationType, networkList.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, timestamp, operation, resultCode, resultInfo, returnCode, status, interaction, identification, accounts, networks, extraElements, redirect, presetAccount, operationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkList {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    interaction: ").append(toIndentedString(interaction)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    extraElements: ").append(toIndentedString(extraElements)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    presetAccount: ").append(toIndentedString(presetAccount)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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

