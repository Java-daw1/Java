package primeraTandaEJ;

import java.util.Scanner;

public class Ejercicio6 {

    public Ejercicio6() {

        /*
         * 6- Escribe un programa que ordene tres números enteros introducidos por
         * teclado.
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("INTRODUCEEL EL PRIMER NUMERO: ");
        int n1 = leer.nextInt();
        System.out.println("INTRODUCEEL EL SEGUNDO NUMERO: ");
        int n2 = leer.nextInt();
        System.out.println("INTRODUCEEL EL TERCER NUMERO: ");
        int n3 = leer.nextInt();

        if (n1 < n2 && n2 < n3) {
            System.out.println(n1 + "," + n2 + "," + n3);

        } else if (n1 < n3 && n3 < n2) {

            System.out.println(n1 + "," + n3 + "," + n2);
        } else if (n2 < n1 && n1 < n3) {

            System.out.println(n2 + "," + n1 + "," + n3);
        } else if (n2 < n3 && n3 < n1) {

            System.out.println(n2 + "," + n3 + "," + n1);
        } else if (n3 < n1 && n1 < n2) {

            System.out.println(n3 + "," + n1 + "," + n2);
        } else if (n3 < n2 && n2 < n1) {

            System.out.println(n3 + "," + n2 + "," + n1);
        }

    }
}
