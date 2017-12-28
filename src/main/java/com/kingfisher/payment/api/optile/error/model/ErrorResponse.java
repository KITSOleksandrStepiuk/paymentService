package com.kingfisher.payment.api.optile.error.model;

public class ErrorResponse {

    private int status;
    private String error;
    private OptileDetails details;

    public ErrorResponse(){
        // epmty
    }

    public ErrorResponse(int status, String error, OptileDetails details) {
        this.status = status;
        this.error = error;
        this.details = details;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public OptileDetails getDetails() {
        return details;
    }

}
