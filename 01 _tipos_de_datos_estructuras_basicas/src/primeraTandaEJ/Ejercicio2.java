package primeraTandaEJ;

import java.util.Scanner;

public class Ejercicio2 {
    public Ejercicio2() {

        /*
         * 2.- Realiza un programa que pida una hora por teclado y que muestre luego
         * buenos días, buenas tardes o buenas
         * noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21
         * a 5 respectivamente. Sólo se tienen en
         * cuenta las horas, los minutos no se deben introducir por teclado.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("----------------------- ");
        System.out.println("DIME UNA HORA DE DIA ");
        System.out.println("----------------------- ");
        int HORA = leer.nextInt();

        if (HORA <= 12 && HORA >= 6) {
            System.out.println("--------------------------------------------");
            System.out.println("BUENOS DIAS SON LAS " + HORA + " DE LA MAÑANA");
            System.out.println("--------------------------------------------");
        } else if (HORA <= 20 && HORA >= 13) {
            System.out.println("------------------------------------------");
            System.out.println("BUENOS DIAS SON LAS " + HORA + " DE LA TARDE");
            System.out.println("------------------------------------------");
        } else if (HORA <= 24 && HORA >= 0) {
            System.out.println("------------------------------------------");
            System.out.println("BUENOS DIAS SON LAS " + HORA + " DE LA NOCHE");
            System.out.println("------------------------------------------");
        } else if (HORA > 24) {
            System.out.println("---------------------------");
            System.out.println("INTRODUCE UNA HORA CORRECTA");
            System.out.println("---------------------------");
        }

    }
}
