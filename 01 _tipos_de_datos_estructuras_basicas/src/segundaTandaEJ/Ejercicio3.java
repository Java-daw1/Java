package segundaTandaEJ;

import java.util.Scanner;

public class Ejercicio3 {
    public Ejercicio3() {

/* 3.-Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá 
la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”y si
acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.Tendremos cuatro oportunidades para abrir la caja fuerte. */


        Scanner leer = new Scanner(System.in);
        System.out.println("INTRODUCE CLAVE");

        int oportunidades = 4;
        int clave = 8888;

        while (oportunidades > 0) {

            int ClaveUsuario = leer.nextInt();

            if (ClaveUsuario == clave) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");

            } else {

                oportunidades--;
                System.out.println("Lo siento, esa no es la combinación te quedan " +
                        oportunidades + " opurtunidades");

            }
            if (oportunidades == 0) {
                System.out.println("no te quedan mas intentos");
            }

        }

    }
}
