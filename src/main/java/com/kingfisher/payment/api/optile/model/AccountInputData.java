package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AccountInputData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class AccountInputData   {
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
  private String expiryMonth = null;

  @JsonProperty("expiryYear")
  private String expiryYear = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("optIn")
  private Boolean optIn = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("verificationCode")
  private String verificationCode = null;

  @JsonProperty("customerBirthDay")
  private String customerBirthDay = null;

  @JsonProperty("customerBirthMonth")
  private String customerBirthMonth = null;

  @JsonProperty("customerBirthYear")
  private String customerBirthYear = null;

  @JsonProperty("installmentPlanId")
  private String installmentPlanId = null;

  public AccountInputData holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

   /**
   * Account holder name
   * @return holderName
  **/
  @ApiModelProperty(example = "Maria Mustermann", value = "Account holder name")


  public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public AccountInputData number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Account number (bank account number, credit card number, etc.)
   * @return number
  **/
  @ApiModelProperty(example = "4111111111111111", value = "Account number (bank account number, credit card number, etc.)")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public AccountInputData bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Bank code
   * @return bankCode
  **/
  @ApiModelProperty(example = "39040013", value = "Bank code")


  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public AccountInputData bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Bank name
   * @return bankName
  **/
  @ApiModelProperty(example = "Commerzbank", value = "Bank name")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public AccountInputData bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * BIC code
   * @return bic
  **/
  @ApiModelProperty(example = "COBADEFFXXX", value = "BIC code")


  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public AccountInputData branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Bank branch name
   * @return branch
  **/
  @ApiModelProperty(example = "Commerzbank NRW", value = "Bank branch name")


  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public AccountInputData city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Bank city (or any other account related city)
   * @return city
  **/
  @ApiModelProperty(example = "Aachen", value = "Bank city (or any other account related city)")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountInputData expiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * Account expiry month (credit/debit cards)
   * @return expiryMonth
  **/
  @ApiModelProperty(example = "7", value = "Account expiry month (credit/debit cards)")


  public String getExpiryMonth() {
    return expiryMonth;
  }

  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }

  public AccountInputData expiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * Account expiry year (credit/debit cards)
   * @return expiryYear
  **/
  @ApiModelProperty(example = "2020", value = "Account expiry year (credit/debit cards)")


  public String getExpiryYear() {
    return expiryYear;
  }

  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }

  public AccountInputData iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * IBAN number
   * @return iban
  **/
  @ApiModelProperty(example = "DE89370400440532013000", value = "IBAN number")


  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public AccountInputData login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Account login name
   * @return login
  **/
  @ApiModelProperty(example = "james.blond@mail.com", value = "Account login name")


  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public AccountInputData optIn(Boolean optIn) {
    this.optIn = optIn;
    return this;
  }

   /**
   * Indicates whether customer is agreed to opt-in or not
   * @return optIn
  **/
  @ApiModelProperty(value = "Indicates whether customer is agreed to opt-in or not")


  public Boolean getOptIn() {
    return optIn;
  }

  public void setOptIn(Boolean optIn) {
    this.optIn = optIn;
  }

  public AccountInputData password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Account password
   * @return password
  **/
  @ApiModelProperty(example = "secret123", value = "Account password")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AccountInputData verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

   /**
   * Account verification code (CVC, CVV, CID in case of different credit cards)
   * @return verificationCode
  **/
  @ApiModelProperty(example = "987", value = "Account verification code (CVC, CVV, CID in case of different credit cards)")


  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }

  public AccountInputData customerBirthDay(String customerBirthDay) {
    this.customerBirthDay = customerBirthDay;
    return this;
  }

   /**
   * Day of customer's birthday
   * @return customerBirthDay
  **/
  @ApiModelProperty(example = "21", value = "Day of customer's birthday")


  public String getCustomerBirthDay() {
    return customerBirthDay;
  }

  public void setCustomerBirthDay(String customerBirthDay) {
    this.customerBirthDay = customerBirthDay;
  }

  public AccountInputData customerBirthMonth(String customerBirthMonth) {
    this.customerBirthMonth = customerBirthMonth;
    return this;
  }

   /**
   * Month of customer's birthday
   * @return customerBirthMonth
  **/
  @ApiModelProperty(example = "12", value = "Month of customer's birthday")


  public String getCustomerBirthMonth() {
    return customerBirthMonth;
  }

  public void setCustomerBirthMonth(String customerBirthMonth) {
    this.customerBirthMonth = customerBirthMonth;
  }

  public AccountInputData customerBirthYear(String customerBirthYear) {
    this.customerBirthYear = customerBirthYear;
    return this;
  }

   /**
   * Year of customer's birthday
   * @return customerBirthYear
  **/
  @ApiModelProperty(example = "1984", value = "Year of customer's birthday")


  public String getCustomerBirthYear() {
    return customerBirthYear;
  }

  public void setCustomerBirthYear(String customerBirthYear) {
    this.customerBirthYear = customerBirthYear;
  }

  public AccountInputData installmentPlanId(String installmentPlanId) {
    this.installmentPlanId = installmentPlanId;
    return this;
  }

   /**
   * Id of chosen installment plan
   * @return installmentPlanId
  **/
  @ApiModelProperty(example = "p12x2", value = "Id of chosen installment plan")


  public String getInstallmentPlanId() {
    return installmentPlanId;
  }

  public void setInstallmentPlanId(String installmentPlanId) {
    this.installmentPlanId = installmentPlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInputData accountInputData = (AccountInputData) o;
    return Objects.equals(this.holderName, accountInputData.holderName) &&
        Objects.equals(this.number, accountInputData.number) &&
        Objects.equals(this.bankCode, accountInputData.bankCode) &&
        Objects.equals(this.bankName, accountInputData.bankName) &&
        Objects.equals(this.bic, accountInputData.bic) &&
        Objects.equals(this.branch, accountInputData.branch) &&
        Objects.equals(this.city, accountInputData.city) &&
        Objects.equals(this.expiryMonth, accountInputData.expiryMonth) &&
        Objects.equals(this.expiryYear, accountInputData.expiryYear) &&
        Objects.equals(this.iban, accountInputData.iban) &&
        Objects.equals(this.login, accountInputData.login) &&
        Objects.equals(this.optIn, accountInputData.optIn) &&
        Objects.equals(this.password, accountInputData.password) &&
        Objects.equals(this.verificationCode, accountInputData.verificationCode) &&
        Objects.equals(this.customerBirthDay, accountInputData.customerBirthDay) &&
        Objects.equals(this.customerBirthMonth, accountInputData.customerBirthMonth) &&
        Objects.equals(this.customerBirthYear, accountInputData.customerBirthYear) &&
        Objects.equals(this.installmentPlanId, accountInputData.installmentPlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holderName, number, bankCode, bankName, bic, branch, city, expiryMonth, expiryYear, iban, login, optIn, password, verificationCode, customerBirthDay, customerBirthMonth, customerBirthYear, installmentPlanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInputData {\n");
    
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
    sb.append("    optIn: ").append(toIndentedString(optIn)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
    sb.append("    customerBirthDay: ").append(toIndentedString(customerBirthDay)).append("\n");
    sb.append("    customerBirthMonth: ").append(toIndentedString(customerBirthMonth)).append("\n");
    sb.append("    customerBirthYear: ").append(toIndentedString(customerBirthYear)).append("\n");
    sb.append("    installmentPlanId: ").append(toIndentedString(installmentPlanId)).append("\n");
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

