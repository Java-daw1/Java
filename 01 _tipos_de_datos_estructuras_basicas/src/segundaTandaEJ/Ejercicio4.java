package segundaTandaEJ;

import java.util.Scanner;

public class Ejercicio4 {
    public Ejercicio4() {

 //4.- Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 
        Scanner lee = new Scanner(System.in);

        System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");

        long numeroIntroducido = lee.nextLong();

        long n = numeroIntroducido;
        int numeroDeDigitos = 1;

        while (n > 10) {
            numeroDeDigitos++;
            n /= 10;
        }

        System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígitos");

    }
}
