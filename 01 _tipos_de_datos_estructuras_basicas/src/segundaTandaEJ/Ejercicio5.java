package segundaTandaEJ;

import java.util.Scanner;

public class Ejercicio5 {
    
    public Ejercicio5() {

        /*
         * 5.- Escribe un programa que calcule la media de un conjunto de números
         * positivos introducidos por teclado. A priori,
         * el programa no sabe cuántos números se introducirán. El usuario indicará que
         * ha terminado de introducir los datos
         * cuando meta un número negativo.
         */

        Scanner leer = new Scanner(System.in);

        int cont = 0;
        int NumeroIntroducido = 0;
        double sumaAcumulador = 0;

        while (NumeroIntroducido >= 0) {

            System.out.println("INTRODUCE NUMEROS");
            NumeroIntroducido = leer.nextInt();
            cont++;
            sumaAcumulador += NumeroIntroducido;

        }
        System.out.println((sumaAcumulador - NumeroIntroducido) / (cont - 1));

    }
}
