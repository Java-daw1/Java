package ejerciciosDeRepaso2;

import java.util.Scanner;

public class Ejercicio1DeRepaso2 {
    public Ejercicio1DeRepaso2() {

        /*
         * 1.Realiza un programa para jugar a “adivina el numero”. El programa pedirá un
         * numero entre un limite
         * inferior y un limite superior, además me pedirá el numero de intentos( mayor
         * que 0) para adivinar el número.
         * El número se generará de forma aleatoria entre los limites dados. Una vez
         * introducidos los datos correctamente
         * me preguntará por un número. Si no acertamos me indicará si es mayor o menor
         * que el que buscamos y me dirá los
         * intentos que me quedan. Si acertamos me dará la enhorabuena y me dirá los
         * intentos que he necesitado. Si agotamos
         * los intentos me dirá, lo siento el numero era el….
         */

        Scanner leer = new Scanner(System.in);

        // limetes para pedir un numero
        System.out.println("============================================================");
        System.out.println("INTRODUCE EL LIMITE INFERIOR ENTRE EL QUE ESTARA TU NUMERO");
        System.out.println("============================================================");
        int limiteInferior = leer.nextInt();
        System.out.println("============================================================");
        System.out.println("INTRODUCE EL LIMITE SUPERIOR ENTRE EL QUE ESTARA TU NUMERO");
        System.out.println("============================================================");
        int limiteSuperior = leer.nextInt();

        // NUMERO ALEATORIO

        int aleatorio = aleatorio(limiteInferior, limiteSuperior);

        // numeros de intos que tendra el usuario para adivinar el numero

        int intentos = 5;
        int intentosUsuarios = 0;

        // PROGRAMA

        while (intentos > intentosUsuarios) {

            if (limiteInferior == limiteSuperior) {
                System.out.println("=================================================");
                System.out.println("POR FAVOR INTRODUCE 2 NUMEROS DISTINTOS");
                System.out.println("=================================================");
            }
            // NUMERO QUE INTRODUCE EL USUARIO

            System.out.println("INTRODUCE UN NUMERO");
            int numeroIntroducido = leer.nextInt();

            // SI EL NUMERO INTRODUCIDO ES IGUAL AL ALEATORIO

            if (numeroIntroducido == aleatorio) {
                System.out.println("**********************************************************************************");
                System.out.println("FELICIDADES HAS ACERTADO EL NUMERO HAS ACERTADO EN " + intentosUsuarios + " INTENTOS");
                System.out.println("**********************************************************************************");
                break;

                // SI EL NUMERO NTRODUCIDO ES MENOR QUE EL NUMERO RAMDOM

            } else if (numeroIntroducido > aleatorio) {
                intentos--;

                System.out.println( "---------------------------------------------------------------------------------------------");
                System.out.println("EL NUMERO ALEATORIO ES MENOR QUE EL QUE TIENES QUE ADIVINAR TE QUEDAN " + intentos + " INTENTOS");
                System.out.println( "--------------------------------------------------------------------------------------------");

                // SI EL NUMERO INTRODUCIDO ES MAYOR QUE EL NUMERO RANDOM

            } else if (numeroIntroducido < aleatorio) {
                intentos--;

                System.out.println( "--------------------------------------------------------------------------------------------");
                System.out.println("EL NUMERO ALEATORIO ES MAYOR QUE EL QUE TIENES QUE ADIVINAR TE QUEDAN " + intentos + " INTENTOS");
                System.out.println( "--------------------------------------------------------------------------------------------");

            }

        }

    }

    private int aleatorio(int limiteInferior, int limiteSuperior) {

        // VARIABLES DEL BUCLE

        int ale = 0;
        int x = 0;

        // CREAR UN NUMERO RANDOM

        for (x = 0; x < 1; x++) {
            ale = (int) Math.floor(Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
        }
        return ale;

    }
}