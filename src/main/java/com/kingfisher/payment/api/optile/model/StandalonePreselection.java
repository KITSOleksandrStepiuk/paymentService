package com.kingfisher.payment.api.optile.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StandalonePreselection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class StandalonePreselection   {
  /**
   * Instructs a deferred behavior of payment networks; see [Deferred Payments](https://www.optile.io/opg#285066)
   */
  public enum DeferralEnum {
    ANY("ANY"),
    
    DEFERRED("DEFERRED"),
    
    NON_DEFERRED("NON_DEFERRED");

    private String value;

    DeferralEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeferralEnum fromValue(String text) {
      for (DeferralEnum b : DeferralEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("deferral")
  private DeferralEnum deferral = null;

  @JsonProperty("networkCodes")
  private List<String> networkCodes = new ArrayList<String>();

  public StandalonePreselection deferral(DeferralEnum deferral) {
    this.deferral = deferral;
    return this;
  }

   /**
   * Instructs a deferred behavior of payment networks; see [Deferred Payments](https://www.optile.io/opg#285066)
   * @return deferral
  **/
  @ApiModelProperty(value = "Instructs a deferred behavior of payment networks; see [Deferred Payments](https://www.optile.io/opg#285066)")


  public DeferralEnum getDeferral() {
    return deferral;
  }

  public void setDeferral(DeferralEnum deferral) {
    this.deferral = deferral;
  }

  public StandalonePreselection networkCodes(List<String> networkCodes) {
    this.networkCodes = networkCodes;
    return this;
  }

  public StandalonePreselection addNetworkCodesItem(String networkCodesItem) {
    this.networkCodes.add(networkCodesItem);
    return this;
  }

   /**
   * Network codes for stand-alone operation; only one network code is expected
   * @return networkCodes
  **/
  @ApiModelProperty(required = true, value = "Network codes for stand-alone operation; only one network code is expected")
  @NotNull


  public List<String> getNetworkCodes() {
    return networkCodes;
  }

  public void setNetworkCodes(List<String> networkCodes) {
    this.networkCodes = networkCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandalonePreselection standalonePreselection = (StandalonePreselection) o;
    return Objects.equals(this.deferral, standalonePreselection.deferral) &&
        Objects.equals(this.networkCodes, standalonePreselection.networkCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deferral, networkCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandalonePreselection {\n");
    
    sb.append("    deferral: ").append(toIndentedString(deferral)).append("\n");
    sb.append("    networkCodes: ").append(toIndentedString(networkCodes)).append("\n");
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

