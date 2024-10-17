package estudio_estructuras_basicas;

import java.util.Scanner;

public class EstudioEstructurasCondicionales {

    public EstudioEstructurasCondicionales() {

        int edad = 13;
        boolean esBisiesto = true;

        if (esBisiesto) {
            System.out.println("EL AÑO ES BISIESTO");
        } else {
            
            System.out.println("EL AÑO NO ES BISIESTO");
        }

        boolean esMayorEdad = edad >= 18;

        if (esMayorEdad) {
            System.out.println("mayor  de edad");
        } else {

            System.out.println("menor de edad");
        }

        Scanner leer = new Scanner(System.in);
        System.out.println("¿cual es la capital de kiribati?");
        String respuesta = leer.next();

        if (respuesta.equals("Taraka")) {

            System.out.println();
        }

        // dime si estos numeros son positivos
        int numero = 5;
        boolean positivo = (0 <= numero);

        if (positivo) {

            System.out.println("El numero es positivo");

        } else {
            System.out.println("El numero es negativo");

        }

        // estudio switch
        /*
         * System.out.println("MENU");
         * System.out.println("1. SUMA DOS NUMEROS");
         * System.out.println("2. RESTA DOS NUMEROS");
         * System.out.println("3. MULTIPLICA 2 NUMEROS");
         * System.out.println("4. DIVIDIR 2 NUMEROS");
         * System.out.println("5. SALIR");
         * int opcion =leer.nextInt();
         * switch (opcion) {
         * case 1:
         * System.out.println("SUMA");
         * break;
         * 
         * case 2:
         * System.out.println("RESTA");
         * break;
         * 
         * case 3:
         * System.out.println("MULTIPLICACION");
         * break;
         * 
         * case 4:
         * System.out.println("DIVISION");
         * break;
         * 
         * case 5:
         * System.out.println("SALIR");
         * break;
         * 
         * default:
         * break;
         * }
         */
        int mes = 0;
        System.out.println("INTRODUZCA UN MES :");
        Scanner reed = new Scanner(System.in);
        mes = reed.nextInt();
        switch (mes) {
            case 1:
                System.out.println("enero");
                break;

            case 2:
                System.out.println("febrero");
                break;

            case 3:
                System.out.println("marzo");
                break;

            case 4:
                System.out.println("abril");
                break;

            case 5:
                System.out.println("mayo");
                break;

            case 6:
                System.out.println("junio");
                break;

            case 7:
                System.out.println("julio");
                break;

            case 8:
                System.out.println("agosto");
                break;

            case 9:
                System.out.println("septiembre");
                break;

            case 10:
                System.out.println("octubre");
                break;

            case 11:
                System.out.println("noviembre");
                break;

            case 12:
                System.out.println("diciembre");
                break;

            default:
                break;
        }

    }
}
