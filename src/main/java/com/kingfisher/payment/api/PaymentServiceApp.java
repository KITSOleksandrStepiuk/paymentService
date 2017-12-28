package com.kingfisher.payment.api;

import com.kingfisher.payment.api.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Import({
        HttpConfig.class,
        PropertiesConfig.class,
        ApiDocumentationConfiguration.class,
        JacksonConfig.class,
        DozerConfig.class
})
@EnableSwagger2
public class PaymentServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApp.class, args);
    }

}
