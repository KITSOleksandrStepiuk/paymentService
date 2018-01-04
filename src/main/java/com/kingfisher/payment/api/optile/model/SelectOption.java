package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * SelectOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class SelectOption   {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  public SelectOption value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value for this option
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value for this option")
  @NotNull


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SelectOption label(String label) {
    this.label = label;
    return this;
  }

   /**
   * A localized label what should be displayed to the customer
   * @return label
  **/
  @ApiModelProperty(value = "A localized label what should be displayed to the customer")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public SelectOption selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * If set to `true` this option should be pre-selected, otherwise no specific behaviour should be applied for this option
   * @return selected
  **/
  @ApiModelProperty(value = "If set to `true` this option should be pre-selected, otherwise no specific behaviour should be applied for this option")


  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectOption selectOption = (SelectOption) o;
    return Objects.equals(this.value, selectOption.value) &&
        Objects.equals(this.label, selectOption.label) &&
        Objects.equals(this.selected, selectOption.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, label, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectOption {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

