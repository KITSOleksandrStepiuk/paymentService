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
 * Style
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Style   {
  @JsonProperty("language")
  private String language = null;

  @JsonProperty("theme")
  private String theme = null;

  @JsonProperty("cssOverride")
  private String cssOverride = null;

  /**
   * Customer's client type; has impact on payment page integration, only considered during `HOSTED` integration; if set to `RESPONSIVE` it will enabled new version of payment page for `HOSTED` integration type and return networks logo links pointing to high resolution images (see also `resolution` property) 
   */
  public enum ClientEnum {
    PHONE("PHONE"),
    
    DESKTOP("DESKTOP"),
    
    AUTO("AUTO"),
    
    RESPONSIVE("RESPONSIVE");

    private String value;

    ClientEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ClientEnum fromValue(String text) {
      for (ClientEnum b : ClientEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("client")
  private ClientEnum client = null;

  /**
   * Allows to define resolution of networks logo images; currently supported values `1x` - for _old_ images where the heght is 32px, and `2x` - for high resolution logos with double height (64px) 
   */
  public enum ResolutionEnum {
    _1X("1x"),
    
    _2X("2x");

    private String value;

    ResolutionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResolutionEnum fromValue(String text) {
      for (ResolutionEnum b : ResolutionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("resolution")
  private ResolutionEnum resolution = null;

  public Style language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Preferred language for payment page; if undefined will be decided upon country information from transaction object; format [language code]_[COUNTRY CODE], where language code is according to ISO 639-1 (alpha-2), and country code is optional and according to ISO 3166-1 (alpha-2); e.g. \"de\" - for German, \"de_CH\" - for Swiss German 
   * @return language
  **/
  @ApiModelProperty(example = "de_AT", value = "Preferred language for payment page; if undefined will be decided upon country information from transaction object; format [language code]_[COUNTRY CODE], where language code is according to ISO 639-1 (alpha-2), and country code is optional and according to ISO 3166-1 (alpha-2); e.g. \"de\" - for German, \"de_CH\" - for Swiss German ")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Style theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Theme code; e.g. light, dark, highcontrast (currently not supported in OPG II)
   * @return theme
  **/
  @ApiModelProperty(value = "Theme code; e.g. light, dark, highcontrast (currently not supported in OPG II)")


  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public Style cssOverride(String cssOverride) {
    this.cssOverride = cssOverride;
    return this;
  }

   /**
   * URL of merchant custom CSS for payment page; can be hosted anywhere but must be accessible through \"https\" ptotocol
   * @return cssOverride
  **/
  @ApiModelProperty(value = "URL of merchant custom CSS for payment page; can be hosted anywhere but must be accessible through \"https\" ptotocol")


  public String getCssOverride() {
    return cssOverride;
  }

  public void setCssOverride(String cssOverride) {
    this.cssOverride = cssOverride;
  }

  public Style client(ClientEnum client) {
    this.client = client;
    return this;
  }

   /**
   * Customer's client type; has impact on payment page integration, only considered during `HOSTED` integration; if set to `RESPONSIVE` it will enabled new version of payment page for `HOSTED` integration type and return networks logo links pointing to high resolution images (see also `resolution` property) 
   * @return client
  **/
  @ApiModelProperty(value = "Customer's client type; has impact on payment page integration, only considered during `HOSTED` integration; if set to `RESPONSIVE` it will enabled new version of payment page for `HOSTED` integration type and return networks logo links pointing to high resolution images (see also `resolution` property) ")


  public ClientEnum getClient() {
    return client;
  }

  public void setClient(ClientEnum client) {
    this.client = client;
  }

  public Style resolution(ResolutionEnum resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Allows to define resolution of networks logo images; currently supported values `1x` - for _old_ images where the heght is 32px, and `2x` - for high resolution logos with double height (64px) 
   * @return resolution
  **/
  @ApiModelProperty(value = "Allows to define resolution of networks logo images; currently supported values `1x` - for _old_ images where the heght is 32px, and `2x` - for high resolution logos with double height (64px) ")


  public ResolutionEnum getResolution() {
    return resolution;
  }

  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Style style = (Style) o;
    return Objects.equals(this.language, style.language) &&
        Objects.equals(this.theme, style.theme) &&
        Objects.equals(this.cssOverride, style.cssOverride) &&
        Objects.equals(this.client, style.client) &&
        Objects.equals(this.resolution, style.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, theme, cssOverride, client, resolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Style {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    cssOverride: ").append(toIndentedString(cssOverride)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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

