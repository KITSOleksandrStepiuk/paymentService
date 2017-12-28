package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.AccountRegistration;
import com.kingfisher.payment.api.optile.model.Customer;
import com.kingfisher.payment.api.optile.model.CustomerLinks;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerRegistration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class CustomerRegistration   {
  @JsonProperty("links")
  private CustomerLinks links = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("accounts")
  private List<AccountRegistration> accounts = null;

  public CustomerRegistration links(CustomerLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Collection of links related to this customer resource
   * @return links
  **/
  @ApiModelProperty(required = true, value = "Collection of links related to this customer resource")
  @NotNull

  @Valid

  public CustomerLinks getLinks() {
    return links;
  }

  public void setLinks(CustomerLinks links) {
    this.links = links;
  }

  public CustomerRegistration customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Customer base information
   * @return customer
  **/
  @ApiModelProperty(required = true, value = "Customer base information")
  @NotNull

  @Valid

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public CustomerRegistration accounts(List<AccountRegistration> accounts) {
    this.accounts = accounts;
    return this;
  }

  public CustomerRegistration addAccountsItem(AccountRegistration accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<AccountRegistration>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Collection of registered accounts of this customer
   * @return accounts
  **/
  @ApiModelProperty(value = "Collection of registered accounts of this customer")

  @Valid

  public List<AccountRegistration> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccountRegistration> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRegistration customerRegistration = (CustomerRegistration) o;
    return Objects.equals(this.links, customerRegistration.links) &&
        Objects.equals(this.customer, customerRegistration.customer) &&
        Objects.equals(this.accounts, customerRegistration.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, customer, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRegistration {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

