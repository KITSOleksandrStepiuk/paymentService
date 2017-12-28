package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.FormData;
import com.kingfisher.payment.api.optile.model.InputElement;
import com.kingfisher.payment.api.optile.model.NetworkLinks;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicableNetwork
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class ApplicableNetwork   {
  @JsonProperty("links")
  private NetworkLinks links = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("label")
  private String label = null;

  /**
   * Indicates payment method this network belongs to
   */
  public enum MethodEnum {
    BANK_TRANSFER("BANK_TRANSFER"),
    
    BILLING_PROVIDER("BILLING_PROVIDER"),
    
    CASH_ON_DELIVERY("CASH_ON_DELIVERY"),
    
    CHECK_PAYMENT("CHECK_PAYMENT"),
    
    CREDIT_CARD("CREDIT_CARD"),
    
    DEBIT_CARD("DEBIT_CARD"),
    
    DIRECT_DEBIT("DIRECT_DEBIT"),
    
    ELECTRONIC_INVOICE("ELECTRONIC_INVOICE"),
    
    GIFT_CARD("GIFT_CARD"),
    
    MOBILE_PAYMENT("MOBILE_PAYMENT"),
    
    ONLINE_BANK_TRANSFER("ONLINE_BANK_TRANSFER"),
    
    OPEN_INVOICE("OPEN_INVOICE"),
    
    PREPAID_CARD("PREPAID_CARD"),
    
    TERMINAL("TERMINAL"),
    
    WALLET("WALLET");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("method")
  private MethodEnum method = null;

  @JsonProperty("grouping")
  private String grouping = null;

  /**
   * Indicates whether this payment network supports registration and how this should be presented on payment page
   */
  public enum RegistrationEnum {
    NONE("NONE"),
    
    OPTIONAL("OPTIONAL"),
    
    FORCED("FORCED"),
    
    OPTIONAL_PRESELECTED("OPTIONAL_PRESELECTED"),
    
    FORCED_DISPLAYED("FORCED_DISPLAYED");

    private String value;

    RegistrationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RegistrationEnum fromValue(String text) {
      for (RegistrationEnum b : RegistrationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("registration")
  private RegistrationEnum registration = null;

  /**
   * Indicates whether this payment network supports recurring registration and how this should be presented on payment page
   */
  public enum RecurrenceEnum {
    NONE("NONE"),
    
    OPTIONAL("OPTIONAL"),
    
    FORCED("FORCED"),
    
    OPTIONAL_PRESELECTED("OPTIONAL_PRESELECTED"),
    
    FORCED_DISPLAYED("FORCED_DISPLAYED");

    private String value;

    RecurrenceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RecurrenceEnum fromValue(String text) {
      for (RecurrenceEnum b : RecurrenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("recurrence")
  private RecurrenceEnum recurrence = null;

  @JsonProperty("redirect")
  private Boolean redirect = null;

  @JsonProperty("button")
  private String button = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  @JsonProperty("formData")
  private FormData formData = null;

  @JsonProperty("iFrameHeight")
  private Integer iFrameHeight = null;

  @JsonProperty("emptyForm")
  private Boolean emptyForm = null;

  @JsonProperty("localizedInputElements")
  private List<InputElement> localizedInputElements = null;

  public ApplicableNetwork links(NetworkLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Collection of links related to this payment network in scope of the `LIST` session
   * @return links
  **/
  @ApiModelProperty(required = true, value = "Collection of links related to this payment network in scope of the `LIST` session")
  @NotNull

  @Valid

  public NetworkLinks getLinks() {
    return links;
  }

  public void setLinks(NetworkLinks links) {
    this.links = links;
  }

  public ApplicableNetwork code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Payment network code
   * @return code
  **/
  @ApiModelProperty(example = "VISA", required = true, value = "Payment network code")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ApplicableNetwork label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Display lable of the payment network
   * @return label
  **/
  @ApiModelProperty(example = "Visa", required = true, value = "Display lable of the payment network")
  @NotNull


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ApplicableNetwork method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Indicates payment method this network belongs to
   * @return method
  **/
  @ApiModelProperty(example = "CREDIT_CARD", required = true, value = "Indicates payment method this network belongs to")
  @NotNull


  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public ApplicableNetwork grouping(String grouping) {
    this.grouping = grouping;
    return this;
  }

   /**
   * Groupping code; helps to group several payment networks together while displaying them on payment page (e.g. credit cards)
   * @return grouping
  **/
  @ApiModelProperty(example = "CREDIT_CARD", required = true, value = "Groupping code; helps to group several payment networks together while displaying them on payment page (e.g. credit cards)")
  @NotNull


  public String getGrouping() {
    return grouping;
  }

  public void setGrouping(String grouping) {
    this.grouping = grouping;
  }

  public ApplicableNetwork registration(RegistrationEnum registration) {
    this.registration = registration;
    return this;
  }

   /**
   * Indicates whether this payment network supports registration and how this should be presented on payment page
   * @return registration
  **/
  @ApiModelProperty(required = true, value = "Indicates whether this payment network supports registration and how this should be presented on payment page")
  @NotNull


  public RegistrationEnum getRegistration() {
    return registration;
  }

  public void setRegistration(RegistrationEnum registration) {
    this.registration = registration;
  }

  public ApplicableNetwork recurrence(RecurrenceEnum recurrence) {
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Indicates whether this payment network supports recurring registration and how this should be presented on payment page
   * @return recurrence
  **/
  @ApiModelProperty(required = true, value = "Indicates whether this payment network supports recurring registration and how this should be presented on payment page")
  @NotNull


  public RecurrenceEnum getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(RecurrenceEnum recurrence) {
    this.recurrence = recurrence;
  }

  public ApplicableNetwork redirect(Boolean redirect) {
    this.redirect = redirect;
    return this;
  }

   /**
   * If `true` the payment via this network will result in redirect to the PSP web-site (e.g. PayPal, Sofortüberweisung, etc.)
   * @return redirect
  **/
  @ApiModelProperty(required = true, value = "If `true` the payment via this network will result in redirect to the PSP web-site (e.g. PayPal, Sofortüberweisung, etc.)")
  @NotNull


  public Boolean getRedirect() {
    return redirect;
  }

  public void setRedirect(Boolean redirect) {
    this.redirect = redirect;
  }

  public ApplicableNetwork button(String button) {
    this.button = button;
    return this;
  }

   /**
   * Code of button-label when this network is selected
   * @return button
  **/
  @ApiModelProperty(example = "button.charge.label", value = "Code of button-label when this network is selected")


  public String getButton() {
    return button;
  }

  public void setButton(String button) {
    this.button = button;
  }

  public ApplicableNetwork selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * If `true` this network should been initially pre-selected
   * @return selected
  **/
  @ApiModelProperty(value = "If `true` this network should been initially pre-selected")


  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  public ApplicableNetwork formData(FormData formData) {
    this.formData = formData;
    return this;
  }

   /**
   * Data what should been used to dynamically pre-fill a form for this network
   * @return formData
  **/
  @ApiModelProperty(value = "Data what should been used to dynamically pre-fill a form for this network")

  @Valid

  public FormData getFormData() {
    return formData;
  }

  public void setFormData(FormData formData) {
    this.formData = formData;
  }

  public ApplicableNetwork iFrameHeight(Integer iFrameHeight) {
    this.iFrameHeight = iFrameHeight;
    return this;
  }

   /**
   * IFrame height for selective native, only supplied if \"iFrame\" link is present
   * @return iFrameHeight
  **/
  @ApiModelProperty(example = "160", value = "IFrame height for selective native, only supplied if \"iFrame\" link is present")


  public Integer getIFrameHeight() {
    return iFrameHeight;
  }

  public void setIFrameHeight(Integer iFrameHeight) {
    this.iFrameHeight = iFrameHeight;
  }

  public ApplicableNetwork emptyForm(Boolean emptyForm) {
    this.emptyForm = emptyForm;
    return this;
  }

   /**
   * Indicates that a form for this network is an empty one, without any text and input elements
   * @return emptyForm
  **/
  @ApiModelProperty(value = "Indicates that a form for this network is an empty one, without any text and input elements")


  public Boolean getEmptyForm() {
    return emptyForm;
  }

  public void setEmptyForm(Boolean emptyForm) {
    this.emptyForm = emptyForm;
  }

  public ApplicableNetwork localizedInputElements(List<InputElement> localizedInputElements) {
    this.localizedInputElements = localizedInputElements;
    return this;
  }

  public ApplicableNetwork addLocalizedInputElementsItem(InputElement localizedInputElementsItem) {
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
    ApplicableNetwork applicableNetwork = (ApplicableNetwork) o;
    return Objects.equals(this.links, applicableNetwork.links) &&
        Objects.equals(this.code, applicableNetwork.code) &&
        Objects.equals(this.label, applicableNetwork.label) &&
        Objects.equals(this.method, applicableNetwork.method) &&
        Objects.equals(this.grouping, applicableNetwork.grouping) &&
        Objects.equals(this.registration, applicableNetwork.registration) &&
        Objects.equals(this.recurrence, applicableNetwork.recurrence) &&
        Objects.equals(this.redirect, applicableNetwork.redirect) &&
        Objects.equals(this.button, applicableNetwork.button) &&
        Objects.equals(this.selected, applicableNetwork.selected) &&
        Objects.equals(this.formData, applicableNetwork.formData) &&
        Objects.equals(this.iFrameHeight, applicableNetwork.iFrameHeight) &&
        Objects.equals(this.emptyForm, applicableNetwork.emptyForm) &&
        Objects.equals(this.localizedInputElements, applicableNetwork.localizedInputElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, code, label, method, grouping, registration, recurrence, redirect, button, selected, formData, iFrameHeight, emptyForm, localizedInputElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicableNetwork {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    iFrameHeight: ").append(toIndentedString(iFrameHeight)).append("\n");
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

