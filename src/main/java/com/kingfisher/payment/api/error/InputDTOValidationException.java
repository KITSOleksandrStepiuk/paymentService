package com.kingfisher.payment.api.error;

import com.kingfisher.payment.api.model.ListRequestDTO;

import javax.validation.ConstraintViolation;
import java.util.Set;

public class InputDTOValidationException extends Exception {
    private transient Set<ConstraintViolation<ListRequestDTO>> violations;

    public InputDTOValidationException(Set<ConstraintViolation<ListRequestDTO>> violations) {
        super();
        this.violations = violations;
    }

    public InputDTOValidationException(String msg) {
        super(msg);
    }

    public Set<ConstraintViolation<ListRequestDTO>> getViolations() {
        return violations;
    }
}
