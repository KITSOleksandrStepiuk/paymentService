package com.kingfisher.payment.api.optile.model;

import java.util.Map;

public class ListRequest {

    private String transactionId;
    private String country;
    private String channel;
    private String integration;
    private String division;
    private Customer customer;
    private String customerScore;
    private ClientInfo clientInfo;
    private Payment payment;
    private Product[] products;
    private boolean updateOnly;
    private boolean presetFirst;
    private Style style;
    private Preselection preselection;
    private Map<String, ExtraElement[]> extraElements;
    private Mandate mandate;
    private Installment installment;

    public Callback getCallback() {
        return callback;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    private Callback callback;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIntegration() {
        return integration;
    }

    public void setIntegration(String integration) {
        this.integration = integration;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerScore() {
        return customerScore;
    }

    public void setCustomerScore(String customerScore) {
        this.customerScore = customerScore;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public boolean isUpdateOnly() {
        return updateOnly;
    }

    public void setUpdateOnly(boolean updateOnly) {
        this.updateOnly = updateOnly;
    }

    public boolean isPresetFirst() {
        return presetFirst;
    }

    public void setPresetFirst(boolean presetFirst) {
        this.presetFirst = presetFirst;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Preselection getPreselection() {
        return preselection;
    }

    public void setPreselection(Preselection preselection) {
        this.preselection = preselection;
    }

    public Map<String, ExtraElement[]> getExtraElements() {
        return extraElements;
    }

    public void setExtraElements(Map<String, ExtraElement[]> extraElements) {
        this.extraElements = extraElements;
    }

    public Mandate getMandate() {
        return mandate;
    }

    public void setMandate(Mandate mandate) {
        this.mandate = mandate;
    }

    public Installment getInstallment() {
        return installment;
    }

    public void setInstallment(Installment installment) {
        this.installment = installment;
    }
}
