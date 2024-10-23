package primeraTandaEJ;

import java.util.Scanner;

public class Ejercicio3 {
    public Ejercicio3() {
/*
3.- Escribe un programa que calcule el salario semanal de un trabajador
teniendo en cuenta que las horas ordinarias
(40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la
hora 41, se pagan a 16 euros la hora.
*/

        Scanner leer = new Scanner(System.in);
        System.out.println("CUANTAS HORAS HAS TRABAJADO");
        int horas = leer.nextInt();
        int HorasOrdinarias = horas * 12;
        int HorasExtras = (((horas - 40) * 16) + 40 * 12);

        if (horas <= 40) {
            System.out.println("TU SALARIO SEMANAL ES = " + HorasOrdinarias);
        } else {
            System.out.println("TU SALARIO SEMANAL ES = " + HorasExtras);
        }

    }

}
