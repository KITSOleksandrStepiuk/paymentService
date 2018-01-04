package com.kingfisher.payment.api.validator;

import com.kingfisher.payment.api.validator.annotation.DisallowedField;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DisallowedFieldValidator implements ConstraintValidator<DisallowedField, Object> {

    @Override
    public void initialize(DisallowedField constraintAnnotation) {
        // no default implementation
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return value == null;
    }
}
