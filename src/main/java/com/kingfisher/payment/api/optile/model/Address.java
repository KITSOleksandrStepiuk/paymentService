package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Address   {
  @JsonProperty("street")
  private String street = null;

  @JsonProperty("houseNumber")
  private String houseNumber = null;

  @JsonProperty("zip")
  private String zip = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("name")
  private Name name = null;

  @JsonProperty("companyName")
  private String companyName = null;

  public Address street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Street name
   * @return street
  **/
  @ApiModelProperty(example = "Ganghoferstr.", value = "Street name")


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

   /**
   * House number; may include suffix and prefix, e.g. \"16a\", \"64 app.32\"
   * @return houseNumber
  **/
  @ApiModelProperty(example = "39", value = "House number; may include suffix and prefix, e.g. \"16a\", \"64 app.32\"")


  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public Address zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * ZIP code / post code
   * @return zip
  **/
  @ApiModelProperty(example = "80339", value = "ZIP code / post code")


  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @ApiModelProperty(example = "Munich", value = "City")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State; name or code as it is used in the US or other countries with a strong federal structure
   * @return state
  **/
  @ApiModelProperty(example = "Bayern", value = "State; name or code as it is used in the US or other countries with a strong federal structure")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country code; format according to ISO 3166-1 (alpha-2)
   * @return country
  **/
  @ApiModelProperty(example = "DE", value = "Country code; format according to ISO 3166-1 (alpha-2)")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address name(Name name) {
    this.name = name;
    return this;
  }

   /**
   * Indicates a recipient name for this address; this can be provided if, for example, the shipping address should use a different name than it is given in the customer object 
   * @return name
  **/
  @ApiModelProperty(value = "Indicates a recipient name for this address; this can be provided if, for example, the shipping address should use a different name than it is given in the customer object ")

  @Valid

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Address companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Company name; should be specified for company addresses to complement or insted of recipient name
   * @return companyName
  **/
  @ApiModelProperty(example = "optile GmbH", value = "Company name; should be specified for company addresses to complement or insted of recipient name")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.street, address.street) &&
        Objects.equals(this.houseNumber, address.houseNumber) &&
        Objects.equals(this.zip, address.zip) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.name, address.name) &&
        Objects.equals(this.companyName, address.companyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, houseNumber, zip, city, state, country, name, companyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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

