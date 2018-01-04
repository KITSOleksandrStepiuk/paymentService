package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * DeregistrationData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class DeregistrationData   {
  @JsonProperty("deleteRegistration")
  private Boolean deleteRegistration = null;

  @JsonProperty("deleteRecurrence")
  private Boolean deleteRecurrence = null;

  public DeregistrationData deleteRegistration(Boolean deleteRegistration) {
    this.deleteRegistration = deleteRegistration;
    return this;
  }

   /**
   * If set to `true` the account registrations (one-click) will be deleted if present, if set to `false` the registration remains
   * @return deleteRegistration
  **/
  @ApiModelProperty(value = "If set to `true` the account registrations (one-click) will be deleted if present, if set to `false` the registration remains")


  public Boolean getDeleteRegistration() {
    return deleteRegistration;
  }

  public void setDeleteRegistration(Boolean deleteRegistration) {
    this.deleteRegistration = deleteRegistration;
  }

  public DeregistrationData deleteRecurrence(Boolean deleteRecurrence) {
    this.deleteRecurrence = deleteRecurrence;
    return this;
  }

   /**
   * If set to `true` the recurring registrations will be deleted if present, if set to `false` the registration remains
   * @return deleteRecurrence
  **/
  @ApiModelProperty(value = "If set to `true` the recurring registrations will be deleted if present, if set to `false` the registration remains")


  public Boolean getDeleteRecurrence() {
    return deleteRecurrence;
  }

  public void setDeleteRecurrence(Boolean deleteRecurrence) {
    this.deleteRecurrence = deleteRecurrence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeregistrationData deregistrationData = (DeregistrationData) o;
    return Objects.equals(this.deleteRegistration, deregistrationData.deleteRegistration) &&
        Objects.equals(this.deleteRecurrence, deregistrationData.deleteRecurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteRegistration, deleteRecurrence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeregistrationData {\n");
    
    sb.append("    deleteRegistration: ").append(toIndentedString(deleteRegistration)).append("\n");
    sb.append("    deleteRecurrence: ").append(toIndentedString(deleteRecurrence)).append("\n");
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

