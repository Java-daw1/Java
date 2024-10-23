package primeraTandaEJ;

import java.util.Scanner;

public class Ejercicio5 {

    public Ejercicio5() {

        /*
         * 5-Escribe un programa que dada una hora determinada (horas y minutos),
         * calcule los segundos que faltan para llegar
         * a la medianoche.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("DIME LA HORA");
        int PedirUnaHora = leer.nextInt();
        System.out.println("DIME LOS MINUTOS");
        int PedirUnMinuto = leer.nextInt();
        int hora = PedirUnaHora * 3600;
        int minutos = PedirUnMinuto * 60;
        if (PedirUnaHora <= 24 && PedirUnMinuto <= 60) {
            System.out.println("FALTAN " + (hora + minutos) + " SEGUNDOS");
        } else {
            System.out.println("ESA HORA NO EXISTE");

        }
    }
}
