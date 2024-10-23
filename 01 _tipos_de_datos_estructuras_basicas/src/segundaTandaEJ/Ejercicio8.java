package segundaTandaEJ;

import java.util.Scanner;

public class Ejercicio8 {
    public Ejercicio8() {

        /*
         * 8.- Escribe un programa que obtenga los números enteros comprendidos entre
         * dos números introducidos por tecladoy
         * validados como distintos, el programa debe empezar por el menor de los
         * enteros introducidos e ir incrementando de 7 en 7.
         */

        Scanner leer = new Scanner(System.in);
        boolean SonIguales = false;
        int numero1;
        int numero2;

        do {
            System.out.println("introduce un numero");
            numero1 = leer.nextInt();

            System.out.println("introducción otro numero");
            numero2 = leer.nextInt();

            SonIguales = numero1 == numero2;

            if (SonIguales) {
                System.out.println("Los numeros introducidos son iguales, por favor vuele a introducir");
            }

        } while (SonIguales);

        if (numero1 > numero2) {

            int aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }

        for (int i = numero1; i <= numero2; i += 7) {
            System.out.println(i);
        }

    }
}
