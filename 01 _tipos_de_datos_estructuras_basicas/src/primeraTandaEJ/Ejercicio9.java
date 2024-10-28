package primeraTandaEJ;

import java.util.Scanner;

public class Ejercicio9 {
    public Ejercicio9() {

        /*
         * 9- Realiza un programa que nos diga cuántos dígitos tiene un número entero
         * que puede ser positivo o negativo. Se
         * permiten números de hasta 5 dígitos.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO DE HASTA 5 CIFRAS");

        int numero = leer.nextInt();

        if (numero < -99999 || numero > 99999) {
            System.out.println("EL NUMERO ES MAYOR DE 5 CIFRAS");

        } else if (numero >= -9 && numero <= 9) {
            System.out.println("EL NUMERO TIENE 1 CIFRA");

        } else if (numero >= -99 && numero <= 99) {
            System.out.println("EL NUMERO TIENE 2 CIFRA");

        } else if (numero >= -999 && numero <= 999) {
            System.out.println("EL NUMERO TIENE 3 CIFRA");

        } else if (numero >= -9999 && numero <= 9999) {
            System.out.println("EL NUMERO TIENE 4 CIFRA");
            
        } else if (numero >= -99999 && numero <= 99999) {
            System.out.println("EL NUMERO TIENE 5 CIFRA");
        }

    }
}
