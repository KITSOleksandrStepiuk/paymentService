package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OperationResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class OperationResult   {
  @JsonProperty("resultInfo")
  private String resultInfo = null;

  @JsonProperty("interaction")
  private Interaction interaction = null;

  @JsonProperty("redirect")
  private Redirect redirect = null;

  public OperationResult resultInfo(String resultInfo) {
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

  public OperationResult interaction(Interaction interaction) {
    this.interaction = interaction;
    return this;
  }

   /**
   * Interaction advice for the operation result
   * @return interaction
  **/
  @ApiModelProperty(required = true, value = "Interaction advice for the operation result")
  @NotNull

  @Valid

  public Interaction getInteraction() {
    return interaction;
  }

  public void setInteraction(Interaction interaction) {
    this.interaction = interaction;
  }

  public OperationResult redirect(Redirect redirect) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResult operationResult = (OperationResult) o;
    return Objects.equals(this.resultInfo, operationResult.resultInfo) &&
        Objects.equals(this.interaction, operationResult.interaction) &&
        Objects.equals(this.redirect, operationResult.redirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultInfo, interaction, redirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResult {\n");
    
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
    sb.append("    interaction: ").append(toIndentedString(interaction)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
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

