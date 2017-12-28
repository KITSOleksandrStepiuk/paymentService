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
 * Preselection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Preselection   {
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

  /**
   * Defines a direction of initialized `LIST` session; `CHARGE` for payment direction (default), `PAYOUT` for pay out (credit); see [Payout Page](https://www.optile.io/opg#292237) 
   */
  public enum DirectionEnum {
    CHARGE("CHARGE"),
    
    PAYOUT("PAYOUT");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("direction")
  private DirectionEnum direction = null;

  /**
   * Indicates what type of payment networks should appear in `LIST` response for selection; default behavior ANY
   */
  public enum NetworksEnum {
    ANY("ANY"),
    
    APPLICABLE("APPLICABLE"),
    
    REGISTERED("REGISTERED");

    private String value;

    NetworksEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NetworksEnum fromValue(String text) {
      for (NetworksEnum b : NetworksEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("networks")
  private NetworksEnum networks = null;

  @JsonProperty("networkCodes")
  private List<String> networkCodes = null;

  public Preselection deferral(DeferralEnum deferral) {
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

  public Preselection direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Defines a direction of initialized `LIST` session; `CHARGE` for payment direction (default), `PAYOUT` for pay out (credit); see [Payout Page](https://www.optile.io/opg#292237) 
   * @return direction
  **/
  @ApiModelProperty(value = "Defines a direction of initialized `LIST` session; `CHARGE` for payment direction (default), `PAYOUT` for pay out (credit); see [Payout Page](https://www.optile.io/opg#292237) ")


  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public Preselection networks(NetworksEnum networks) {
    this.networks = networks;
    return this;
  }

   /**
   * Indicates what type of payment networks should appear in `LIST` response for selection; default behavior ANY
   * @return networks
  **/
  @ApiModelProperty(value = "Indicates what type of payment networks should appear in `LIST` response for selection; default behavior ANY")


  public NetworksEnum getNetworks() {
    return networks;
  }

  public void setNetworks(NetworksEnum networks) {
    this.networks = networks;
  }

  public Preselection networkCodes(List<String> networkCodes) {
    this.networkCodes = networkCodes;
    return this;
  }

  public Preselection addNetworkCodesItem(String networkCodesItem) {
    if (this.networkCodes == null) {
      this.networkCodes = new ArrayList<String>();
    }
    this.networkCodes.add(networkCodesItem);
    return this;
  }

   /**
   * Collection of network codes to be present in the `LIST` session
   * @return networkCodes
  **/
  @ApiModelProperty(value = "Collection of network codes to be present in the `LIST` session")


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
    Preselection preselection = (Preselection) o;
    return Objects.equals(this.deferral, preselection.deferral) &&
        Objects.equals(this.direction, preselection.direction) &&
        Objects.equals(this.networks, preselection.networks) &&
        Objects.equals(this.networkCodes, preselection.networkCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deferral, direction, networks, networkCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preselection {\n");
    
    sb.append("    deferral: ").append(toIndentedString(deferral)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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

