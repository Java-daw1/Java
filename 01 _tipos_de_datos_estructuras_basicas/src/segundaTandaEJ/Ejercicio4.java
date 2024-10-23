package segundaTandaEJ;

public class Ejercicio4 {
    public Ejercicio4() {

 //4.- Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.

        System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
        long numeroIntroducido = Long.parseLong(System.console().readLine());

        long n = numeroIntroducido;
        int numeroDeDigitos = 1;

        while (n > 10) {
            numeroDeDigitos++;
            n /= 10;
        }

        System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos +
                " dígitos");

    }
}
