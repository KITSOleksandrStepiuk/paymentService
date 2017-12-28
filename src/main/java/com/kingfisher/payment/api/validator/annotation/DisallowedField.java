package com.kingfisher.payment.api.validator.annotation;


import com.kingfisher.payment.api.validator.DisallowedFieldValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DisallowedFieldValidator.class)
public @interface DisallowedField {
    String message () default "{validation.disallowedfield.message}";
    Class<?> [] groups () default {};
    Class<? extends Payload> [] payload() default {};
}
