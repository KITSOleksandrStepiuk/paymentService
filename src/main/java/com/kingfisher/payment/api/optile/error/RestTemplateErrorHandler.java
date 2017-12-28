package com.kingfisher.payment.api.optile.error;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingfisher.payment.api.error.ErrorResponseException;
import com.kingfisher.payment.api.optile.error.model.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.nio.charset.Charset;

public class RestTemplateErrorHandler implements ResponseErrorHandler {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return !response.getStatusCode().is2xxSuccessful();
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        String body = StreamUtils.copyToString(response.getBody(), Charset.defaultCharset());

        throw new ErrorResponseException(new ErrorResponse(
                response.getStatusCode().value(),
                response.getStatusCode().getReasonPhrase(),
                body
        ));
    }
}

