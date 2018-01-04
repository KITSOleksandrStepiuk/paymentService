package com.kingfisher.payment.api.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import com.fasterxml.jackson.datatype.joda.ser.DateTimeSerializer;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.joda.DateTimeFormatterFactory;

import java.text.SimpleDateFormat;

@Configuration
public class JacksonConfig {

    @Primary
    @Bean
    public ObjectMapper getObjectMapper(@Autowired JodaModule module) {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        objectMapper.registerModule(module);
        return objectMapper;
    }

    @Bean
    public JodaModule getJodaModule() {

        JodaModule module = new JodaModule();

        DateTimeFormatterFactory dff;
        dff = new DateTimeFormatterFactory();
        dff.setPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

        JacksonJodaDateFormat format = new JacksonJodaDateFormat(dff.createDateTimeFormatter());

        module.addSerializer(DateTime.class, new DateTimeSerializer(format, 0));

        return module;
    }

}
