package primeraTandaEJ;

import java.util.Scanner;

public class Ejercicio7 {
    public Ejercicio7() {

        // 7-Escribe un programa que diga cuál es la última cifra de un número entero
        // introducido por teclado.

        Scanner leer = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO POSITIVO");
        int Numero = leer.nextInt();
        int UltimaCifra = Numero % 10;
        System.out.println("LA ULTIMA CIFRA DEL NUMERO " + Numero + " ES " + UltimaCifra);
    }

}
