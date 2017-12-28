package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.SelectOption;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InputElement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class InputElement   {
  @JsonProperty("name")
  private String name = null;

  /**
   * Input type / restrictions that can and should be enforced by the client for this input element: * `string` - one line of text without special restrictions * `numeric` - numbers 0-9 and the delimiters space and dash ('-') are allowed * `integer` - numbers 0-9 only * `select` - a list of possible values given in an additional options attribute * `checkbox` - checkbox type, what allows `true` for set and `null` (or `false`) for non-set values 
   */
  public enum TypeEnum {
    STRING("string"),
    
    NUMERIC("numeric"),
    
    INTEGER("integer"),
    
    SELECT("select"),
    
    CHECKBOX("checkbox");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("options")
  private List<SelectOption> options = null;

  public InputElement name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the parameter represented by this input element
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the parameter represented by this input element")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InputElement type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Input type / restrictions that can and should be enforced by the client for this input element: * `string` - one line of text without special restrictions * `numeric` - numbers 0-9 and the delimiters space and dash ('-') are allowed * `integer` - numbers 0-9 only * `select` - a list of possible values given in an additional options attribute * `checkbox` - checkbox type, what allows `true` for set and `null` (or `false`) for non-set values 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Input type / restrictions that can and should be enforced by the client for this input element: * `string` - one line of text without special restrictions * `numeric` - numbers 0-9 and the delimiters space and dash ('-') are allowed * `integer` - numbers 0-9 only * `select` - a list of possible values given in an additional options attribute * `checkbox` - checkbox type, what allows `true` for set and `null` (or `false`) for non-set values ")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InputElement label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The localized human readable label that should be displayed with the input field
   * @return label
  **/
  @ApiModelProperty(required = true, value = "The localized human readable label that should be displayed with the input field")
  @NotNull


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public InputElement options(List<SelectOption> options) {
    this.options = options;
    return this;
  }

  public InputElement addOptionsItem(SelectOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<SelectOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * An array of possible options in the case of `select` type
   * @return options
  **/
  @ApiModelProperty(value = "An array of possible options in the case of `select` type")

  @Valid

  public List<SelectOption> getOptions() {
    return options;
  }

  public void setOptions(List<SelectOption> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputElement inputElement = (InputElement) o;
    return Objects.equals(this.name, inputElement.name) &&
        Objects.equals(this.type, inputElement.type) &&
        Objects.equals(this.label, inputElement.label) &&
        Objects.equals(this.options, inputElement.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, label, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputElement {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

