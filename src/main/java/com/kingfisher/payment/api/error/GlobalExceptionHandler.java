package com.kingfisher.payment.api.error;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingfisher.payment.api.optile.model.ErrorInfo;
import org.apache.http.conn.ConnectTimeoutException;
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
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Order(value = 1)
@ControllerAdvice
class GlobalExceptionHandler {

    @Autowired
    private ObjectMapper objectMapper;

    private Map<Class<? extends Throwable>, HttpStatus> rules = new HashMap<>();

    {
        rules.put(ConnectTimeoutException.class, HttpStatus.REQUEST_TIMEOUT);
        rules.put(SocketTimeoutException.class, HttpStatus.REQUEST_TIMEOUT);
    }

    @ExceptionHandler({ErrorResponseException.class})
    public ResponseEntity handle(ErrorResponseException e) {
        final ErrorInfo errorInfo;

        try {

            if(e.getErrorResponse().getStatus() == 404) {
                return ResponseEntity.status(e.getErrorResponse().getStatus()).build();
            }

            errorInfo = objectMapper.readValue(e.getErrorResponse().getDetails(), ErrorInfo.class);

        } catch (IOException ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body(new ErrorInfo(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()));
        }

        return ResponseEntity.status(e.getErrorResponse().getStatus()).body(errorInfo);
    }

    @ExceptionHandler({ResourceAccessException.class})
    public ResponseEntity handle(ResourceAccessException e){
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        if(rules.containsKey(e.getCause().getClass())) {
            status = rules.get(e.getCause().getClass());
        }

        ErrorInfo info = new ErrorInfo(status.getReasonPhrase());

        return ResponseEntity.status(status.value()).body(info);
    }

    @ExceptionHandler({InputDTOValidationException.class})
    public ResponseEntity handle(InputDTOValidationException e){
        StringBuilder sb = new StringBuilder();

        List<String> errors = e.getViolations().stream()
                .map(v -> v.getPropertyPath().toString() + " " + v.getMessage())
                .sorted()
                .collect(Collectors.toList());

        errors.forEach( err -> sb.append(err).append(", "));
        ErrorInfo info = new ErrorInfo("Errors: " + sb.replace(sb.length()-2, sb.length(), "").toString());

        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(info);
    }

    @ExceptionHandler({UnknownHostException.class})
    public ResponseEntity handle(UnknownHostException e){
        ErrorInfo info = new ErrorInfo(e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(info);
    }

}