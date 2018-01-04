package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AccountMask
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class AccountMask   {
  @JsonProperty("displayLabel")
  private String displayLabel = null;

  @JsonProperty("holderName")
  private String holderName = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("bankCode")
  private String bankCode = null;

  @JsonProperty("bankName")
  private String bankName = null;

  @JsonProperty("bic")
  private String bic = null;

  @JsonProperty("branch")
  private String branch = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("expiryMonth")
  private Integer expiryMonth = null;

  @JsonProperty("expiryYear")
  private Integer expiryYear = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("login")
  private String login = null;

  public AccountMask displayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

   /**
   * Display lable of account registration; usually combined from several account fields
   * @return displayLabel
  **/
  @ApiModelProperty(example = "37 *** 0002    05 | 2021", value = "Display lable of account registration; usually combined from several account fields")


  public String getDisplayLabel() {
    return displayLabel;
  }

  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }

  public AccountMask holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

   /**
   * Account holder name
   * @return holderName
  **/
  @ApiModelProperty(example = "Max Mustermann", value = "Account holder name")


  public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public AccountMask number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Account number (bank account number, credit card number, etc.), usually truncated
   * @return number
  **/
  @ApiModelProperty(example = "37 *** 0002", value = "Account number (bank account number, credit card number, etc.), usually truncated")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public AccountMask bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Bank code
   * @return bankCode
  **/
  @ApiModelProperty(example = "69450065", value = "Bank code")


  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public AccountMask bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Bank name
   * @return bankName
  **/
  @ApiModelProperty(example = "Sparkasse", value = "Bank name")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public AccountMask bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * BIC code
   * @return bic
  **/
  @ApiModelProperty(example = "SOLADES1VSS", value = "BIC code")


  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public AccountMask branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Bank branch name
   * @return branch
  **/
  @ApiModelProperty(example = "Sparkasse Schwarzwald-Baar", value = "Bank branch name")


  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public AccountMask city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Bank city (or any other account related city)
   * @return city
  **/
  @ApiModelProperty(example = "Villingen", value = "Bank city (or any other account related city)")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountMask expiryMonth(Integer expiryMonth) {
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * Account expiry month (credit/debit cards)
   * @return expiryMonth
  **/
  @ApiModelProperty(example = "5", value = "Account expiry month (credit/debit cards)")


  public Integer getExpiryMonth() {
    return expiryMonth;
  }

  public void setExpiryMonth(Integer expiryMonth) {
    this.expiryMonth = expiryMonth;
  }

  public AccountMask expiryYear(Integer expiryYear) {
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * Account expiry year (credit/debit cards)
   * @return expiryYear
  **/
  @ApiModelProperty(example = "2021", value = "Account expiry year (credit/debit cards)")


  public Integer getExpiryYear() {
    return expiryYear;
  }

  public void setExpiryYear(Integer expiryYear) {
    this.expiryYear = expiryYear;
  }

  public AccountMask iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * IBAN number, usually truncated
   * @return iban
  **/
  @ApiModelProperty(value = "IBAN number, usually truncated")


  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public AccountMask login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Account login name
   * @return login
  **/
  @ApiModelProperty(value = "Account login name")


  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMask accountMask = (AccountMask) o;
    return Objects.equals(this.displayLabel, accountMask.displayLabel) &&
        Objects.equals(this.holderName, accountMask.holderName) &&
        Objects.equals(this.number, accountMask.number) &&
        Objects.equals(this.bankCode, accountMask.bankCode) &&
        Objects.equals(this.bankName, accountMask.bankName) &&
        Objects.equals(this.bic, accountMask.bic) &&
        Objects.equals(this.branch, accountMask.branch) &&
        Objects.equals(this.city, accountMask.city) &&
        Objects.equals(this.expiryMonth, accountMask.expiryMonth) &&
        Objects.equals(this.expiryYear, accountMask.expiryYear) &&
        Objects.equals(this.iban, accountMask.iban) &&
        Objects.equals(this.login, accountMask.login);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayLabel, holderName, number, bankCode, bankName, bic, branch, city, expiryMonth, expiryYear, iban, login);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMask {\n");
    
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
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

