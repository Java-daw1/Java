package primeraTandaEJ;

import java.util.Scanner;

public class Ejercicio10 {
    public Ejercicio10() {

// 10-Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten números de hasta 5 cifras.

        Scanner leer = new Scanner(System.in);

        System.out.println("INTRODUCE UN NUMERO DE ALMENOS DE 5 CIFRAS ");

        int numero = leer.nextInt();
        boolean capicua = false;
        if (numero < 0 || numero > 99999) {
            System.out.println("EL NUMERO ES MAYOR DE 5 CIFRAS");
        }

        if (numero < 10) {
            capicua = true;
            System.out.println("CAPICUA ES " + capicua);

        } else if (numero < 100 && numero > 10) {
            if ((numero / 10) == (numero % 10)) {
                capicua = true;
                System.out.println("CAPICUA ES " + capicua);
            }
        } else if (numero < 1000 && numero > 100) {
            if ((numero / 100) == (numero % 10)) {
                capicua = true;
                System.out.println("CAPICUA ES " + capicua);
            }
        } else if (numero < 10000 && numero > 1000) {

        }
        System.out.println(capicua);
    }

}
