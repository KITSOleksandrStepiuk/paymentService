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
 * Status
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class Status   {
  /**
   * Status code describes operation current state; see list of all [Status Codes](https://www.optile.io/opg#285186)
   */
  public enum CodeEnum {
    PENDING("pending"),
    
    FAILED("failed"),
    
    DECLINED("declined"),
    
    ABORTED("aborted"),
    
    EXPIRED("expired"),
    
    CANCELED("canceled"),
    
    LISTED("listed"),
    
    PREAUTHORIZED("preauthorized"),
    
    CHARGED("charged"),
    
    PAID_OUT("paid_out"),
    
    APPROVAL_REQUESTED("approval_requested"),
    
    CHARGED_BACK("charged_back"),
    
    INFORMATION_REQUESTED("information_requested"),
    
    DISPUTE_CLOSED("dispute_closed"),
    
    DEPLEATED("depleated"),
    
    REGISTERED("registered"),
    
    DEREGISTERED("deregistered"),
    
    SUBSCRIBED("subscribed"),
    
    UNSUBSCRIBED("unsubscribed"),
    
    USED("used"),
    
    REJECTED("rejected"),
    
    ACTIVATED("activated"),
    
    FUNCTIONING("functioning"),
    
    ENDED("ended");

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
   * Reason of this status, complements status code and has more detailed granularity; see list of all [Status Codes](https://www.optile.io/opg#285186)
   */
  public enum ReasonEnum {
    CHARGE_REQUESTED("charge_requested"),
    
    DEBIT_REQUESTED("debit_requested"),
    
    DEBITED("debited"),
    
    DEBITED_PARTIAL("debited_partial"),
    
    DEBIT_FAILED("debit_failed"),
    
    DEBIT_DECLINED("debit_declined"),
    
    DEBIT_ABORTED("debit_aborted"),
    
    DEBIT_CANCELED("debit_canceled"),
    
    DEBIT_REJECTED("debit_rejected"),
    
    INFORMATION_REQUESTED("information_requested"),
    
    CHARGED_BACK("charged_back"),
    
    DISPUTE_CLOSED("dispute_closed"),
    
    CHARGEBACK_CANCELED("chargeback_canceled"),
    
    NOTIFICATION_OF_CHARGEBACK("notification_of_chargeback"),
    
    INFORMATION2_REQUESTED("information2_requested"),
    
    CHARGED_BACK2("charged_back2"),
    
    DISPUTE2_CLOSED("dispute2_closed"),
    
    CHARGEBACK2_CANCELED("chargeback2_canceled"),
    
    NOTIFICATION_OF_CHARGEBACK2("notification_of_chargeback2"),
    
    CANCELATION_REQUESTED("cancelation_requested"),
    
    PREAUTHORIZATION_REQUESTED("preauthorization_requested"),
    
    PREAUTHORIZED("preauthorized"),
    
    PREAUTHORIZATION_FAILED("preauthorization_failed"),
    
    PREAUTHORIZATION_DECLINED("preauthorization_declined"),
    
    PREAUTHORIZATION_ABORTED("preauthorization_aborted"),
    
    PREAUTHORIZATION_EXPIRED("preauthorization_expired"),
    
    PREAUTHORIZATION_DEPLETED("preauthorization_depleted"),
    
    PREAUTHORIZATION_CANCELED("preauthorization_canceled"),
    
    PREAUTHORIZATION_REJECTED("preauthorization_rejected"),
    
    CLOSED("closed"),
    
    CLOSED_PARTIAL("closed_partial"),
    
    PAYMENT_DEMAND_REQUESTED("payment_demand_requested"),
    
    PAYMENT_DEMANDED("payment_demanded"),
    
    PAYMENT_DEMAND_FAILED("payment_demand_failed"),
    
    PAYMENT_DEMAND_DECLINED("payment_demand_declined"),
    
    PAYMENT_DEMAND_ABORTED("payment_demand_aborted"),
    
    PAYMENT_DEMAND_CANCELED("payment_demand_canceled"),
    
    PAYMENT_DEMAND_REJECTED("payment_demand_rejected"),
    
    PREORDER_REQUESTED("preorder_requested"),
    
    PREORDER_ISSUED("preorder_issued"),
    
    PREORDER_FAILED("preorder_failed"),
    
    PREORDER_DECLINED("preorder_declined"),
    
    PREORDER_CANCELED("preorder_canceled"),
    
    PREORDER_REJECTED("preorder_rejected"),
    
    PAYMENT_RECEIVED("payment_received"),
    
    RECEIPT_CANCELED("receipt_canceled"),
    
    REQUEST_EXPIRED("request_expired"),
    
    RETRY_SCHEDULED("retry_scheduled"),
    
    PAYOUT_REQUESTED("payout_requested"),
    
    CREDIT_REQUESTED("credit_requested"),
    
    CREDITED("credited"),
    
    CREDITED_PARTIAL("credited_partial"),
    
    CREDIT_FAILED("credit_failed"),
    
    CREDIT_DECLINED("credit_declined"),
    
    CREDIT_CANCELED("credit_canceled"),
    
    CREDIT_REJECTED("credit_rejected"),
    
    CREDIT_APPROVAL_REQUESTED("credit_approval_requested"),
    
    CREDIT_APPROVAL_DECLINED("credit_approval_declined"),
    
    CREDIT_APPROVAL_FAILED("credit_approval_failed"),
    
    CREDIT_APPROVAL_CANCELED("credit_approval_canceled"),
    
    CREDIT_APPROVAL_REJECTED("credit_approval_rejected"),
    
    REFUND_REQUESTED("refund_requested"),
    
    REFUND_CREDITED("refund_credited"),
    
    REFUND_CREDITED_PARTIAL("refund_credited_partial"),
    
    REFUND_FAILED("refund_failed"),
    
    REFUND_DECLINED("refund_declined"),
    
    REFUND_CANCELED("refund_canceled"),
    
    REFUND_REJECTED("refund_rejected"),
    
    REFUND_APPROVAL_REQUESTED("refund_approval_requested"),
    
    REFUND_APPROVAL_DECLINED("refund_approval_declined"),
    
    REFUND_APPROVAL_FAILED("refund_approval_failed"),
    
    REFUND_APPROVAL_CANCELED("refund_approval_canceled"),
    
    REFUND_APPROVAL_REJECTED("refund_approval_rejected"),
    
    REGISTERED("registered"),
    
    REGISTRATION_REQUESTED("registration_requested"),
    
    REGISTRATION_FAILED("registration_failed"),
    
    REGISTRATION_DECLINED("registration_declined"),
    
    REGISTRATION_ABORTED("registration_aborted"),
    
    REGISTRATION_EXPIRED("registration_expired"),
    
    REGISTRATION_CANCELED("registration_canceled"),
    
    REGISTRATION_REJECTED("registration_rejected"),
    
    DEREGISTRATION_REQUESTED("deregistration_requested"),
    
    DEREGISTERED("deregistered"),
    
    LISTED("listed"),
    
    LIST_EXPIRED("list_expired"),
    
    LIST_FAILED("list_failed"),
    
    LIST_ABORTED("list_aborted"),
    
    LIST_CANCELED("list_canceled"),
    
    LIST_REJECTED("list_rejected"),
    
    LIST_USED("list_used"),
    
    SUBSCRIPTION_CREATED("subscription_created"),
    
    SUBSCRIPTION_UPDATED("subscription_updated"),
    
    SUBSCRIPTION_CANCELED("subscription_canceled"),
    
    SUBSCRIPTION_CREATION_FAILED("subscription_creation_failed"),
    
    SUBSCRIPTION_UPDATE_FAILED("subscription_update_failed"),
    
    SUBSCRIPTION_CANCELATION_FAILED("subscription_cancelation_failed"),
    
    ENTITLEMENT_CREATED("entitlement_created"),
    
    ENTITLEMENT_CREATION_FAILED("entitlement_creation_failed"),
    
    ENTITLEMENT_UPDATED("entitlement_updated"),
    
    ENTITLEMENT_UPDATE_FAILED("entitlement_update_failed"),
    
    ENTITLEMENT_CANCELED("entitlement_canceled"),
    
    ENTITLEMENT_CANCELATION_FAILED("entitlement_cancelation_failed"),
    
    ACTIVATION_FAILED("activation_failed"),
    
    CALCULATION_REQUESTED("calculation_requested"),
    
    CALCULATED("calculated"),
    
    CALCULATION_USED("calculation_used"),
    
    CALCULATION_REJECTED("calculation_rejected"),
    
    CALCULATION_FAILED("calculation_failed"),
    
    CALCULATION_DECLINED("calculation_declined"),
    
    CALCULATION_CANCELED("calculation_canceled"),
    
    CALCULATION_EXPIRED("calculation_expired"),
    
    PRESET_REQUESTED("preset_requested"),
    
    PRESET("preset"),
    
    PRESET_USED("preset_used"),
    
    PRESET_REJECTED("preset_rejected"),
    
    PRESET_FAILED("preset_failed"),
    
    PRESET_ABORTED("preset_aborted"),
    
    PRESET_DECLINED("preset_declined"),
    
    PRESET_CANCELED("preset_canceled"),
    
    PRESET_EXPIRED("preset_expired"),
    
    STARTED("started"),
    
    FUNCTIONING("functioning"),
    
    ENDED("ended");

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

  public Status code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Status code describes operation current state; see list of all [Status Codes](https://www.optile.io/opg#285186)
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Status code describes operation current state; see list of all [Status Codes](https://www.optile.io/opg#285186)")
  @NotNull


  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public Status reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason of this status, complements status code and has more detailed granularity; see list of all [Status Codes](https://www.optile.io/opg#285186)
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "Reason of this status, complements status code and has more detailed granularity; see list of all [Status Codes](https://www.optile.io/opg#285186)")
  @NotNull


  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.code, status.code) &&
        Objects.equals(this.reason, status.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

