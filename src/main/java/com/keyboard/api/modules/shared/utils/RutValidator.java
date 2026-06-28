package com.keyboard.api.modules.shared.utils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import com.keyboard.api.modules.shared.utils.ValidatorRut;

public class RutValidator implements ConstraintValidator<RutValido, String> 
{
    @Override
    public void initialize(RutValido constraintAnnotation)
    {
        // 
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context)
    {
        if(value == null || value.trim().isEmpty())
        {
            return false;
        }


        return ValidadorRut.validarRut(value);
    }
}