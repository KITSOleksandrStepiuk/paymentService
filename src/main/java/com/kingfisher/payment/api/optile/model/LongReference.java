package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * LongReference
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class LongReference   {
  @JsonProperty("essential")
  private String essential = null;

  @JsonProperty("extended")
  private String extended = null;

  @JsonProperty("verbose")
  private String verbose = null;

  public LongReference essential(String essential) {
    this.essential = essential;
    return this;
  }

   /**
   * Essential part of payment's long reference; max 32 chars
   * @return essential
  **/
  @ApiModelProperty(example = "www.shop.de 0001452", required = true, value = "Essential part of payment's long reference; max 32 chars")
  @NotNull


  public String getEssential() {
    return essential;
  }

  public void setEssential(String essential) {
    this.essential = essential;
  }

  public LongReference extended(String extended) {
    this.extended = extended;
    return this;
  }

   /**
   * Extended part of payment's long reference; max 32 chars
   * @return extended
  **/
  @ApiModelProperty(example = "Questions? +49 89 678321456", value = "Extended part of payment's long reference; max 32 chars")


  public String getExtended() {
    return extended;
  }

  public void setExtended(String extended) {
    this.extended = extended;
  }

  public LongReference verbose(String verbose) {
    this.verbose = verbose;
    return this;
  }

   /**
   * Verbose part of payment's long reference; max 32 chars
   * @return verbose
  **/
  @ApiModelProperty(example = "Thank you for your purchase!", value = "Verbose part of payment's long reference; max 32 chars")


  public String getVerbose() {
    return verbose;
  }

  public void setVerbose(String verbose) {
    this.verbose = verbose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongReference longReference = (LongReference) o;
    return Objects.equals(this.essential, longReference.essential) &&
        Objects.equals(this.extended, longReference.extended) &&
        Objects.equals(this.verbose, longReference.verbose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(essential, extended, verbose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongReference {\n");
    
    sb.append("    essential: ").append(toIndentedString(essential)).append("\n");
    sb.append("    extended: ").append(toIndentedString(extended)).append("\n");
    sb.append("    verbose: ").append(toIndentedString(verbose)).append("\n");
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

