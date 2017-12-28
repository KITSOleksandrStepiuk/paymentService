package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StandaloneStyle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class StandaloneStyle   {
  @JsonProperty("language")
  private String language = null;

  public StandaloneStyle language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Preferred language for payment page; if undefined will be decided upon country information from transaction object; format [language code]_[COUNTRY CODE], where language code is according to ISO 639-1 (alpha-2), and country code is optional and according to ISO 3166-1 (alpha-2); e.g. \"de\" - for German, \"de_CH\" - for Swiss German 
   * @return language
  **/
  @ApiModelProperty(example = "en_GB", value = "Preferred language for payment page; if undefined will be decided upon country information from transaction object; format [language code]_[COUNTRY CODE], where language code is according to ISO 639-1 (alpha-2), and country code is optional and according to ISO 3166-1 (alpha-2); e.g. \"de\" - for German, \"de_CH\" - for Swiss German ")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandaloneStyle standaloneStyle = (StandaloneStyle) o;
    return Objects.equals(this.language, standaloneStyle.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandaloneStyle {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

