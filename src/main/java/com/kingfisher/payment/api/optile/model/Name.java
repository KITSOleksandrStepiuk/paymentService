package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Name
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Name   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("maidenName")
  private String maidenName = null;

  public Name title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Customers title; freely usable field for anything to be put in front of the name, e.g. \"Mrs.\", \"Prof.\", \"Dr.\", etc.
   * @return title
  **/
  @ApiModelProperty(example = "Mr.", value = "Customers title; freely usable field for anything to be put in front of the name, e.g. \"Mrs.\", \"Prof.\", \"Dr.\", etc.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Name firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Customers first name
   * @return firstName
  **/
  @ApiModelProperty(example = "James", value = "Customers first name")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Name middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Customers middle name; common in some countries
   * @return middleName
  **/
  @ApiModelProperty(example = "Junior", value = "Customers middle name; common in some countries")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Name lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Customers family name
   * @return lastName
  **/
  @ApiModelProperty(example = "Blond", value = "Customers family name")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Name maidenName(String maidenName) {
    this.maidenName = maidenName;
    return this;
  }

   /**
   * Customers maiden name; last name given to a person at day of birth if it has change later, e.g. after marriage
   * @return maidenName
  **/
  @ApiModelProperty(value = "Customers maiden name; last name given to a person at day of birth if it has change later, e.g. after marriage")


  public String getMaidenName() {
    return maidenName;
  }

  public void setMaidenName(String maidenName) {
    this.maidenName = maidenName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.title, name.title) &&
        Objects.equals(this.firstName, name.firstName) &&
        Objects.equals(this.middleName, name.middleName) &&
        Objects.equals(this.lastName, name.lastName) &&
        Objects.equals(this.maidenName, name.maidenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, firstName, middleName, lastName, maidenName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
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

