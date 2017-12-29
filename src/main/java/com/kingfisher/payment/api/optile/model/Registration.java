package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Registration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Registration   {

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("password")
  private String password = null;

  public Registration id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Customer registration ID within OPG platform; generated and supplied to merchant when a customer gets registered in OPG
   * @return id
  **/
  @ApiModelProperty(example = "59e07b240bd6e05fe60f063au", required = false, value = "Customer registration ID within OPG platform; generated and supplied to merchant when a customer gets registered in OPG")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Registration password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Customer registration password; required to access customer accounts details stored in Secure Storage at optile
   * @return password
  **/
  @ApiModelProperty(example = "sfqh52h442j...", value = "Customer registration password; required to access customer accounts details stored in Secure Storage at optile")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Registration registration = (Registration) o;
    return Objects.equals(this.id, registration.id) &&
        Objects.equals(this.password, registration.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

