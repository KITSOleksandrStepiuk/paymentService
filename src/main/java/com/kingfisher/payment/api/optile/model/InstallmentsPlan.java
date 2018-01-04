package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InstallmentsPlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class InstallmentsPlan   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("schedule")
  private List<InstallmentItem> schedule = null;

  @JsonProperty("dueDays")
  private List<Integer> dueDays = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("interestAmount")
  private Double interestAmount = null;

  @JsonProperty("installmentFee")
  private Double installmentFee = null;

  @JsonProperty("totalAmount")
  private Double totalAmount = null;

  @JsonProperty("nominalInterestRate")
  private Double nominalInterestRate = null;

  @JsonProperty("effectiveInterestRate")
  private Double effectiveInterestRate = null;

  @JsonProperty("creditInformationUrl")
  private String creditInformationUrl = null;

  @JsonProperty("termsAndConditionsUrl")
  private String termsAndConditionsUrl = null;

  @JsonProperty("dataPrivacyConsentUrl")
  private String dataPrivacyConsentUrl = null;

  public InstallmentsPlan id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An ID of installments plan
   * @return id
  **/
  @ApiModelProperty(value = "An ID of installments plan")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InstallmentsPlan schedule(List<InstallmentItem> schedule) {
    this.schedule = schedule;
    return this;
  }

  public InstallmentsPlan addScheduleItem(InstallmentItem scheduleItem) {
    if (this.schedule == null) {
      this.schedule = new ArrayList<InstallmentItem>();
    }
    this.schedule.add(scheduleItem);
    return this;
  }

   /**
   * Collection of particular installment with payment date and amount
   * @return schedule
  **/
  @ApiModelProperty(value = "Collection of particular installment with payment date and amount")

  @Valid

  public List<InstallmentItem> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<InstallmentItem> schedule) {
    this.schedule = schedule;
  }

  public InstallmentsPlan dueDays(List<Integer> dueDays) {
    this.dueDays = dueDays;
    return this;
  }

  public InstallmentsPlan addDueDaysItem(Integer dueDaysItem) {
    if (this.dueDays == null) {
      this.dueDays = new ArrayList<Integer>();
    }
    this.dueDays.add(dueDaysItem);
    return this;
  }

   /**
   * Collection of possible payment days like 1, 15, 28, etc.
   * @return dueDays
  **/
  @ApiModelProperty(value = "Collection of possible payment days like 1, 15, 28, etc.")


  public List<Integer> getDueDays() {
    return dueDays;
  }

  public void setDueDays(List<Integer> dueDays) {
    this.dueDays = dueDays;
  }

  public InstallmentsPlan currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 3-letter currency code (ISO 4217) of all payment amounts within current installments plan
   * @return currency
  **/
  @ApiModelProperty(value = "3-letter currency code (ISO 4217) of all payment amounts within current installments plan")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public InstallmentsPlan interestAmount(Double interestAmount) {
    this.interestAmount = interestAmount;
    return this;
  }

   /**
   * The interest amount in major units
   * @return interestAmount
  **/
  @ApiModelProperty(value = "The interest amount in major units")


  public Double getInterestAmount() {
    return interestAmount;
  }

  public void setInterestAmount(Double interestAmount) {
    this.interestAmount = interestAmount;
  }

  public InstallmentsPlan installmentFee(Double installmentFee) {
    this.installmentFee = installmentFee;
    return this;
  }

   /**
   * The fee for the installment payment (or service-charge-amount) in major units
   * @return installmentFee
  **/
  @ApiModelProperty(value = "The fee for the installment payment (or service-charge-amount) in major units")


  public Double getInstallmentFee() {
    return installmentFee;
  }

  public void setInstallmentFee(Double installmentFee) {
    this.installmentFee = installmentFee;
  }

  public InstallmentsPlan totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * The total transaction amount in major units (including original amount, all fees and the interest)
   * @return totalAmount
  **/
  @ApiModelProperty(value = "The total transaction amount in major units (including original amount, all fees and the interest)")


  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public InstallmentsPlan nominalInterestRate(Double nominalInterestRate) {
    this.nominalInterestRate = nominalInterestRate;
    return this;
  }

   /**
   * The interest rate per year in percentages (Nominalzins or Sollzins)
   * @return nominalInterestRate
  **/
  @ApiModelProperty(value = "The interest rate per year in percentages (Nominalzins or Sollzins)")


  public Double getNominalInterestRate() {
    return nominalInterestRate;
  }

  public void setNominalInterestRate(Double nominalInterestRate) {
    this.nominalInterestRate = nominalInterestRate;
  }

  public InstallmentsPlan effectiveInterestRate(Double effectiveInterestRate) {
    this.effectiveInterestRate = effectiveInterestRate;
    return this;
  }

   /**
   * The effective interest rate per year in percentages (Effektivzins)
   * @return effectiveInterestRate
  **/
  @ApiModelProperty(value = "The effective interest rate per year in percentages (Effektivzins)")


  public Double getEffectiveInterestRate() {
    return effectiveInterestRate;
  }

  public void setEffectiveInterestRate(Double effectiveInterestRate) {
    this.effectiveInterestRate = effectiveInterestRate;
  }

  public InstallmentsPlan creditInformationUrl(String creditInformationUrl) {
    this.creditInformationUrl = creditInformationUrl;
    return this;
  }

   /**
   * URL to the Credit Information document
   * @return creditInformationUrl
  **/
  @ApiModelProperty(value = "URL to the Credit Information document")


  public String getCreditInformationUrl() {
    return creditInformationUrl;
  }

  public void setCreditInformationUrl(String creditInformationUrl) {
    this.creditInformationUrl = creditInformationUrl;
  }

  public InstallmentsPlan termsAndConditionsUrl(String termsAndConditionsUrl) {
    this.termsAndConditionsUrl = termsAndConditionsUrl;
    return this;
  }

   /**
   * URL to terms and conditions information document
   * @return termsAndConditionsUrl
  **/
  @ApiModelProperty(value = "URL to terms and conditions information document")


  public String getTermsAndConditionsUrl() {
    return termsAndConditionsUrl;
  }

  public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
    this.termsAndConditionsUrl = termsAndConditionsUrl;
  }

  public InstallmentsPlan dataPrivacyConsentUrl(String dataPrivacyConsentUrl) {
    this.dataPrivacyConsentUrl = dataPrivacyConsentUrl;
    return this;
  }

   /**
   * URL to the data privacy consent document
   * @return dataPrivacyConsentUrl
  **/
  @ApiModelProperty(value = "URL to the data privacy consent document")


  public String getDataPrivacyConsentUrl() {
    return dataPrivacyConsentUrl;
  }

  public void setDataPrivacyConsentUrl(String dataPrivacyConsentUrl) {
    this.dataPrivacyConsentUrl = dataPrivacyConsentUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentsPlan installmentsPlan = (InstallmentsPlan) o;
    return Objects.equals(this.id, installmentsPlan.id) &&
        Objects.equals(this.schedule, installmentsPlan.schedule) &&
        Objects.equals(this.dueDays, installmentsPlan.dueDays) &&
        Objects.equals(this.currency, installmentsPlan.currency) &&
        Objects.equals(this.interestAmount, installmentsPlan.interestAmount) &&
        Objects.equals(this.installmentFee, installmentsPlan.installmentFee) &&
        Objects.equals(this.totalAmount, installmentsPlan.totalAmount) &&
        Objects.equals(this.nominalInterestRate, installmentsPlan.nominalInterestRate) &&
        Objects.equals(this.effectiveInterestRate, installmentsPlan.effectiveInterestRate) &&
        Objects.equals(this.creditInformationUrl, installmentsPlan.creditInformationUrl) &&
        Objects.equals(this.termsAndConditionsUrl, installmentsPlan.termsAndConditionsUrl) &&
        Objects.equals(this.dataPrivacyConsentUrl, installmentsPlan.dataPrivacyConsentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schedule, dueDays, currency, interestAmount, installmentFee, totalAmount, nominalInterestRate, effectiveInterestRate, creditInformationUrl, termsAndConditionsUrl, dataPrivacyConsentUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentsPlan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    dueDays: ").append(toIndentedString(dueDays)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    interestAmount: ").append(toIndentedString(interestAmount)).append("\n");
    sb.append("    installmentFee: ").append(toIndentedString(installmentFee)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    nominalInterestRate: ").append(toIndentedString(nominalInterestRate)).append("\n");
    sb.append("    effectiveInterestRate: ").append(toIndentedString(effectiveInterestRate)).append("\n");
    sb.append("    creditInformationUrl: ").append(toIndentedString(creditInformationUrl)).append("\n");
    sb.append("    termsAndConditionsUrl: ").append(toIndentedString(termsAndConditionsUrl)).append("\n");
    sb.append("    dataPrivacyConsentUrl: ").append(toIndentedString(dataPrivacyConsentUrl)).append("\n");
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

