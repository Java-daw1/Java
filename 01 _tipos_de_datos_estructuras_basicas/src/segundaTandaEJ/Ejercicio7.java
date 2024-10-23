package segundaTandaEJ;

import java.util.Scanner;

public class Ejercicio7 {
    public Ejercicio7() {

        /*
         * 7.- Escribe un programa que diga si un número introducido por teclado es o no
         * primo. Un número primo es aquel que
         * sólo es divisible entre él mismo y la unidad.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("introduce un numero");
        int NumeroIntroducido = leer.nextInt();

        boolean esprimo = true;

        for (int n = 2; n < NumeroIntroducido; n++) {
            if ((NumeroIntroducido % n) == 0) {
                esprimo = false;
                break;
            }
        }

        if (esprimo) {
            System.out.println("es primo");
        }

        else {
            System.out.println("no es primo");
        }

    }
}
