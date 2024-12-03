package cadenas;

import java.util.Scanner;

import javax.security.sasl.SaslClientFactory;

public class ContrasenaSegura {

    public ContrasenaSegura() {
        /*
         * 2.- Crea un metodo que comprueba si una contraseña es segura: min 8
         * caracteres, mayusculas, minusculas, numeros
         * y caracteres especiales.
         */

        String comprobarContraseña = "iiiiiiioI1%";

        compruebaContraseña(comprobarContraseña);

    }

    private void compruebaContraseña(String comprobarContraseña) {
        
        boolean longitud = false;
        boolean tieneMayusculas = false;
        boolean tieneMinusculas = false;
        boolean tieneNumeros = false;
        boolean tieneCaracteresEsp = false;

        for (int i = 0; i < comprobarContraseña.length(); i++) {

            if (comprobarContraseña.length() >= 8) {
                longitud = true;

            }
            if (Character.isUpperCase(comprobarContraseña.charAt(i))) {
                tieneMayusculas = true;

            }
            if (Character.isLowerCase(comprobarContraseña.charAt(i))) {
                tieneMinusculas = true;

            }
            if (Character.isDigit(comprobarContraseña.charAt(i))) {
                tieneNumeros = true;
            }
            if (!Character.isLetterOrDigit(i)) {
                tieneCaracteresEsp = true;
            }

        }

        if (longitud == true && tieneCaracteresEsp == true && tieneNumeros == true && tieneMinusculas == true
                && tieneMayusculas == true) {

            System.out.println("La contraseña es segura");

        } else {
            System.out.println("la contraseña no es segura");
        }

    }

}
