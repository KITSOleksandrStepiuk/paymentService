package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.ExtraElement;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExtraElements
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class ExtraElements   {
  @JsonProperty("top")
  private List<ExtraElement> top = null;

  @JsonProperty("bottom")
  private List<ExtraElement> bottom = null;

  public ExtraElements top(List<ExtraElement> top) {
    this.top = top;
    return this;
  }

  public ExtraElements addTopItem(ExtraElement topItem) {
    if (this.top == null) {
      this.top = new ArrayList<ExtraElement>();
    }
    this.top.add(topItem);
    return this;
  }

   /**
   * Collection of extra elements (labels and checkboxes) that should be displayed on the top of payment page
   * @return top
  **/
  @ApiModelProperty(value = "Collection of extra elements (labels and checkboxes) that should be displayed on the top of payment page")

  @Valid

  public List<ExtraElement> getTop() {
    return top;
  }

  public void setTop(List<ExtraElement> top) {
    this.top = top;
  }

  public ExtraElements bottom(List<ExtraElement> bottom) {
    this.bottom = bottom;
    return this;
  }

  public ExtraElements addBottomItem(ExtraElement bottomItem) {
    if (this.bottom == null) {
      this.bottom = new ArrayList<ExtraElement>();
    }
    this.bottom.add(bottomItem);
    return this;
  }

   /**
   * Collection of extra elements (labels and checkboxes) that should be displayed on the bottom of payment page
   * @return bottom
  **/
  @ApiModelProperty(value = "Collection of extra elements (labels and checkboxes) that should be displayed on the bottom of payment page")

  @Valid

  public List<ExtraElement> getBottom() {
    return bottom;
  }

  public void setBottom(List<ExtraElement> bottom) {
    this.bottom = bottom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtraElements extraElements = (ExtraElements) o;
    return Objects.equals(this.top, extraElements.top) &&
        Objects.equals(this.bottom, extraElements.bottom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(top, bottom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraElements {\n");
    
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
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

