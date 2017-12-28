package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kingfisher.payment.api.optile.model.Parameter;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Redirect
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Redirect   {
  @JsonProperty("url")
  private String url = null;

  /**
   * Advised HTTP method to use for the redirection
   */
  public enum MethodEnum {
    GET("GET"),
    
    POST("POST");

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

  @JsonProperty("parameters")
  private List<Parameter> parameters = null;

  @JsonProperty("suppressIFrame")
  private Boolean suppressIFrame = null;

  public Redirect url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to redirect customer's browser (or any other client) to
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL to redirect customer's browser (or any other client) to")
  @NotNull


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Redirect method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Advised HTTP method to use for the redirection
   * @return method
  **/
  @ApiModelProperty(required = true, value = "Advised HTTP method to use for the redirection")
  @NotNull


  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public Redirect parameters(List<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Redirect addParametersItem(Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<Parameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Collection of additional parameters to pass with this redirection
   * @return parameters
  **/
  @ApiModelProperty(value = "Collection of additional parameters to pass with this redirection")

  @Valid

  public List<Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }

  public Redirect suppressIFrame(Boolean suppressIFrame) {
    this.suppressIFrame = suppressIFrame;
    return this;
  }

   /**
   * If `true` redirect logic should ensure that IFrame is suppressed during redirection, if payment page or web-site resides inside one
   * @return suppressIFrame
  **/
  @ApiModelProperty(value = "If `true` redirect logic should ensure that IFrame is suppressed during redirection, if payment page or web-site resides inside one")


  public Boolean getSuppressIFrame() {
    return suppressIFrame;
  }

  public void setSuppressIFrame(Boolean suppressIFrame) {
    this.suppressIFrame = suppressIFrame;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Redirect redirect = (Redirect) o;
    return Objects.equals(this.url, redirect.url) &&
        Objects.equals(this.method, redirect.method) &&
        Objects.equals(this.parameters, redirect.parameters) &&
        Objects.equals(this.suppressIFrame, redirect.suppressIFrame);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, method, parameters, suppressIFrame);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Redirect {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    suppressIFrame: ").append(toIndentedString(suppressIFrame)).append("\n");
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

