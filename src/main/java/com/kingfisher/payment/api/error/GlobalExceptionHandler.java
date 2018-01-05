package com.kingfisher.payment.api.error;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingfisher.payment.api.optile.model.ErrorInfo;
import com.kingfisher.payment.api.validator.ValidatorUtil;
import org.apache.http.conn.ConnectTimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.ResourceAccessException;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@Order(value = 1)
@ControllerAdvice
class GlobalExceptionHandler {

    public static final String PROCESSING = "Processing: {}";
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private ValidatorUtil validatorUtil;

    private final Map<Class<? extends Throwable>, HttpStatus> rules = new HashMap<>();

    {
        rules.put(ConnectTimeoutException.class, HttpStatus.REQUEST_TIMEOUT);
        rules.put(SocketTimeoutException.class, HttpStatus.REQUEST_TIMEOUT);
    }

    @ExceptionHandler({ErrorResponseException.class})
    public ResponseEntity handle(ErrorResponseException e) {
        logger.trace(PROCESSING, e.getStackTrace());

        final ErrorInfo errorInfo;

        try {

            // for any Exception without body (404,403 etc)
            if(e.getErrorResponse().getDetails().length() <= 0) {
                return ResponseEntity.status(e.getErrorResponse().getStatus()).build();
            }

            errorInfo = objectMapper.readValue(e.getErrorResponse().getDetails(), ErrorInfo.class);

        } catch (IOException ex) {
            logger.trace(PROCESSING, ex.getStackTrace());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body(new ErrorInfo(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()));
        }

        return ResponseEntity.status(e.getErrorResponse().getStatus()).body(errorInfo);
    }

    @ExceptionHandler({ResourceAccessException.class})
    public ResponseEntity handle(ResourceAccessException e) {
        logger.trace(PROCESSING, e.getStackTrace());

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        if(rules.containsKey(e.getCause().getClass())) {
            status = rules.get(e.getCause().getClass());
        }

        ErrorInfo info = new ErrorInfo(status.getReasonPhrase());

        return ResponseEntity.status(status.value()).body(info);
    }

    @ExceptionHandler({InputDTOValidationException.class})
    public ResponseEntity handle(InputDTOValidationException e) {
        logger.trace(PROCESSING, e.getStackTrace());

        ErrorInfo errorInfo;

        if (e.getViolations() == null || e.getViolations().isEmpty()) {
            errorInfo = new ErrorInfo("Errors: " + e.getMessage());
        } else {
            errorInfo = new ErrorInfo("Errors: " + validatorUtil.collectViolations(e.getViolations()));
        }

        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(errorInfo);
    }

    @ExceptionHandler({UnknownHostException.class})
    public ResponseEntity handle(UnknownHostException e){
        logger.trace(PROCESSING, e.getStackTrace());

        ErrorInfo info = new ErrorInfo(e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(info);
    }

}