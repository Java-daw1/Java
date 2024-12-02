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

        String comprobarContraseña = "iiiiiiioI";

        compruebaContraseña(comprobarContraseña);

    }

    private void compruebaContraseña(String comprobarContraseña) {
        String resultado;
        boolean esSegura = true;

        for (int i = 0; i < comprobarContraseña.length(); i++) {

            comprobarContraseña.charAt(i);
            if (comprobarContraseña.length() < 7) {

                esSegura = false;
                System.out.println("Error : La contraseña tiene que ser mayor de 7 caracteres");

            }

            else if (comprobarContraseña.charAt(i) == 'ñ' || comprobarContraseña.charAt(i) == 'Ñ') {
                esSegura = false;
                System.out.println("Error : La contraseña no puede contener el caracter  ñ o Ñ");

            }

            else if (Character.isUpperCase(comprobarContraseña.charAt(i)) && Character.isLowerCase(comprobarContraseña.charAt(i))) {
                esSegura = true;
                

            } else{
                esSegura = false;
                
            }
            

        }

    }

}
