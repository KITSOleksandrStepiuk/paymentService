package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * ExtraElement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class ExtraElement   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("checkbox")
  private Checkbox checkbox = null;

  public ExtraElement text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Descriptive text that should be displayed for this extra element
   * @return text
  **/
  @ApiModelProperty(value = "Descriptive text that should be displayed for this extra element")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ExtraElement checkbox(Checkbox checkbox) {
    this.checkbox = checkbox;
    return this;
  }

   /**
   * Checkbox parameters, 'null' if this extra element is a label
   * @return checkbox
  **/
  @ApiModelProperty(value = "Checkbox parameters, 'null' if this extra element is a label")

  @Valid

  public Checkbox getCheckbox() {
    return checkbox;
  }

  public void setCheckbox(Checkbox checkbox) {
    this.checkbox = checkbox;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraElement extraElement = (ExtraElement) o;
    return Objects.equals(this.text, extraElement.text) &&
        Objects.equals(this.checkbox, extraElement.checkbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, checkbox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraElement {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    checkbox: ").append(toIndentedString(checkbox)).append("\n");
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

