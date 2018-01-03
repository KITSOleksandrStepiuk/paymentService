package com.kingfisher.payment.api.validator;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ValidatorUtil {

    public<T> String collectViolations(Set<ConstraintViolation<T>> violations) {

        StringBuilder sb = new StringBuilder("[ ");

        List<String> errors = violations.stream()
                .map(v -> v.getPropertyPath().toString() + " " + v.getMessage())
                .sorted()
                .collect(Collectors.toList());

        errors.forEach( err -> sb.append(err).append(", "));
        sb.replace(sb.length()-2, sb.length(), " ]");

        return sb.toString();
    }
}
