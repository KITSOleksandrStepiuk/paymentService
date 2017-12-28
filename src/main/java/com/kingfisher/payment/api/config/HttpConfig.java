package com.kingfisher.payment.api.config;

import com.kingfisher.payment.api.optile.error.RestTemplateErrorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class HttpConfig {

    @Value("${http.connection.connection-request-timeout}")
    private int connectionRequestTimeout;
    @Value("${http.resttemplate.connection.socket.connect-timeout}")
    private int connectionTimeout;
    @Value("${http.resttemplate.connection.read-timeout}")
    private int readTimeout;

    @Bean
    public HttpComponentsClientHttpRequestFactory customHttpRequestFactory() {

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();


        requestFactory.setConnectionRequestTimeout(connectionRequestTimeout);
        requestFactory.setConnectTimeout(connectionTimeout);
        requestFactory.setReadTimeout(readTimeout);

        return requestFactory;
    }

    @Bean
    public RestTemplate customRestTemplate(@Autowired HttpComponentsClientHttpRequestFactory httpRequestFactory,
                                           @Autowired ResponseErrorHandler errorHandler,
                                           @Autowired MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter) {

        RestTemplate template = new RestTemplate(httpRequestFactory);
        template.setErrorHandler(errorHandler);

        List<HttpMessageConverter<?>> converters =  template.getMessageConverters();

        converters = converters.stream()
                .filter(converter -> !converter.getClass().equals(MappingJackson2HttpMessageConverter.class))
                .collect(Collectors.toList());

        converters.add(mappingJackson2HttpMessageConverter);

        template.setMessageConverters(converters);

        return template;
    }

    @Bean
    public ResponseErrorHandler genericErrorHandler() {
        return new RestTemplateErrorHandler();
    }
}
