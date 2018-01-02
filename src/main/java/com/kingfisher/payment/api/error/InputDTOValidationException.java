package com.kingfisher.payment.api.error;

import com.kingfisher.payment.api.model.ListRequestDTO;

import javax.validation.ConstraintViolation;
import java.util.Set;

public class InputDTOValidationException extends Exception {
    private final transient Set<ConstraintViolation<ListRequestDTO>> violations;

    public InputDTOValidationException(Set<ConstraintViolation<ListRequestDTO>> violations) {
        super();
        this.violations = violations;
    }

    public Set<ConstraintViolation<ListRequestDTO>> getViolations() {
        return violations;
    }
}
