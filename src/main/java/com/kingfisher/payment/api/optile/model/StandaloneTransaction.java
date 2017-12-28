package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.AccountInputData;
import com.kingfisher.payment.api.optile.model.Callback;
import com.kingfisher.payment.api.optile.model.ClientInfo;
import com.kingfisher.payment.api.optile.model.Customer;
import com.kingfisher.payment.api.optile.model.Installment;
import com.kingfisher.payment.api.optile.model.Mandate;
import com.kingfisher.payment.api.optile.model.Payment;
import com.kingfisher.payment.api.optile.model.Product;
import com.kingfisher.payment.api.optile.model.StandalonePreselection;
import com.kingfisher.payment.api.optile.model.StandaloneStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StandaloneTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class StandaloneTransaction   {
  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("country")
  private String country = null;

  /**
   * Indicates where the payment request comes from, i.e. a website, a mobile use case or a recurring transaction from the merchant's backend
   */
  public enum ChannelEnum {
    WEB_ORDER("WEB_ORDER"),
    
    MOBILE_ORDER("MOBILE_ORDER"),
    
    CUSTOMER_SELF_SERVICE("CUSTOMER_SELF_SERVICE"),
    
    EMAIL_ORDER("EMAIL_ORDER"),
    
    CALLCENTER_ORDER("CALLCENTER_ORDER"),
    
    MAIL_ORDER("MAIL_ORDER"),
    
    TERMINAL_ORDER("TERMINAL_ORDER"),
    
    CUSTOMER_SUPPORT("CUSTOMER_SUPPORT"),
    
    RECURRING("RECURRING"),
    
    DUNNING("DUNNING"),
    
    FULFILLMENT("FULFILLMENT"),
    
    IMPORT("IMPORT");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChannelEnum fromValue(String text) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("channel")
  private ChannelEnum channel = null;

  @JsonProperty("division")
  private String division = null;

  @JsonProperty("callback")
  private Callback callback = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("customerScore")
  private Integer customerScore = null;

  @JsonProperty("clientInfo")
  private ClientInfo clientInfo = null;

  @JsonProperty("payment")
  private Payment payment = null;

  @JsonProperty("products")
  private List<Product> products = null;

  @JsonProperty("style")
  private StandaloneStyle style = null;

  @JsonProperty("preselection")
  private StandalonePreselection preselection = null;

  @JsonProperty("mandate")
  private Mandate mandate = null;

  @JsonProperty("installment")
  private Installment installment = null;

  @JsonProperty("autoRegistration")
  private Boolean autoRegistration = null;

  @JsonProperty("allowRecurrence")
  private Boolean allowRecurrence = null;

  @JsonProperty("account")
  private AccountInputData account = null;

  @JsonProperty("encryptedAccount")
  private String encryptedAccount = null;

  @JsonProperty("checkboxes")
  private Map<String, Boolean> checkboxes = null;

  public StandaloneTransaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Identifier for this payment transaction given by the merchant; it is not validated for uniqueness by OPG, but may be checked for by some PSPs, thus recommended to be unique 
   * @return transactionId
  **/
  @ApiModelProperty(example = "PM-000031541", required = true, value = "Identifier for this payment transaction given by the merchant; it is not validated for uniqueness by OPG, but may be checked for by some PSPs, thus recommended to be unique ")
  @NotNull


  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public StandaloneTransaction country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country where the payment is originating; this influences the selection of payment networks; format according to ISO 3166-1 (alpha-2), e.g. \"DE\", \"FR\", \"US\", \"GB\", etc. 
   * @return country
  **/
  @ApiModelProperty(example = "IT", required = true, value = "Country where the payment is originating; this influences the selection of payment networks; format according to ISO 3166-1 (alpha-2), e.g. \"DE\", \"FR\", \"US\", \"GB\", etc. ")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public StandaloneTransaction channel(ChannelEnum channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Indicates where the payment request comes from, i.e. a website, a mobile use case or a recurring transaction from the merchant's backend
   * @return channel
  **/
  @ApiModelProperty(value = "Indicates where the payment request comes from, i.e. a website, a mobile use case or a recurring transaction from the merchant's backend")


  public ChannelEnum getChannel() {
    return channel;
  }

  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }

  public StandaloneTransaction division(String division) {
    this.division = division;
    return this;
  }

   /**
   * There is always one default division that will be used if this property is undefined; different divisions can be configured with different setup, contracts, payment routes and network options 
   * @return division
  **/
  @ApiModelProperty(example = "myshop.it", value = "There is always one default division that will be used if this property is undefined; different divisions can be configured with different setup, contracts, payment routes and network options ")


  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public StandaloneTransaction callback(Callback callback) {
    this.callback = callback;
    return this;
  }

   /**
   * Callback information about merchants shop system; it is strongly advised to provide this data with each transaction
   * @return callback
  **/
  @ApiModelProperty(required = true, value = "Callback information about merchants shop system; it is strongly advised to provide this data with each transaction")
  @NotNull

  @Valid

  public Callback getCallback() {
    return callback;
  }

  public void setCallback(Callback callback) {
    this.callback = callback;
  }

  public StandaloneTransaction customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Information about customer
   * @return customer
  **/
  @ApiModelProperty(required = true, value = "Information about customer")
  @NotNull

  @Valid

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public StandaloneTransaction customerScore(Integer customerScore) {
    this.customerScore = customerScore;
    return this;
  }

   /**
   * Customer score value in range 0...1000; this value will be used by the system for the decision that some security checks should be enforced or disabled (like 3D Security ckeck) 
   * @return customerScore
  **/
  @ApiModelProperty(example = "500", value = "Customer score value in range 0...1000; this value will be used by the system for the decision that some security checks should be enforced or disabled (like 3D Security ckeck) ")


  public Integer getCustomerScore() {
    return customerScore;
  }

  public void setCustomerScore(Integer customerScore) {
    this.customerScore = customerScore;
  }

  public StandaloneTransaction clientInfo(ClientInfo clientInfo) {
    this.clientInfo = clientInfo;
    return this;
  }

   /**
   * Information about customers client (web browser, mobile device, etc.)
   * @return clientInfo
  **/
  @ApiModelProperty(value = "Information about customers client (web browser, mobile device, etc.)")

  @Valid

  public ClientInfo getClientInfo() {
    return clientInfo;
  }

  public void setClientInfo(ClientInfo clientInfo) {
    this.clientInfo = clientInfo;
  }

  public StandaloneTransaction payment(Payment payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Payment information
   * @return payment
  **/
  @ApiModelProperty(required = true, value = "Payment information")
  @NotNull

  @Valid

  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public StandaloneTransaction products(List<Product> products) {
    this.products = products;
    return this;
  }

  public StandaloneTransaction addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<Product>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Products (shopping cart) information
   * @return products
  **/
  @ApiModelProperty(value = "Products (shopping cart) information")

  @Valid

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public StandaloneTransaction style(StandaloneStyle style) {
    this.style = style;
    return this;
  }

   /**
   * Allows to style redirect page during stand-alone opreation if it ends up with redirect to PSP
   * @return style
  **/
  @ApiModelProperty(value = "Allows to style redirect page during stand-alone opreation if it ends up with redirect to PSP")

  @Valid

  public StandaloneStyle getStyle() {
    return style;
  }

  public void setStyle(StandaloneStyle style) {
    this.style = style;
  }

  public StandaloneTransaction preselection(StandalonePreselection preselection) {
    this.preselection = preselection;
    return this;
  }

   /**
   * The preselection settings influence the resulted payment network and steer its behavior (like deferral) during stand-alone operation 
   * @return preselection
  **/
  @ApiModelProperty(required = true, value = "The preselection settings influence the resulted payment network and steer its behavior (like deferral) during stand-alone operation ")
  @NotNull

  @Valid

  public StandalonePreselection getPreselection() {
    return preselection;
  }

  public void setPreselection(StandalonePreselection preselection) {
    this.preselection = preselection;
  }

  public StandaloneTransaction mandate(Mandate mandate) {
    this.mandate = mandate;
    return this;
  }

   /**
   * Mandate information required for SEPA payment networks processing; it could be passed with a `CHARGE` request in case of native integration scenario, otherwise it should be provided during `LIST` initialization 
   * @return mandate
  **/
  @ApiModelProperty(value = "Mandate information required for SEPA payment networks processing; it could be passed with a `CHARGE` request in case of native integration scenario, otherwise it should be provided during `LIST` initialization ")

  @Valid

  public Mandate getMandate() {
    return mandate;
  }

  public void setMandate(Mandate mandate) {
    this.mandate = mandate;
  }

  public StandaloneTransaction installment(Installment installment) {
    this.installment = installment;
    return this;
  }

   /**
   * Information/hint about installment schema preferred by customer; it could be passed with a `CHARGE` request in case of native integration scenario, otherwise it should be provided during `LIST` initialization 
   * @return installment
  **/
  @ApiModelProperty(value = "Information/hint about installment schema preferred by customer; it could be passed with a `CHARGE` request in case of native integration scenario, otherwise it should be provided during `LIST` initialization ")

  @Valid

  public Installment getInstallment() {
    return installment;
  }

  public void setInstallment(Installment installment) {
    this.installment = installment;
  }

  public StandaloneTransaction autoRegistration(Boolean autoRegistration) {
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

  public StandaloneTransaction allowRecurrence(Boolean allowRecurrence) {
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

  public StandaloneTransaction account(AccountInputData account) {
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

  public StandaloneTransaction encryptedAccount(String encryptedAccount) {
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

  public StandaloneTransaction checkboxes(Map<String, Boolean> checkboxes) {
    this.checkboxes = checkboxes;
    return this;
  }

  public StandaloneTransaction putCheckboxesItem(String key, Boolean checkboxesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandaloneTransaction standaloneTransaction = (StandaloneTransaction) o;
    return Objects.equals(this.transactionId, standaloneTransaction.transactionId) &&
        Objects.equals(this.country, standaloneTransaction.country) &&
        Objects.equals(this.channel, standaloneTransaction.channel) &&
        Objects.equals(this.division, standaloneTransaction.division) &&
        Objects.equals(this.callback, standaloneTransaction.callback) &&
        Objects.equals(this.customer, standaloneTransaction.customer) &&
        Objects.equals(this.customerScore, standaloneTransaction.customerScore) &&
        Objects.equals(this.clientInfo, standaloneTransaction.clientInfo) &&
        Objects.equals(this.payment, standaloneTransaction.payment) &&
        Objects.equals(this.products, standaloneTransaction.products) &&
        Objects.equals(this.style, standaloneTransaction.style) &&
        Objects.equals(this.preselection, standaloneTransaction.preselection) &&
        Objects.equals(this.mandate, standaloneTransaction.mandate) &&
        Objects.equals(this.installment, standaloneTransaction.installment) &&
        Objects.equals(this.autoRegistration, standaloneTransaction.autoRegistration) &&
        Objects.equals(this.allowRecurrence, standaloneTransaction.allowRecurrence) &&
        Objects.equals(this.account, standaloneTransaction.account) &&
        Objects.equals(this.encryptedAccount, standaloneTransaction.encryptedAccount) &&
        Objects.equals(this.checkboxes, standaloneTransaction.checkboxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, country, channel, division, callback, customer, customerScore, clientInfo, payment, products, style, preselection, mandate, installment, autoRegistration, allowRecurrence, account, encryptedAccount, checkboxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandaloneTransaction {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerScore: ").append(toIndentedString(customerScore)).append("\n");
    sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    preselection: ").append(toIndentedString(preselection)).append("\n");
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
    sb.append("    installment: ").append(toIndentedString(installment)).append("\n");
    sb.append("    autoRegistration: ").append(toIndentedString(autoRegistration)).append("\n");
    sb.append("    allowRecurrence: ").append(toIndentedString(allowRecurrence)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    encryptedAccount: ").append(toIndentedString(encryptedAccount)).append("\n");
    sb.append("    checkboxes: ").append(toIndentedString(checkboxes)).append("\n");
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

