package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AccountFormData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class AccountFormData   {
  @JsonProperty("holderName")
  private String holderName = null;

  public AccountFormData holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

   /**
   * Account holder name
   * @return holderName
  **/
  @ApiModelProperty(example = "James Blond", value = "Account holder name")


  public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFormData accountFormData = (AccountFormData) o;
    return Objects.equals(this.holderName, accountFormData.holderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holderName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFormData {\n");
    
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
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

