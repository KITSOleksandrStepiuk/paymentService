package com.kingfisher.payment.api.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JacksonConfig {

    @Primary
    @Bean
    public ObjectMapper getObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz"));
        objectMapper.registerModule(new JodaModule());

//        objectMapper.registerModule(createJodaModule());
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz"));

        return objectMapper;
    }

//    private static SimpleModule createJodaModule() {
//        SimpleModule module = new SimpleModule();
//        JacksonJodaFormat jjdf = new JacksonJodaFormat(DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSz").withZoneUTC());
//        module.addSerializer(DateTime.class, new DateTimeSerializer(jjdf));
//        return module;
//    }

}
