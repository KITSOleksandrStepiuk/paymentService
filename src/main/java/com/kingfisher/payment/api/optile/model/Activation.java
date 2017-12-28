package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.joda.time.DateTime;
import java.util.Objects;

/**
 * Activation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Activation   {
  @JsonProperty("links")
  private ActivationLinks links = null;

  @JsonProperty("timestamp")
  private DateTime timestamp = null;

  /**
   * Type of this operation
   */
  public enum OperationEnum {
    ACTIVATION("ACTIVATION");

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

  @JsonProperty("activated")
  private ApplicableNetwork activated = null;

  public Activation links(ActivationLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Collection of links related to this `ACTIVATION` operation
   * @return links
  **/
  @ApiModelProperty(required = true, value = "Collection of links related to this `ACTIVATION` operation")
  @NotNull

  @Valid

  public ActivationLinks getLinks() {
    return links;
  }

  public void setLinks(ActivationLinks links) {
    this.links = links;
  }

  public Activation timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Date and time this `ACTIVATION` was initiated at
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Date and time this `ACTIVATION` was initiated at")
  @NotNull

  @Valid

  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Activation operation(OperationEnum operation) {
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

  public Activation resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Result code of this `ACTIVATION` that reflects current state; see list of all [Result Codes](https://www.optile.io/opg#294007)
   * @return resultCode
  **/
  @ApiModelProperty(required = true, value = "Result code of this `ACTIVATION` that reflects current state; see list of all [Result Codes](https://www.optile.io/opg#294007)")
  @NotNull


  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  public Activation resultInfo(String resultInfo) {
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

  public Activation returnCode(ReturnCode returnCode) {
    this.returnCode = returnCode;
    return this;
  }

   /**
   * Complements `resultCode` property with information about unified name and source of the operation code
   * @return returnCode
  **/
  @ApiModelProperty(required = true, value = "Complements `resultCode` property with information about unified name and source of the operation code")
  @NotNull

  @Valid

  public ReturnCode getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(ReturnCode returnCode) {
    this.returnCode = returnCode;
  }

  public Activation status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Current status of this `ACTIVATION`; see list of all [Status Codes](https://www.optile.io/opg#285186)
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Current status of this `ACTIVATION`; see list of all [Status Codes](https://www.optile.io/opg#285186)")
  @NotNull

  @Valid

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Activation interaction(Interaction interaction) {
    this.interaction = interaction;
    return this;
  }

   /**
   * Interaction advice for this `ACTIVATION` according to its current state
   * @return interaction
  **/
  @ApiModelProperty(required = true, value = "Interaction advice for this `ACTIVATION` according to its current state")
  @NotNull

  @Valid

  public Interaction getInteraction() {
    return interaction;
  }

  public void setInteraction(Interaction interaction) {
    this.interaction = interaction;
  }

  public Activation identification(Identification identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Collection of identification information (references) for this `CHARGE`
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Collection of identification information (references) for this `CHARGE`")
  @NotNull

  @Valid

  public Identification getIdentification() {
    return identification;
  }

  public void setIdentification(Identification identification) {
    this.identification = identification;
  }

  public Activation activated(ApplicableNetwork activated) {
    this.activated = activated;
    return this;
  }

   /**
   * Information about applicable network that is activated within this `ACTIVATION` operation
   * @return activated
  **/
  @ApiModelProperty(required = true, value = "Information about applicable network that is activated within this `ACTIVATION` operation")
  @NotNull

  @Valid

  public ApplicableNetwork getActivated() {
    return activated;
  }

  public void setActivated(ApplicableNetwork activated) {
    this.activated = activated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activation activation = (Activation) o;
    return Objects.equals(this.links, activation.links) &&
        Objects.equals(this.timestamp, activation.timestamp) &&
        Objects.equals(this.operation, activation.operation) &&
        Objects.equals(this.resultCode, activation.resultCode) &&
        Objects.equals(this.resultInfo, activation.resultInfo) &&
        Objects.equals(this.returnCode, activation.returnCode) &&
        Objects.equals(this.status, activation.status) &&
        Objects.equals(this.interaction, activation.interaction) &&
        Objects.equals(this.identification, activation.identification) &&
        Objects.equals(this.activated, activation.activated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, timestamp, operation, resultCode, resultInfo, returnCode, status, interaction, identification, activated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activation {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    interaction: ").append(toIndentedString(interaction)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
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

