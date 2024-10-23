package segundaTandaEJ;

import java.util.Scanner;

public class Ejercicio6 {
    public Ejercicio6() {

        /*
         * 6.- Escribe un programa que muestre los n primeros términos de la serie de
         * Fibonacci. El primer término de la serie
         * de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
         * anteriores, por lo que tendríamos que los
         * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
         * debe introducir por teclado.
         */

        Scanner leer = new Scanner(System.in);

        int primero = 0;
        int segundo = 1;
        int n = leer.nextInt();

        for (int i = 0; i < n; i++) {

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;

            System.out.println(siguiente);

        }

    }
}
