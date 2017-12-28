package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import org.joda.time.LocalDate;
import java.util.Objects;

/**
 * CustomerFormData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class CustomerFormData   {
  @JsonProperty("birthday")
  private LocalDate birthday = null;

  public CustomerFormData birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Customer's birthday
   * @return birthday
  **/
  @ApiModelProperty(value = "Customer's birthday")

  @Valid

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerFormData customerFormData = (CustomerFormData) o;
    return Objects.equals(this.birthday, customerFormData.birthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerFormData {\n");
    
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
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

