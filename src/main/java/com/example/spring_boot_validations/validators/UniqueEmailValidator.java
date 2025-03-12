package com.example.spring_boot_validations.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { UniqueEmailValidation.class })
public @interface UniqueEmailValidator {
    // Error message
    public String message() default "Invalid email address";

    // Represents a group of constraints
    public Class<?>[] groups() default {};

    // Represents additional information about the annotation
    public Class<? extends Payload>[] payload() default {};
}
