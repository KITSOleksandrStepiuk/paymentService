package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.Callback;
import com.kingfisher.payment.api.optile.model.ClientInfo;
import com.kingfisher.payment.api.optile.model.Customer;
import com.kingfisher.payment.api.optile.model.ExtraElements;
import com.kingfisher.payment.api.optile.model.Installment;
import com.kingfisher.payment.api.optile.model.Mandate;
import com.kingfisher.payment.api.optile.model.Payment;
import com.kingfisher.payment.api.optile.model.Preselection;
import com.kingfisher.payment.api.optile.model.Product;
import com.kingfisher.payment.api.optile.model.Style;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Transaction   {
  /**
   * Defines what integration scenarion this payment session is initialized for, default is `DISPLAY_NATIVE`. Selected scenario has an impact on operation URLs within response, they will be adjusted for selected integration scenario.  Possible integration types:   * `DISPLAY_NATIVE` (legacy name `NATIVE_WITHOUT_PCI`) - integration scenario where payment requests are sent from customer     browser directly to optile web service, but the logic to do so is implemented and/or rendered by merchant web-site.     Merchant has to be PCI DSS (**SAQ A-EP**) compliant to process payments with Credit/Debit Cards.   * `PURE_NATIVE` (legacy name `NATIVE_WITH_PCI`) - full native integration scenario where all requests (including payments)     are sent from merchant backend server. Merchant has to be PCI DSS (**SAQ D** - highest level of compliance) compliant to     process payments with Credit/Debit Cards.   * `HOSTED` - integration scenario where payment requests are sent from page rendered by optile server either direct in     browser or inside the IFrame of merchants web-site. Merchant has to be PCI DSS (**SAQ A** - lowest level of compliance)     compliant to process payments with Credit/Debit Cards.   * `SELECTIVE_NATIVE` - integration scenario where payment requests are sent from customer browser directly to optile web     service, but the logic to do so is implemented and/or rendered by merchant web-site for all methods except Credit/Debit     Cards. Credit/Debit Cards payments are rendered within IFrame served from optile server. Merchant has to be PCI DSS     (**SAQ A** - lowest level of compliance) compliant to process payments with Credit/Debit Cards.  See [Integration Scenarios](https://www.optile.io/opg#284716) chapter for detailed comparison of different integration types with optile payment service. 
   */

  public enum IntegrationEnum {
    DISPLAY_NATIVE("DISPLAY_NATIVE"),
    
    PURE_NATIVE("PURE_NATIVE"),
    
    HOSTED("HOSTED"),
    
    SELECTIVE_NATIVE("SELECTIVE_NATIVE");

    private String value;

    IntegrationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IntegrationEnum fromValue(String text) {
      for (IntegrationEnum b : IntegrationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("integration")
  private IntegrationEnum integration = null;

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

  @JsonProperty("updateOnly")
  private Boolean updateOnly = null;

  @JsonProperty("presetFirst")
  private Boolean presetFirst = null;

  @JsonProperty("style")
  private Style style = null;

  @JsonProperty("preselection")
  private Preselection preselection = null;

  @JsonProperty("extraElements")
  private ExtraElements extraElements = null;

  @JsonProperty("mandate")
  private Mandate mandate = null;

  @JsonProperty("installment")
  private Installment installment = null;

  public Transaction integration(IntegrationEnum integration) {
    this.integration = integration;
    return this;
  }

   /**
   * Defines what integration scenarion this payment session is initialized for, default is `DISPLAY_NATIVE`. Selected scenario has an impact on operation URLs within response, they will be adjusted for selected integration scenario.  Possible integration types:   * `DISPLAY_NATIVE` (legacy name `NATIVE_WITHOUT_PCI`) - integration scenario where payment requests are sent from customer     browser directly to optile web service, but the logic to do so is implemented and/or rendered by merchant web-site.     Merchant has to be PCI DSS (**SAQ A-EP**) compliant to process payments with Credit/Debit Cards.   * `PURE_NATIVE` (legacy name `NATIVE_WITH_PCI`) - full native integration scenario where all requests (including payments)     are sent from merchant backend server. Merchant has to be PCI DSS (**SAQ D** - highest level of compliance) compliant to     process payments with Credit/Debit Cards.   * `HOSTED` - integration scenario where payment requests are sent from page rendered by optile server either direct in     browser or inside the IFrame of merchants web-site. Merchant has to be PCI DSS (**SAQ A** - lowest level of compliance)     compliant to process payments with Credit/Debit Cards.   * `SELECTIVE_NATIVE` - integration scenario where payment requests are sent from customer browser directly to optile web     service, but the logic to do so is implemented and/or rendered by merchant web-site for all methods except Credit/Debit     Cards. Credit/Debit Cards payments are rendered within IFrame served from optile server. Merchant has to be PCI DSS     (**SAQ A** - lowest level of compliance) compliant to process payments with Credit/Debit Cards.  See [Integration Scenarios](https://www.optile.io/opg#284716) chapter for detailed comparison of different integration types with optile payment service. 
   * @return integration
  **/
  @ApiModelProperty(value = "Defines what integration scenarion this payment session is initialized for, default is `DISPLAY_NATIVE`. Selected scenario has an impact on operation URLs within response, they will be adjusted for selected integration scenario.  Possible integration types:   * `DISPLAY_NATIVE` (legacy name `NATIVE_WITHOUT_PCI`) - integration scenario where payment requests are sent from customer     browser directly to optile web service, but the logic to do so is implemented and/or rendered by merchant web-site.     Merchant has to be PCI DSS (**SAQ A-EP**) compliant to process payments with Credit/Debit Cards.   * `PURE_NATIVE` (legacy name `NATIVE_WITH_PCI`) - full native integration scenario where all requests (including payments)     are sent from merchant backend server. Merchant has to be PCI DSS (**SAQ D** - highest level of compliance) compliant to     process payments with Credit/Debit Cards.   * `HOSTED` - integration scenario where payment requests are sent from page rendered by optile server either direct in     browser or inside the IFrame of merchants web-site. Merchant has to be PCI DSS (**SAQ A** - lowest level of compliance)     compliant to process payments with Credit/Debit Cards.   * `SELECTIVE_NATIVE` - integration scenario where payment requests are sent from customer browser directly to optile web     service, but the logic to do so is implemented and/or rendered by merchant web-site for all methods except Credit/Debit     Cards. Credit/Debit Cards payments are rendered within IFrame served from optile server. Merchant has to be PCI DSS     (**SAQ A** - lowest level of compliance) compliant to process payments with Credit/Debit Cards.  See [Integration Scenarios](https://www.optile.io/opg#284716) chapter for detailed comparison of different integration types with optile payment service. ")


  public IntegrationEnum getIntegration() {
    return integration;
  }

  public void setIntegration(IntegrationEnum integration) {
    this.integration = integration;
  }

  public Transaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Identifier for this transaction given by the merchant; it is not validated for uniqueness by OPG, but may be checked for by some PSPs, thus recommended to be unique 
   * @return transactionId
  **/
  @ApiModelProperty(example = "O-000016565/0176", required = true, value = "Identifier for this transaction given by the merchant; it is not validated for uniqueness by OPG, but may be checked for by some PSPs, thus recommended to be unique ")
  @NotNull


  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country where the payment is originating; this influences the selection of payment networks; format according to ISO 3166-1 (alpha-2), e.g. \"DE\", \"FR\", \"US\", \"GB\", etc. 
   * @return country
  **/
  @ApiModelProperty(example = "FR", required = true, value = "Country where the payment is originating; this influences the selection of payment networks; format according to ISO 3166-1 (alpha-2), e.g. \"DE\", \"FR\", \"US\", \"GB\", etc. ")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Transaction channel(ChannelEnum channel) {
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

  public Transaction division(String division) {
    this.division = division;
    return this;
  }

   /**
   * There is always one default division that will be used if this property is undefined; different divisions can be configured with different setup, contracts, payment routes and network options 
   * @return division
  **/
  @ApiModelProperty(example = "main_division", value = "There is always one default division that will be used if this property is undefined; different divisions can be configured with different setup, contracts, payment routes and network options ")


  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public Transaction callback(Callback callback) {
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

  public Transaction customer(Customer customer) {
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

  public Transaction customerScore(Integer customerScore) {
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

  public Transaction clientInfo(ClientInfo clientInfo) {
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

  public Transaction payment(Payment payment) {
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

  public Transaction products(List<Product> products) {
    this.products = products;
    return this;
  }

  public Transaction addProductsItem(Product productsItem) {
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

  public Transaction updateOnly(Boolean updateOnly) {
    this.updateOnly = updateOnly;
    return this;
  }

   /**
   * Indicates that this `LIST` transaction is initiated only to update existing or register a new payment network of the recurring customer;  payment will note take place in scope of this session 
   * @return updateOnly
  **/
  @ApiModelProperty(value = "Indicates that this `LIST` transaction is initiated only to update existing or register a new payment network of the recurring customer;  payment will note take place in scope of this session ")


  public Boolean getUpdateOnly() {
    return updateOnly;
  }

  public void setUpdateOnly(Boolean updateOnly) {
    this.updateOnly = updateOnly;
  }

  public Transaction presetFirst(Boolean presetFirst) {
    this.presetFirst = presetFirst;
    return this;
  }

   /**
   * Indicates that this `LIST` transaction is initiated with 'preset' option, when selected by customer network and provided account are saved in the system until this `LIST` session will be closed by additional `CHARGE` request; callback must contain 'summaryUrl' with this type of `LIST` transaction 
   * @return presetFirst
  **/
  @ApiModelProperty(value = "Indicates that this `LIST` transaction is initiated with 'preset' option, when selected by customer network and provided account are saved in the system until this `LIST` session will be closed by additional `CHARGE` request; callback must contain 'summaryUrl' with this type of `LIST` transaction ")


  public Boolean getPresetFirst() {
    return presetFirst;
  }

  public void setPresetFirst(Boolean presetFirst) {
    this.presetFirst = presetFirst;
  }

  public Transaction style(Style style) {
    this.style = style;
    return this;
  }

   /**
   * Default appearance of payment page can be overwritten with these style parameters
   * @return style
  **/
  @ApiModelProperty(value = "Default appearance of payment page can be overwritten with these style parameters")

  @Valid

  public Style getStyle() {
    return style;
  }

  public void setStyle(Style style) {
    this.style = style;
  }

  public Transaction preselection(Preselection preselection) {
    this.preselection = preselection;
    return this;
  }

   /**
   * The preselection group includes parameters to control the list of preselected payment networks and to steer payment network specific behavior like deferral or recurrence 
   * @return preselection
  **/
  @ApiModelProperty(value = "The preselection group includes parameters to control the list of preselected payment networks and to steer payment network specific behavior like deferral or recurrence ")

  @Valid

  public Preselection getPreselection() {
    return preselection;
  }

  public void setPreselection(Preselection preselection) {
    this.preselection = preselection;
  }

  public Transaction extraElements(ExtraElements extraElements) {
    this.extraElements = extraElements;
    return this;
  }

   /**
   * Extra elements that should be rendered on payment page; intended for additional labels and checkboxes
   * @return extraElements
  **/
  @ApiModelProperty(value = "Extra elements that should be rendered on payment page; intended for additional labels and checkboxes")

  @Valid

  public ExtraElements getExtraElements() {
    return extraElements;
  }

  public void setExtraElements(ExtraElements extraElements) {
    this.extraElements = extraElements;
  }

  public Transaction mandate(Mandate mandate) {
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

  public Transaction installment(Installment installment) {
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
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.integration, transaction.integration) &&
        Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.country, transaction.country) &&
        Objects.equals(this.channel, transaction.channel) &&
        Objects.equals(this.division, transaction.division) &&
        Objects.equals(this.callback, transaction.callback) &&
        Objects.equals(this.customer, transaction.customer) &&
        Objects.equals(this.customerScore, transaction.customerScore) &&
        Objects.equals(this.clientInfo, transaction.clientInfo) &&
        Objects.equals(this.payment, transaction.payment) &&
        Objects.equals(this.products, transaction.products) &&
        Objects.equals(this.updateOnly, transaction.updateOnly) &&
        Objects.equals(this.presetFirst, transaction.presetFirst) &&
        Objects.equals(this.style, transaction.style) &&
        Objects.equals(this.preselection, transaction.preselection) &&
        Objects.equals(this.extraElements, transaction.extraElements) &&
        Objects.equals(this.mandate, transaction.mandate) &&
        Objects.equals(this.installment, transaction.installment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integration, transactionId, country, channel, division, callback, customer, customerScore, clientInfo, payment, products, updateOnly, presetFirst, style, preselection, extraElements, mandate, installment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
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
    sb.append("    updateOnly: ").append(toIndentedString(updateOnly)).append("\n");
    sb.append("    presetFirst: ").append(toIndentedString(presetFirst)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    preselection: ").append(toIndentedString(preselection)).append("\n");
    sb.append("    extraElements: ").append(toIndentedString(extraElements)).append("\n");
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

