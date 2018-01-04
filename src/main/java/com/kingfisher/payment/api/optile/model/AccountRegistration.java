package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AccountRegistration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class AccountRegistration   {
  @JsonProperty("links")
  private AccountLinks links = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("maskedAccount")
  private AccountMask maskedAccount = null;

  @JsonProperty("lastSuccessfulChargeAt")
  private DateTime lastSuccessfulChargeAt = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  @JsonProperty("iFrameHeight")
  private Integer iFrameHeight = null;

  @JsonProperty("preferredAt")
  private DateTime preferredAt = null;

  @JsonProperty("createdAt")
  private DateTime createdAt = null;

  @JsonProperty("emptyForm")
  private Boolean emptyForm = null;

  @JsonProperty("localizedInputElements")
  private List<InputElement> localizedInputElements = null;

  public AccountRegistration links(AccountLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Collection of links related to this account registration
   * @return links
  **/
  @ApiModelProperty(required = true, value = "Collection of links related to this account registration")
  @NotNull

  @Valid

  public AccountLinks getLinks() {
    return links;
  }

  public void setLinks(AccountLinks links) {
    this.links = links;
  }

  public AccountRegistration code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Payment network code of the registration
   * @return code
  **/
  @ApiModelProperty(example = "AMEX", required = true, value = "Payment network code of the registration")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AccountRegistration label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Display lable of the payment network for this registration
   * @return label
  **/
  @ApiModelProperty(example = "American Express", required = true, value = "Display lable of the payment network for this registration")
  @NotNull


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public AccountRegistration maskedAccount(AccountMask maskedAccount) {
    this.maskedAccount = maskedAccount;
    return this;
  }

   /**
   * Masked account of this registration; sensitive fields of the account are removed, truncated, or replaced with mask characters
   * @return maskedAccount
  **/
  @ApiModelProperty(required = true, value = "Masked account of this registration; sensitive fields of the account are removed, truncated, or replaced with mask characters")
  @NotNull

  @Valid

  public AccountMask getMaskedAccount() {
    return maskedAccount;
  }

  public void setMaskedAccount(AccountMask maskedAccount) {
    this.maskedAccount = maskedAccount;
  }

  public AccountRegistration lastSuccessfulChargeAt(DateTime lastSuccessfulChargeAt) {
    this.lastSuccessfulChargeAt = lastSuccessfulChargeAt;
    return this;
  }

   /**
   * Time stamp of last successful `CHARGE` operation performed with this account
   * @return lastSuccessfulChargeAt
  **/
  @ApiModelProperty(value = "Time stamp of last successful `CHARGE` operation performed with this account")

  @Valid

  public DateTime getLastSuccessfulChargeAt() {
    return lastSuccessfulChargeAt;
  }

  public void setLastSuccessfulChargeAt(DateTime lastSuccessfulChargeAt) {
    this.lastSuccessfulChargeAt = lastSuccessfulChargeAt;
  }

  public AccountRegistration selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Indicates that this account registration is initially selected
   * @return selected
  **/
  @ApiModelProperty(value = "Indicates that this account registration is initially selected")


  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  public AccountRegistration iFrameHeight(Integer iFrameHeight) {
    this.iFrameHeight = iFrameHeight;
    return this;
  }

   /**
   * IFrame height for selective native, only supplied if \"iFrame\" link is present
   * @return iFrameHeight
  **/
  @ApiModelProperty(example = "35", value = "IFrame height for selective native, only supplied if \"iFrame\" link is present")


  public Integer getIFrameHeight() {
    return iFrameHeight;
  }

  public void setIFrameHeight(Integer iFrameHeight) {
    this.iFrameHeight = iFrameHeight;
  }

  public AccountRegistration preferredAt(DateTime preferredAt) {
    this.preferredAt = preferredAt;
    return this;
  }

   /**
   * Timestamp when this account was marked as preferred
   * @return preferredAt
  **/
  @ApiModelProperty(value = "Timestamp when this account was marked as preferred")

  @Valid

  public DateTime getPreferredAt() {
    return preferredAt;
  }

  public void setPreferredAt(DateTime preferredAt) {
    this.preferredAt = preferredAt;
  }

  public AccountRegistration createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp when this account was created
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-10-13T13:01:33.734+0000", value = "Timestamp when this account was created")

  @Valid

  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AccountRegistration emptyForm(Boolean emptyForm) {
    this.emptyForm = emptyForm;
    return this;
  }

   /**
   * Indicates that a form for this account is an empty one, without any text and input elements
   * @return emptyForm
  **/
  @ApiModelProperty(value = "Indicates that a form for this account is an empty one, without any text and input elements")


  public Boolean getEmptyForm() {
    return emptyForm;
  }

  public void setEmptyForm(Boolean emptyForm) {
    this.emptyForm = emptyForm;
  }

  public AccountRegistration localizedInputElements(List<InputElement> localizedInputElements) {
    this.localizedInputElements = localizedInputElements;
    return this;
  }

  public AccountRegistration addLocalizedInputElementsItem(InputElement localizedInputElementsItem) {
    if (this.localizedInputElements == null) {
      this.localizedInputElements = new ArrayList<InputElement>();
    }
    this.localizedInputElements.add(localizedInputElementsItem);
    return this;
  }

   /**
   * Collection of form-input-elements. This information is present only in the case of 'view' with `jsonForns` value. 
   * @return localizedInputElements
  **/
  @ApiModelProperty(value = "Collection of form-input-elements. This information is present only in the case of 'view' with `jsonForns` value. ")

  @Valid

  public List<InputElement> getLocalizedInputElements() {
    return localizedInputElements;
  }

  public void setLocalizedInputElements(List<InputElement> localizedInputElements) {
    this.localizedInputElements = localizedInputElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRegistration accountRegistration = (AccountRegistration) o;
    return Objects.equals(this.links, accountRegistration.links) &&
        Objects.equals(this.code, accountRegistration.code) &&
        Objects.equals(this.label, accountRegistration.label) &&
        Objects.equals(this.maskedAccount, accountRegistration.maskedAccount) &&
        Objects.equals(this.lastSuccessfulChargeAt, accountRegistration.lastSuccessfulChargeAt) &&
        Objects.equals(this.selected, accountRegistration.selected) &&
        Objects.equals(this.iFrameHeight, accountRegistration.iFrameHeight) &&
        Objects.equals(this.preferredAt, accountRegistration.preferredAt) &&
        Objects.equals(this.createdAt, accountRegistration.createdAt) &&
        Objects.equals(this.emptyForm, accountRegistration.emptyForm) &&
        Objects.equals(this.localizedInputElements, accountRegistration.localizedInputElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, code, label, maskedAccount, lastSuccessfulChargeAt, selected, iFrameHeight, preferredAt, createdAt, emptyForm, localizedInputElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRegistration {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    maskedAccount: ").append(toIndentedString(maskedAccount)).append("\n");
    sb.append("    lastSuccessfulChargeAt: ").append(toIndentedString(lastSuccessfulChargeAt)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    iFrameHeight: ").append(toIndentedString(iFrameHeight)).append("\n");
    sb.append("    preferredAt: ").append(toIndentedString(preferredAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    emptyForm: ").append(toIndentedString(emptyForm)).append("\n");
    sb.append("    localizedInputElements: ").append(toIndentedString(localizedInputElements)).append("\n");
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

