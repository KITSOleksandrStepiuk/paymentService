package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.AccountInputData;
import com.kingfisher.payment.api.optile.model.ClientInfo;
import com.kingfisher.payment.api.optile.model.Installment;
import com.kingfisher.payment.api.optile.model.Mandate;
import com.kingfisher.payment.api.optile.model.Payment;
import com.kingfisher.payment.api.optile.model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Operation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Operation   {
  @JsonProperty("autoRegistration")
  private Boolean autoRegistration = null;

  @JsonProperty("allowRecurrence")
  private Boolean allowRecurrence = null;

  @JsonProperty("account")
  private AccountInputData account = null;

  @JsonProperty("encryptedAccount")
  private String encryptedAccount = null;

  @JsonProperty("clientInfo")
  private ClientInfo clientInfo = null;

  @JsonProperty("payment")
  private Payment payment = null;

  @JsonProperty("products")
  private List<Product> products = null;

  @JsonProperty("checkboxes")
  private Map<String, Boolean> checkboxes = null;

  @JsonProperty("mandate")
  private Mandate mandate = null;

  @JsonProperty("installment")
  private Installment installment = null;

  public Operation autoRegistration(Boolean autoRegistration) {
    this.autoRegistration = autoRegistration;
    return this;
  }

   /**
   * If set to `true` the account will be registered for further payments
   * @return autoRegistration
  **/
  @ApiModelProperty(value = "If set to `true` the account will be registered for further payments")


  public Boolean getAutoRegistration() {
    return autoRegistration;
  }

  public void setAutoRegistration(Boolean autoRegistration) {
    this.autoRegistration = autoRegistration;
  }

  public Operation allowRecurrence(Boolean allowRecurrence) {
    this.allowRecurrence = allowRecurrence;
    return this;
  }

   /**
   * If set to `true` the account will be registered for further recurring payments
   * @return allowRecurrence
  **/
  @ApiModelProperty(value = "If set to `true` the account will be registered for further recurring payments")


  public Boolean getAllowRecurrence() {
    return allowRecurrence;
  }

  public void setAllowRecurrence(Boolean allowRecurrence) {
    this.allowRecurrence = allowRecurrence;
  }

  public Operation account(AccountInputData account) {
    this.account = account;
    return this;
  }

   /**
   * Customer account data; presence of account fields depends on a selected payment network
   * @return account
  **/
  @ApiModelProperty(value = "Customer account data; presence of account fields depends on a selected payment network")

  @Valid

  public AccountInputData getAccount() {
    return account;
  }

  public void setAccount(AccountInputData account) {
    this.account = account;
  }

  public Operation encryptedAccount(String encryptedAccount) {
    this.encryptedAccount = encryptedAccount;
    return this;
  }

   /**
   * Customer account data encrypted with one of the CSE (Client Side Encryption) keys configured in MCAPI for division of this transaction. Account data should be encrypted according to [JOSE standard](https://tools.ietf.org/html/rfc7520) \"RSA-OAEP\" + \"A256GCM\", see [RFC-7520](https://tools.ietf.org/html/rfc7520#section-5.2).  Note that supplying both fields `account` and  `encryptedAccount` will cause an error and such operation will be rejected.  See [Client Side Encryption](https://www.optile.io/opg#894746) for further details. 
   * @return encryptedAccount
  **/
  @ApiModelProperty(example = "eyJhbGciOiJSU0EtT0FFU ... fZTJb.OMY7XHgpxgBgIVWByouqWw", value = "Customer account data encrypted with one of the CSE (Client Side Encryption) keys configured in MCAPI for division of this transaction. Account data should be encrypted according to [JOSE standard](https://tools.ietf.org/html/rfc7520) \"RSA-OAEP\" + \"A256GCM\", see [RFC-7520](https://tools.ietf.org/html/rfc7520#section-5.2).  Note that supplying both fields `account` and  `encryptedAccount` will cause an error and such operation will be rejected.  See [Client Side Encryption](https://www.optile.io/opg#894746) for further details. ")


  public String getEncryptedAccount() {
    return encryptedAccount;
  }

  public void setEncryptedAccount(String encryptedAccount) {
    this.encryptedAccount = encryptedAccount;
  }

  public Operation clientInfo(ClientInfo clientInfo) {
    this.clientInfo = clientInfo;
    return this;
  }

   /**
   * Information about customers client (web browser, mobile device, etc.); if defined this will override information provided during `LIST` initialization 
   * @return clientInfo
  **/
  @ApiModelProperty(value = "Information about customers client (web browser, mobile device, etc.); if defined this will override information provided during `LIST` initialization ")

  @Valid

  public ClientInfo getClientInfo() {
    return clientInfo;
  }

  public void setClientInfo(ClientInfo clientInfo) {
    this.clientInfo = clientInfo;
  }

  public Operation payment(Payment payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Payment information; if defined this will override information provided during `LIST` initialization
   * @return payment
  **/
  @ApiModelProperty(value = "Payment information; if defined this will override information provided during `LIST` initialization")

  @Valid

  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public Operation products(List<Product> products) {
    this.products = products;
    return this;
  }

  public Operation addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<Product>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Products (shopping cart) information; if defined this will override information provided during `LIST` initialization
   * @return products
  **/
  @ApiModelProperty(value = "Products (shopping cart) information; if defined this will override information provided during `LIST` initialization")

  @Valid

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public Operation checkboxes(Map<String, Boolean> checkboxes) {
    this.checkboxes = checkboxes;
    return this;
  }

  public Operation putCheckboxesItem(String key, Boolean checkboxesItem) {
    if (this.checkboxes == null) {
      this.checkboxes = new HashMap<String, Boolean>();
    }
    this.checkboxes.put(key, checkboxesItem);
    return this;
  }

   /**
   * Map of selected checkboxes; name reflects the checkbox distinguish name, value reflects its state - `true` for selected, `false` for unchecked 
   * @return checkboxes
  **/
  @ApiModelProperty(value = "Map of selected checkboxes; name reflects the checkbox distinguish name, value reflects its state - `true` for selected, `false` for unchecked ")


  public Map<String, Boolean> getCheckboxes() {
    return checkboxes;
  }

  public void setCheckboxes(Map<String, Boolean> checkboxes) {
    this.checkboxes = checkboxes;
  }

  public Operation mandate(Mandate mandate) {
    this.mandate = mandate;
    return this;
  }

   /**
   * Mandate information required for SEPA payment networks processing; if defined this will override information provided during `LIST` initialization 
   * @return mandate
  **/
  @ApiModelProperty(value = "Mandate information required for SEPA payment networks processing; if defined this will override information provided during `LIST` initialization ")

  @Valid

  public Mandate getMandate() {
    return mandate;
  }

  public void setMandate(Mandate mandate) {
    this.mandate = mandate;
  }

  public Operation installment(Installment installment) {
    this.installment = installment;
    return this;
  }

   /**
   * Information / hint about installment schema preferred by customer; if defined this will override information provided during `LIST` initialization 
   * @return installment
  **/
  @ApiModelProperty(value = "Information / hint about installment schema preferred by customer; if defined this will override information provided during `LIST` initialization ")

  @Valid

  public Installment getInstallment() {
    return installment;
  }

  public void setInstallment(Installment installment) {
    this.installment = installment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Objects.equals(this.autoRegistration, operation.autoRegistration) &&
        Objects.equals(this.allowRecurrence, operation.allowRecurrence) &&
        Objects.equals(this.account, operation.account) &&
        Objects.equals(this.encryptedAccount, operation.encryptedAccount) &&
        Objects.equals(this.clientInfo, operation.clientInfo) &&
        Objects.equals(this.payment, operation.payment) &&
        Objects.equals(this.products, operation.products) &&
        Objects.equals(this.checkboxes, operation.checkboxes) &&
        Objects.equals(this.mandate, operation.mandate) &&
        Objects.equals(this.installment, operation.installment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRegistration, allowRecurrence, account, encryptedAccount, clientInfo, payment, products, checkboxes, mandate, installment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    
    sb.append("    autoRegistration: ").append(toIndentedString(autoRegistration)).append("\n");
    sb.append("    allowRecurrence: ").append(toIndentedString(allowRecurrence)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    encryptedAccount: ").append(toIndentedString(encryptedAccount)).append("\n");
    sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    checkboxes: ").append(toIndentedString(checkboxes)).append("\n");
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
    sb.append("    installment: ").append(toIndentedString(installment)).append("\n");
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

