package com.kingfisher.payment.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class PropertiesConfig {

    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer(@Autowired ClassPathResource classPathResource) {

        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
        Resource[] properties = {classPathResource};
        propertyPlaceholderConfigurer.setLocations(properties);

        return propertyPlaceholderConfigurer;
    }

    @Bean
    @Profile("test")
    public ClassPathResource testOptileProperties() {
        return new ClassPathResource("optile-test.properties");
    }

    @Bean
    @Profile("!test")
    public ClassPathResource prodOptileProperties() {
        return new ClassPathResource("optile.properties");
    }
}
