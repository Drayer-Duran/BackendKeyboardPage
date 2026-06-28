package com.keyboard.api.modules.com.keyboard.api.modules.shared.validations;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;



@Documented
@Constraint(validateBy = rutValidator.class)//Esta clase hace la validacion
@Target({ElementType.FIELD, ElementType.PARAMETER})//se usara sobre variables y ciertos parametros
@Retention(RetentionPolicy.RUNTIME)//SOLO EXISTE MIENTRAS EL SERVIDOR ESTA ON
public @interface RutValido {

    //Mensaje en caso de que el rut sea incorrecto
    String message() default "El rut ingresado no es valido o cuenta con un formato incorrecto";

    //Grupo de validaciones
    Class<?>[] groups() default{};

    //Carga adicional 
    Class<? extends Payload>[] payload() default{};
}
