package com.keyboard.api.modules.com.keyboard.api.modules.shared.validations;
import jakarta.validations.Constraint;
import jakarta.validations.Payload;
import java.lang.annotation.*;




public @interface RutValido {

    //Mensaje en caso de que el rut sea incorrecto
    String message() default "El rut ingresado no es valido o cuenta con un formato incorrecto";

    //Grupo de validaciones
    Class<?>[] groups() default{};

    Class<? extends Payload><[] payload() default{};
}
