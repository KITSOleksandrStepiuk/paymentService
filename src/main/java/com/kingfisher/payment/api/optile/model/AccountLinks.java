package com.kingfisher.payment.api.optile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Collection of URLs to build the account form for this registered account and perform different actions with entered data.
 */
@ApiModel(description = "Collection of URLs to build the account form for this registered account and perform different actions with entered data. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-13T09:50:13.086Z")

public class AccountLinks {
    @JsonProperty("self")
    private String self = null;

    @JsonProperty("operation")
    private String operation = null;

    @JsonProperty("validation")
    private String validation = null;

    @JsonProperty("logo")
    private String logo = null;

    @JsonProperty("form")
    private String form = null;

    @JsonProperty("localizedForm")
    private String localizedForm = null;

    @JsonProperty("lang")
    private String lang = null;

    @JsonProperty("iFrame")
    private String iFrame = null;

    public AccountLinks self(String self) {
        this.self = self;
        return this;
    }

    /**
     * URL to retrieve details about this registered account in context of initialized `LIST`
     *
     * @return self
     **/
    @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/lists/59e0b954148bp4t1n6ds5mfjss451khui/accounts/59e0b92d80ce9a8cd7a", required = true, value = "URL to retrieve details about this registered account in context of initialized `LIST`")
    @NotNull


    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public AccountLinks operation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * URL where operation data should be submitted (POSTed), if customer has decided to pay with this account registration
     *
     * @return operation
     **/
    @ApiModelProperty(example = "https://api.sandbox.oscato.com/api/lists/59e0b954148bp4t1n6ds5mfjss451khui/accounts/59e0b92d80ce9a8cd7a/charge", value = "URL where operation data should be submitted (POSTed), if customer has decided to pay with this account registration")


    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public AccountLinks validation(String validation) {
        this.validation = validation;
        return this;
    }

    /**
     * URL to submit partial account data for in-page validation of registered account if supported
     *
     * @return validation
     **/
    @ApiModelProperty(example = "https://api.sandbox.oscato.com/pci/v1/59e0b954148bp4t1n6ds5mfjss451khui/MYSHOP/de_DE/AMEX/registered/validate", value = "URL to submit partial account data for in-page validation of registered account if supported")


    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    public AccountLinks logo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * URL of payment network logo (image) for this account registration
     *
     * @return logo
     **/
    @ApiModelProperty(example = "https://resources.sandbox.oscato.com/resource/network/MYSHOP/de_DE/AMEX/logo2x.png", required = true, value = "URL of payment network logo (image) for this account registration")
    @NotNull


    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public AccountLinks form(String form) {
        this.form = form;
        return this;
    }

    /**
     * URL to retrieve a registered version of account form template; HTML snippet with account elements and message placeholders
     *
     * @return form
     **/
    @ApiModelProperty(example = "https://resources.sandbox.oscato.com/resource/form/AMEX/registered.html", value = "URL to retrieve a registered version of account form template; HTML snippet with account elements and message placeholders")


    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public AccountLinks localizedForm(String localizedForm) {
        this.localizedForm = localizedForm;
        return this;
    }

    /**
     * URL to retrieve localized representation of registered account form; text placeholders are replaced by text in corresponding language, language is defined by `LIST` session
     *
     * @return localizedForm
     **/
    @ApiModelProperty(example = "https://resources.sandbox.oscato.com/resource/form/MYSHOP/DE/de_DE/AMEX/registered.html", value = "URL to retrieve localized representation of registered account form; text placeholders are replaced by text in corresponding language, language is defined by `LIST` session ")


    public String getLocalizedForm() {
        return localizedForm;
    }

    public void setLocalizedForm(String localizedForm) {
        this.localizedForm = localizedForm;
    }

    public AccountLinks lang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * URL of language file that contains labels and messages to localize account forms and display errors for this payment network; language file is provided in Java properties format; see http://en.wikipedia.org/wiki/.properties
     *
     * @return lang
     **/
    @ApiModelProperty(example = "https://resources.sandbox.oscato.com/resource/lang/MYSHOP/de_DE/AMEX.properties", required = true, value = "URL of language file that contains labels and messages to localize account forms and display errors for this payment network; language file is provided in Java properties format; see http://en.wikipedia.org/wiki/.properties ")
    @NotNull


    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public AccountLinks iFrame(String iFrame) {
        this.iFrame = iFrame;
        return this;
    }

    /**
     * URL of iFrame what should been shown to the customer to collect account data; Present only in the case when `LIST` session was initilaized with `SELECTIVE_NATIVE` integration type
     *
     * @return iFrame
     **/
    @ApiModelProperty(example = "https://resources.sandbox.oscato.com/paymentpage/iframe.html?listId=59e0b954148bp4t1n6ds5mfjss451khui&accountId=59e0b92d80ce9a8cd7a", value = "URL of iFrame what should been shown to the customer to collect account data; Present only in the case when `LIST` session was initilaized with `SELECTIVE_NATIVE` integration type ")


    public String getIFrame() {
        return iFrame;
    }

    public void setIFrame(String iFrame) {
        this.iFrame = iFrame;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountLinks accountLinks = (AccountLinks) o;
        return Objects.equals(this.self, accountLinks.self) &&
                Objects.equals(this.operation, accountLinks.operation) &&
                Objects.equals(this.validation, accountLinks.validation) &&
                Objects.equals(this.logo, accountLinks.logo) &&
                Objects.equals(this.form, accountLinks.form) &&
                Objects.equals(this.localizedForm, accountLinks.localizedForm) &&
                Objects.equals(this.lang, accountLinks.lang) &&
                Objects.equals(this.iFrame, accountLinks.iFrame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, operation, validation, logo, form, localizedForm, lang, iFrame);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountLinks {\n");

        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    form: ").append(toIndentedString(form)).append("\n");
        sb.append("    localizedForm: ").append(toIndentedString(localizedForm)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
        sb.append("    iFrame: ").append(toIndentedString(iFrame)).append("\n");
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

