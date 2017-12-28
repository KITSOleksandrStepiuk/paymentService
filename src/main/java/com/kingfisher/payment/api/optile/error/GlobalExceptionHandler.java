package com.kingfisher.payment.api.optile.error;

import com.kingfisher.payment.api.optile.error.model.ErrorResponse;
import com.kingfisher.payment.api.optile.error.model.OptileDetails;
import org.apache.http.conn.ConnectTimeoutException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.ResourceAccessException;

import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
class GlobalExceptionHandler {


    private Map<Class<? extends Throwable>, HttpStatus> rules = new HashMap<>();

    {
        rules.put(ConnectTimeoutException.class, HttpStatus.REQUEST_TIMEOUT);
        rules.put(SocketTimeoutException.class, HttpStatus.REQUEST_TIMEOUT);
    }

    @ExceptionHandler({ErrorResponseException.class})
    public ResponseEntity handle(ErrorResponseException e){
        return ResponseEntity.status(e.getErrorResponse().getStatus()).body(e.getErrorResponse());
    }

    @ExceptionHandler({ResourceAccessException.class})
    public ResponseEntity handle(Exception e){
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if(rules.containsKey(e.getCause().getClass())) {
            status = rules.get(e.getCause().getClass());
        }

        ErrorResponse response = new ErrorResponse(status.value(), status.getReasonPhrase(), new OptileDetails(e.getMessage(), null));
        return ResponseEntity.status(status.value()).body(response);
    }


}