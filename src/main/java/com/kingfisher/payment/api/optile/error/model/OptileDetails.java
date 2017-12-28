package com.kingfisher.payment.api.optile.error.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kingfisher.payment.api.optile.model.Interaction;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OptileDetails {

    @JsonProperty("resultInfo")
    private String resultInfo;
    @JsonProperty("interaction")
    private Interaction interaction;

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public Interaction getInteraction() {
        return interaction;
    }

    public void setInteraction(Interaction interaction) {
        this.interaction = interaction;
    }

    public OptileDetails(){
        //empty
    }

    public OptileDetails(String resultInfo, Interaction interaction) {

        this.resultInfo = resultInfo;
        this.interaction = interaction;
    }
}
