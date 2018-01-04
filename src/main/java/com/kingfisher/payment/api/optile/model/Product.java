package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Product
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Product   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("plannedShippingDate")
  private DateTime plannedShippingDate = null;

  @JsonProperty("productDescriptionUrl")
  private String productDescriptionUrl = null;

  @JsonProperty("productImageUrl")
  private String productImageUrl = null;

  public Product code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Identifier for this product given by the merchant; not validated for uniqueness by OPG, may appear on invoices
   * @return code
  **/
  @ApiModelProperty(example = "PN-001276", value = "Identifier for this product given by the merchant; not validated for uniqueness by OPG, may appear on invoices")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human readable name of the product; may appear on invoices
   * @return name
  **/
  @ApiModelProperty(example = "Juggling Balls (Red/Green/Blue)", required = true, value = "Human readable name of the product; may appear on invoices")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Reflects the price with respect to quantity; therefore a quantity of 2 and amount of 20.00 means that a single product cost 10.00; the sum of all product amounts has to match the total amount in the payment object, therefore they have to be supplied 
   * @return amount
  **/
  @ApiModelProperty(example = "15.35", value = "Reflects the price with respect to quantity; therefore a quantity of 2 and amount of 20.00 means that a single product cost 10.00; the sum of all product amounts has to match the total amount in the payment object, therefore they have to be supplied ")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Product currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the amount; format according to ISO-4217 form, e.g. \"EUR\", \"USD\"; if undefined the currency will be taken from payment object
   * @return currency
  **/
  @ApiModelProperty(example = "EUR", value = "Currency of the amount; format according to ISO-4217 form, e.g. \"EUR\", \"USD\"; if undefined the currency will be taken from payment object")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Product quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Product's quantity; default is 1
   * @return quantity
  **/
  @ApiModelProperty(example = "2", value = "Product's quantity; default is 1")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Product plannedShippingDate(DateTime plannedShippingDate) {
    this.plannedShippingDate = plannedShippingDate;
    return this;
  }

   /**
   * Date (or time stamp) of planned shipment
   * @return plannedShippingDate
  **/
  @ApiModelProperty(value = "Date (or time stamp) of planned shipment")

  @Valid

  public DateTime getPlannedShippingDate() {
    return plannedShippingDate;
  }

  public void setPlannedShippingDate(DateTime plannedShippingDate) {
    this.plannedShippingDate = plannedShippingDate;
  }

  public Product productDescriptionUrl(String productDescriptionUrl) {
    this.productDescriptionUrl = productDescriptionUrl;
    return this;
  }

   /**
   * URL to product's description page; this URL could been used by Payment Provider to build order-friendly payment page or during future communication with customer about this order 
   * @return productDescriptionUrl
  **/
  @ApiModelProperty(example = "https://www.shop.de/products/PN-001276.html", value = "URL to product's description page; this URL could been used by Payment Provider to build order-friendly payment page or during future communication with customer about this order ")


  public String getProductDescriptionUrl() {
    return productDescriptionUrl;
  }

  public void setProductDescriptionUrl(String productDescriptionUrl) {
    this.productDescriptionUrl = productDescriptionUrl;
  }

  public Product productImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
    return this;
  }

   /**
   * URL to product's image; this URL could been used by Payment Provider to build order-friendly payment page or during future communication with customer about this order 
   * @return productImageUrl
  **/
  @ApiModelProperty(example = "https://www.shop.de/images/products/PN-001276-logo.png", value = "URL to product's image; this URL could been used by Payment Provider to build order-friendly payment page or during future communication with customer about this order ")


  public String getProductImageUrl() {
    return productImageUrl;
  }

  public void setProductImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.code, product.code) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.amount, product.amount) &&
        Objects.equals(this.currency, product.currency) &&
        Objects.equals(this.quantity, product.quantity) &&
        Objects.equals(this.plannedShippingDate, product.plannedShippingDate) &&
        Objects.equals(this.productDescriptionUrl, product.productDescriptionUrl) &&
        Objects.equals(this.productImageUrl, product.productImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, amount, currency, quantity, plannedShippingDate, productDescriptionUrl, productImageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    plannedShippingDate: ").append(toIndentedString(plannedShippingDate)).append("\n");
    sb.append("    productDescriptionUrl: ").append(toIndentedString(productDescriptionUrl)).append("\n");
    sb.append("    productImageUrl: ").append(toIndentedString(productImageUrl)).append("\n");
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

