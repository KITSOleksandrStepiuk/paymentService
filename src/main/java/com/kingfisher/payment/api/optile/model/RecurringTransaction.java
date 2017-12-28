package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.ClientInfo;
import com.kingfisher.payment.api.optile.model.Customer;
import com.kingfisher.payment.api.optile.model.Installment;
import com.kingfisher.payment.api.optile.model.Mandate;
import com.kingfisher.payment.api.optile.model.Payment;
import com.kingfisher.payment.api.optile.model.Product;
import com.kingfisher.payment.api.optile.model.RecurringCallback;
import com.kingfisher.payment.api.optile.model.RecurringPreselection;
import com.kingfisher.payment.api.optile.model.Style;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecurringTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class RecurringTransaction   {
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
  private RecurringCallback callback = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("clientInfo")
  private ClientInfo clientInfo = null;

  @JsonProperty("payment")
  private Payment payment = null;

  @JsonProperty("products")
  private List<Product> products = null;

  @JsonProperty("style")
  private Style style = null;

  @JsonProperty("preselection")
  private RecurringPreselection preselection = null;

  @JsonProperty("mandate")
  private Mandate mandate = null;

  @JsonProperty("installment")
  private Installment installment = null;

  public RecurringTransaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Identifier for this transaction given by the merchant; it is not validated for uniqueness by OPG, but may be checked for by some PSPs, thus recommended to be unique 
   * @return transactionId
  **/
  @ApiModelProperty(example = "SUB-090909/365", required = true, value = "Identifier for this transaction given by the merchant; it is not validated for uniqueness by OPG, but may be checked for by some PSPs, thus recommended to be unique ")
  @NotNull


  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public RecurringTransaction country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country where the payment is originating; this influences the selection of payment networks; format according to ISO 3166-1 (alpha-2), e.g. \"DE\", \"FR\", \"US\", \"GB\", etc. 
   * @return country
  **/
  @ApiModelProperty(example = "GB", required = true, value = "Country where the payment is originating; this influences the selection of payment networks; format according to ISO 3166-1 (alpha-2), e.g. \"DE\", \"FR\", \"US\", \"GB\", etc. ")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public RecurringTransaction channel(ChannelEnum channel) {
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

  public RecurringTransaction division(String division) {
    this.division = division;
    return this;
  }

   /**
   * There is always one default division that will be used if this property is undefined; different divisions can be configured with different setup, contracts, payment routes and network options 
   * @return division
  **/
  @ApiModelProperty(example = "subscriptions", value = "There is always one default division that will be used if this property is undefined; different divisions can be configured with different setup, contracts, payment routes and network options ")


  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public RecurringTransaction callback(RecurringCallback callback) {
    this.callback = callback;
    return this;
  }

   /**
   * Callback information about merchants shop system; it is strongly advised to provide this data with each transaction
   * @return callback
  **/
  @ApiModelProperty(value = "Callback information about merchants shop system; it is strongly advised to provide this data with each transaction")

  @Valid

  public RecurringCallback getCallback() {
    return callback;
  }

  public void setCallback(RecurringCallback callback) {
    this.callback = callback;
  }

  public RecurringTransaction customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Information about customer
   * @return customer
  **/
  @ApiModelProperty(value = "Information about customer")

  @Valid

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public RecurringTransaction clientInfo(ClientInfo clientInfo) {
    this.clientInfo = clientInfo;
    return this;
  }

   /**
   * Information about customers client (web browser, mobile device, etc.)  **Deprecation note:** this information is not expected during recurring charge and should not be supplied. 
   * @return clientInfo
  **/
  @ApiModelProperty(value = "Information about customers client (web browser, mobile device, etc.)  **Deprecation note:** this information is not expected during recurring charge and should not be supplied. ")

  @Valid

  public ClientInfo getClientInfo() {
    return clientInfo;
  }

  public void setClientInfo(ClientInfo clientInfo) {
    this.clientInfo = clientInfo;
  }

  public RecurringTransaction payment(Payment payment) {
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

  public RecurringTransaction products(List<Product> products) {
    this.products = products;
    return this;
  }

  public RecurringTransaction addProductsItem(Product productsItem) {
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

  public RecurringTransaction style(Style style) {
    this.style = style;
    return this;
  }

   /**
   * Default appearance of payment page can be overwritten with these style parameters  **Deprecation note:** this information is not expected during recurring charge and should not be supplied. 
   * @return style
  **/
  @ApiModelProperty(value = "Default appearance of payment page can be overwritten with these style parameters  **Deprecation note:** this information is not expected during recurring charge and should not be supplied. ")

  @Valid

  public Style getStyle() {
    return style;
  }

  public void setStyle(Style style) {
    this.style = style;
  }

  public RecurringTransaction preselection(RecurringPreselection preselection) {
    this.preselection = preselection;
    return this;
  }

   /**
   * The preselection group includes parameters to steer payment network specific behavior like deferral or recurrence during recurring payment 
   * @return preselection
  **/
  @ApiModelProperty(value = "The preselection group includes parameters to steer payment network specific behavior like deferral or recurrence during recurring payment ")

  @Valid

  public RecurringPreselection getPreselection() {
    return preselection;
  }

  public void setPreselection(RecurringPreselection preselection) {
    this.preselection = preselection;
  }

  public RecurringTransaction mandate(Mandate mandate) {
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

  public RecurringTransaction installment(Installment installment) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringTransaction recurringTransaction = (RecurringTransaction) o;
    return Objects.equals(this.transactionId, recurringTransaction.transactionId) &&
        Objects.equals(this.country, recurringTransaction.country) &&
        Objects.equals(this.channel, recurringTransaction.channel) &&
        Objects.equals(this.division, recurringTransaction.division) &&
        Objects.equals(this.callback, recurringTransaction.callback) &&
        Objects.equals(this.customer, recurringTransaction.customer) &&
        Objects.equals(this.clientInfo, recurringTransaction.clientInfo) &&
        Objects.equals(this.payment, recurringTransaction.payment) &&
        Objects.equals(this.products, recurringTransaction.products) &&
        Objects.equals(this.style, recurringTransaction.style) &&
        Objects.equals(this.preselection, recurringTransaction.preselection) &&
        Objects.equals(this.mandate, recurringTransaction.mandate) &&
        Objects.equals(this.installment, recurringTransaction.installment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, country, channel, division, callback, customer, clientInfo, payment, products, style, preselection, mandate, installment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringTransaction {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    preselection: ").append(toIndentedString(preselection)).append("\n");
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

