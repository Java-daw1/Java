package segundaTandaEJ;

import java.util.Scanner;

public class Ejercicio12 {
    public Ejercicio12() {

// 12.- Escribe un programa que calcule el factorial de un número entero leídopor teclado.

        Scanner leer = new Scanner(System.in);

        int n = leer.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {

            factorial *= i;
        }
        System.out.println(factorial);

    }
}
