package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kingfisher.payment.api.validator.annotation.DisallowedField;
import com.kingfisher.payment.api.validator.groups.PaymentAPI;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Customer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Customer   {
  @JsonProperty("number")
  private String number = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("birthday")
  private LocalDate birthday = null;

  @JsonProperty("name")
  private Name name = null;

  @JsonProperty("addresses")
  private CustomerAddresses addresses = null;

  @JsonProperty("phones")
  private Phones phones = null;

  @JsonProperty("registration")
  @DisallowedField(groups = {PaymentAPI.class})
  private Registration registration = null;

  public Customer number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Identifier for this customer given by the merchant; not validated for uniqueness by OPG
   * @return number
  **/
  @ApiModelProperty(required = true, value = "Identifier for this customer given by the merchant; not validated for uniqueness by OPG")
  @NotNull
  @NotEmpty(groups = {PaymentAPI.class})

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customers e-mail; highly recommended to provide this information, e.g. for risk management purposes
   * @return email
  **/
  @ApiModelProperty(example = "james.blond@example.com", value = "Customers e-mail; highly recommended to provide this information, e.g. for risk management purposes")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Customers birthday; helpful for risk management purposes, required by some PSPs
   * @return birthday
  **/
  @ApiModelProperty(value = "Customers birthday; helpful for risk management purposes, required by some PSPs")

  @Valid

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public Customer name(Name name) {
    this.name = name;
    return this;
  }

   /**
   * Customers name information
   * @return name
  **/
  @ApiModelProperty(value = "Customers name information")

  @Valid

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Customer addresses(CustomerAddresses addresses) {
    this.addresses = addresses;
    return this;
  }

   /**
   * Customers addresses information; helpful for risk management purposes, impotent for retail merchants
   * @return addresses
  **/
  @ApiModelProperty(value = "Customers addresses information; helpful for risk management purposes, impotent for retail merchants")

  @Valid

  public CustomerAddresses getAddresses() {
    return addresses;
  }

  public void setAddresses(CustomerAddresses addresses) {
    this.addresses = addresses;
  }

  public Customer phones(Phones phones) {
    this.phones = phones;
    return this;
  }

   /**
   * Customers phone numbers
   * @return phones
  **/
  @ApiModelProperty(value = "Customers phone numbers")

  @Valid

  public Phones getPhones() {
    return phones;
  }

  public void setPhones(Phones phones) {
    this.phones = phones;
  }

  public Customer registration(Registration registration) {
    this.registration = registration;
    return this;
  }

   /**
   * Customers registration in OPG; refers to registration of this customer in OPG system
   * @return registration
  **/
  @ApiModelProperty(value = "Customers registration in OPG; refers to registration of this customer in OPG system")

  @Valid

  public Registration getRegistration() {
    return registration;
  }

  public void setRegistration(Registration registration) {
    this.registration = registration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.number, customer.number) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.birthday, customer.birthday) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.addresses, customer.addresses) &&
        Objects.equals(this.phones, customer.phones) &&
        Objects.equals(this.registration, customer.registration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, email, birthday, name, addresses, phones, registration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
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

