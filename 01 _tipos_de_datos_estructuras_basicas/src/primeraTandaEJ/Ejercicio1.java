package primeraTandaEJ;

import java.util.Scanner;

public class Ejercicio1 {
    public Ejercicio1() {

// 1.- Escribe un programa que pida por teclado un día de la semana y que digaqué asignatura toca a primera hora ese día.

        Scanner leer = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("DIME UN DIA DE LA SEMANA");
        System.out.println("---------------------------------");
        System.out.println("1. LUNES");
        System.out.println("2. MARTES");
        System.out.println("3. MIERCOLES");
        System.out.println("4. JUEVES");
        System.out.println("5. VIERNES");
        System.out.println("=================================");

        int menu = leer.nextInt();
        switch (menu) {

            case 1:
                System.out.println("EL LUNES A PRIMERA TOCA: PROGRAMACION ");
                break;

            case 2:
                System.out.println("EL MARTES A PRIMERA TOCA: SISTEMAS");
                break;

            case 3:
                System.out.println("EL MIERCOLES A PRIEMRA TOCA: SOSTENIBILIDAD");
                break;

            case 4:
                System.out.println("EL JUEVES A PRIMERA TOCA: DIGITALIZACION");
                break;

            case 5:
                System.out.println("EL VIERNES A PRIMERA TOCA: FOL");
                break;

            default:
                break;

        }

    }

}
