package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.joda.time.DateTime;
import java.util.Objects;

/**
 * Interaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Interaction   {
  /**
   * Interaction code that advices further interaction with this customer or payment; see list of [Interaction Codes](https://www.optile.io/opg#292619) 
   */
  public enum CodeEnum {
    PROCEED("PROCEED"),
    
    ABORT("ABORT"),
    
    TRY_OTHER_NETWORK("TRY_OTHER_NETWORK"),
    
    TRY_OTHER_ACCOUNT("TRY_OTHER_ACCOUNT"),
    
    RETRY("RETRY"),
    
    RELOAD("RELOAD");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("code")
  private CodeEnum code = null;

  /**
   * Reason of this interaction, complements interaction code and has more detailed granularity; see list of [Interaction Codes](https://www.optile.io/opg#292619) 
   */
  public enum ReasonEnum {
    OK("OK"),
    
    PENDING("PENDING"),
    
    TRUSTED("TRUSTED"),
    
    STRONG_AUTHENTICATION("STRONG_AUTHENTICATION"),
    
    DECLINED("DECLINED"),
    
    EXPIRED("EXPIRED"),
    
    EXCEEDS_LIMIT("EXCEEDS_LIMIT"),
    
    TEMPORARY_FAILURE("TEMPORARY_FAILURE"),
    
    UNKNOWN("UNKNOWN"),
    
    NETWORK_FAILURE("NETWORK_FAILURE"),
    
    BLACKLISTED("BLACKLISTED"),
    
    BLOCKED("BLOCKED"),
    
    SYSTEM_FAILURE("SYSTEM_FAILURE"),
    
    INVALID_ACCOUNT("INVALID_ACCOUNT"),
    
    FRAUD("FRAUD"),
    
    ADDITIONAL_NETWORKS("ADDITIONAL_NETWORKS"),
    
    INVALID_REQUEST("INVALID_REQUEST"),
    
    SCHEDULED("SCHEDULED"),
    
    NO_NETWORKS("NO_NETWORKS"),
    
    DUPLICATE_OPERATION("DUPLICATE_OPERATION"),
    
    CHARGEBACK("CHARGEBACK"),
    
    RISK_DETECTED("RISK_DETECTED"),
    
    CUSTOMER_ABORT("CUSTOMER_ABORT"),
    
    EXPIRED_SESSION("EXPIRED_SESSION"),
    
    EXPIRED_ACCOUNT("EXPIRED_ACCOUNT"),
    
    ACCOUNT_NOT_ACTIVATED("ACCOUNT_NOT_ACTIVATED"),
    
    TRUSTED_CUSTOMER("TRUSTED_CUSTOMER"),
    
    UNKNOWN_CUSTOMER("UNKNOWN_CUSTOMER"),
    
    ACTIVATED("ACTIVATED"),
    
    UPDATED("UPDATED");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("reason")
  private ReasonEnum reason = null;

  @JsonProperty("retryAfter")
  private DateTime retryAfter = null;

  public Interaction code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Interaction code that advices further interaction with this customer or payment; see list of [Interaction Codes](https://www.optile.io/opg#292619) 
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Interaction code that advices further interaction with this customer or payment; see list of [Interaction Codes](https://www.optile.io/opg#292619) ")
  @NotNull


  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public Interaction reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason of this interaction, complements interaction code and has more detailed granularity; see list of [Interaction Codes](https://www.optile.io/opg#292619) 
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "Reason of this interaction, complements interaction code and has more detailed granularity; see list of [Interaction Codes](https://www.optile.io/opg#292619) ")
  @NotNull


  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public Interaction retryAfter(DateTime retryAfter) {
    this.retryAfter = retryAfter;
    return this;
  }

   /**
   * If supplied, holds recommended time for next retry; only applicable for recurring payments
   * @return retryAfter
  **/
  @ApiModelProperty(value = "If supplied, holds recommended time for next retry; only applicable for recurring payments")

  @Valid

  public DateTime getRetryAfter() {
    return retryAfter;
  }

  public void setRetryAfter(DateTime retryAfter) {
    this.retryAfter = retryAfter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Interaction interaction = (Interaction) o;
    return Objects.equals(this.code, interaction.code) &&
        Objects.equals(this.reason, interaction.reason) &&
        Objects.equals(this.retryAfter, interaction.retryAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, reason, retryAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Interaction {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    retryAfter: ").append(toIndentedString(retryAfter)).append("\n");
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

