package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.Interaction;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class ErrorInfo   {
  @JsonProperty("resultInfo")
  private String resultInfo = null;

  @JsonProperty("interaction")
  private Interaction interaction = null;

  public ErrorInfo resultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * Descriptive information that complements the interaction advice
   * @return resultInfo
  **/
  @ApiModelProperty(required = true, value = "Descriptive information that complements the interaction advice")
  @NotNull


  public String getResultInfo() {
    return resultInfo;
  }

  public void setResultInfo(String resultInfo) {
    this.resultInfo = resultInfo;
  }

  public ErrorInfo interaction(Interaction interaction) {
    this.interaction = interaction;
    return this;
  }

   /**
   * Interaction advice for this error response
   * @return interaction
  **/
  @ApiModelProperty(value = "Interaction advice for this error response")

  @Valid

  public Interaction getInteraction() {
    return interaction;
  }

  public void setInteraction(Interaction interaction) {
    this.interaction = interaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorInfo errorInfo = (ErrorInfo) o;
    return Objects.equals(this.resultInfo, errorInfo.resultInfo) &&
        Objects.equals(this.interaction, errorInfo.interaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultInfo, interaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorInfo {\n");
    
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    interaction: ").append(toIndentedString(interaction)).append("\n");
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

