package com.example.spring_boot_validations.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueEmailValidation implements ConstraintValidator<UniqueEmailValidator, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        // Mock a duplicate email address
        if(value != "test@test.com") {
            return true;
        }
        return false;
    }
}
