package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Checkbox
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Checkbox   {
  @JsonProperty("name")
  private String name = null;

  /**
   * Operating and display mode of this checkbox
   */
  public enum ModeEnum {
    OPTIONAL("OPTIONAL"),
    
    OPTIONAL_PRESELECTED("OPTIONAL_PRESELECTED"),
    
    REQUIRED("REQUIRED"),
    
    REQUIRED_PRESELECTED("REQUIRED_PRESELECTED"),
    
    FORCED("FORCED"),
    
    FORCED_DISPLAYED("FORCED_DISPLAYED");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mode")
  private ModeEnum mode = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("requireMsg")
  private String requireMsg = null;

  public Checkbox name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Disctinguish name of this checkbox element
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Disctinguish name of this checkbox element")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Checkbox mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Operating and display mode of this checkbox
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "Operating and display mode of this checkbox")
  @NotNull


  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public Checkbox label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Display lable for hte checkbox
   * @return label
  **/
  @ApiModelProperty(value = "Display lable for hte checkbox")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Checkbox requireMsg(String requireMsg) {
    this.requireMsg = requireMsg;
    return this;
  }

   /**
   * Error message that will be displayed if checkbox is required, but was not checked
   * @return requireMsg
  **/
  @ApiModelProperty(value = "Error message that will be displayed if checkbox is required, but was not checked")


  public String getRequireMsg() {
    return requireMsg;
  }

  public void setRequireMsg(String requireMsg) {
    this.requireMsg = requireMsg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Checkbox checkbox = (Checkbox) o;
    return Objects.equals(this.name, checkbox.name) &&
        Objects.equals(this.mode, checkbox.mode) &&
        Objects.equals(this.label, checkbox.label) &&
        Objects.equals(this.requireMsg, checkbox.requireMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mode, label, requireMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Checkbox {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    requireMsg: ").append(toIndentedString(requireMsg)).append("\n");
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

