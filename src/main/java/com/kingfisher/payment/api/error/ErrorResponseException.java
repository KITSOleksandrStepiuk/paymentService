package com.kingfisher.payment.api.error;

import com.kingfisher.payment.api.optile.error.model.ErrorResponse;

public class ErrorResponseException extends RuntimeException {

    private final transient ErrorResponse errorResponse;

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public ErrorResponseException(ErrorResponse errorResponse) {
        super();
        this.errorResponse = errorResponse;
    }
}
