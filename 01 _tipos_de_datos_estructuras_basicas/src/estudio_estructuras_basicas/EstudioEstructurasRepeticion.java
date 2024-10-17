package estudio_estructuras_basicas;

import java.util.Scanner;

public class EstudioEstructurasRepeticion {

    public EstudioEstructurasRepeticion() {

        System.out.println("Estudio Estructuras Repeticion");

        // for tiene 3 partes ( variable ; condicion ; incremento condicion )
        // "controlar vueltas del bucle que no de 1 de mas ni una de menos"
        for (int i = 1; i < 11; i++) {

            System.out.println(i);
        }
        System.out.println("===================================================");
        for (int i = 1; i < 11; i += 2) {

            System.out.println(i);
        }
        System.out.println("===================================================");
        for (int i = 10; i > 0; i--) {

            System.out.println(i);
        }

        // estudio bucle while (condicion)
        // Hay que salir del bucle
        // Es mas potente que el bucle for
        // Se entrara o no en funcion de la condicion
        System.out.println("bucle while=============================");
        int i = 11;
        while (i < 11) {

            System.out.println(i);
            i++;

        }

        // bucle dowhile (condicion)
        System.out.println("do while================");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 11);

        // ========================================================================================
        Scanner leer = new Scanner(System.in);
        int numeroIntruducido = 0;
        int cuentaNumeros = 0;
        int sumaAcumulador = 0;

        while (numeroIntruducido >= 0) {
            System.out.println("INTRODUCE UN NUMERO ENTERO");
            numeroIntruducido = leer.nextInt();
            cuentaNumeros++;
            sumaAcumulador += numeroIntruducido;
        }
        System.out.println("has introducido " + (cuentaNumeros - 1) + "numeros positivos.");
        System.out.println("la suma total de ellos es  " + (sumaAcumulador - numeroIntruducido));


        

    }
}
