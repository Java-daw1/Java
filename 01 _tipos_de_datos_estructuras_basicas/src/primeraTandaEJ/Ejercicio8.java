package primeraTandaEJ;

import java.util.Scanner;

public class Ejercicio8 {
    public Ejercicio8() {

        /*
         * 8- Escribe un programa que diga cuál es la primera cifra de un número entero
         * introducido por teclado. Se permiten números de hasta 5 cifras.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO POSITIVO");
        int Numero = leer.nextInt();

        int Numero5Cifras = Numero / 10000;
        int Numero4Cifras = Numero / 1000;
        int Numero3Cifras = Numero / 100;
        int Numero2Cifras = Numero / 10;
        int Numero1Cifras = Numero;

        if (Numero < 0 || Numero > 99999) {
            System.out.println("EL NUMERO INTRODUCIDO ES MAYOR DE 5 CIFRAS O ES NEGATIVO");
        } else if (Numero >= 9999 && Numero <= 99999) {
            System.out.println("LA ULTIMA CIFRA DEL NUMERO " + Numero + " ES " + Numero5Cifras);
        } else if (Numero >= 999 && Numero <= 9999) {
            System.out.println("LA ULTIMA CIFRA DEL NUMERO " + Numero + " ES " + Numero4Cifras);
        } else if (Numero >= 99 && Numero <= 999) {
            System.out.println("LA ULTIMA CIFRA DEL NUMERO " + Numero + " ES " + Numero3Cifras);
        } else if (Numero >= 9 && Numero <= 99) {
            System.out.println("LA ULTIMA CIFRA DEL NUMERO " + Numero + " ES " + Numero2Cifras);
        } else if (Numero >= 0 && Numero <= 9) {
            System.out.println("LA ULTIMA CIFRA DEL NUMERO " + Numero + " ES " + Numero1Cifras);
        }
    }

}
