package com.keyboard.api.modules.shared.utils;

public class ValidadorRut
{
    
    public static boolean validarRut(String rutCompleto)
    {
        if(rutCompleto == null || rutCompleto.trim().isEmpty())
        {
            return false;//Si esta vacio
        }

        String rutLimpio = rutCompleto.replace(".","").replace("-","").toUpperCase().trim();

        if(rutLimpio.length()<2)
        {
            return false;//Valida el cuerpo del rut y su digito verificador
        }

    
        //Try para verificar todo el caso del rut y en caso de haber errores retornar un mensaje de error y que no se cierre el programa
        try
        {

            //Separar el digito verificador del cuerpo
            String cuerpo = rutLimpio.substring(0,rutlimpio.length()-1);//Separa el ultimo digito

            //Toma el ultimo digito del cuerpo anterior
            //dv = digito verificador
            char dvProporcionado = rutLimpio.charAt(rutLimpio.length()-1);

            //Convertir el cuerpo del rut que esta pasado de varchar a integer o numero
            int rutNumero = Integer.parseInt(cuerpo);

            //Esquema matematico para poder validar el rut en base a Modulo 11 
            int suma = 0;
            int multiplo = 2;
            
            //bucle encargado de realizar la multiplicacion para acertar el digito verificador
            while(rutNumero > 0)
            {
                suma += (rutNumero % 10)* multiplo;
                rutNumero /= 10;
                multiplo = (multiplo ==7) ? 2 : multiplo +1;
            }

            int resto = 11 -(suma % 11);
            
            //El dv que sale de la multiplicacion
            char dvCalculado;

            if(resto == 11)
            {
                dvCalculado = '0';
            }else if(resto == 10)
            {
                dvCalculado = 'K';
            }
            else
            {   
                //pasamos el numero a caracter
                dvCalculado = Character.forDigit(resto, 10);
            }

            return dvProporcionado == dvCalculado;

        }catch (NumberFormatException e)
        {
            //En caso de que el usuario metio caracteres extraños caemos aca sin tumbar el proceso
            return false;
        }
    }
}