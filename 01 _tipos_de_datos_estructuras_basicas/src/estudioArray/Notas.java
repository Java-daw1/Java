package estudioArray;


import java.util.Scanner;

public class Notas {
    // menu (1 cual es una asignatura), 2 .mostrar el bolitin de un alumno
    public Notas() {

        System.out.println("*********GESTION DE NOTAS********");

        Scanner leer = new Scanner(System.in);

        int[][] notas = { { 5, 6, 7, 5, 7, 3, 4, 6, 8, 1 },
                { 2, 4, 5, 3, 7, 6, 8, 4, 9, 10 },
                { 4, 3, 8, 7, 6, 7, 4, 5, 6, 2 },
                { 7, 8, 9, 6, 5, 7, 7, 8, 9, 10 } };

        String[] alumnos = { "Luis", "Cristian", "Alex", "Nacho", "Victo", "Manuel", "Alvaro", "Pablo", "Dani",
                "Diego" };
        String[] asignaturas = { "Programacion", "BaseDeDatos", "Sistmas", "Entornos" };

        System.out.println("***** ELIGE UNA OPCION *****");
        System.out.println("1. Mostrar notas de una asignatura");
        System.out.println("2. Muestra el voletin de un alumno");

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:

                mostrarAsignaturas(notas, asignaturas, alumnos);
                System.out.println(mostrarAsignaturas(notas, asignaturas, alumnos));

                break;

            case 2:

                break;

            default:
                break;
        }

    }

    private String mostrarAsignaturas(int[][] notas, String[] asignaturas, String[] alumnos) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ELIGE UNA ASIGNATURA");
        System.out.println("1. Programacion");
        System.out.println("2. Bases de datos");
        System.out.println("3. Sistmas");
        System.out.println("4. Entornos");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("************ PROGRAMACION ************");
                for (int x = opcion - 1; x < opcion; x++) {
                    for (int y = 0; y < notas[x].length; y++) {
                        System.out.println(alumnos[y] + " : " + notas[x][y]);
                    }
                }
                System.out.println("***************************************");

                break;

            case 2:
                System.out.println("************ BASE DE DATOS ************");
                for (int x = opcion - 1; x < opcion; x++) {
                    for (int y = 0; y < notas[x].length; y++) {
                        System.out.println(alumnos[y] + " : " + notas[x][y]);
                    }
                }
                System.out.println("***************************************");
                break;

            case 3:
                System.out.println("************ SISTEMAS ************");
                for (int x = opcion - 1; x < opcion; x++) {
                    for (int y = 0; y < notas[x].length; y++) {
                        System.out.println(alumnos[y] + " : " + notas[x][y]);
                    }
                }
                System.out.println("***************************************");
                break;

            case 4:
                System.out.println("************ ENTORNOS  ************");
                for (int x = opcion - 1; x < opcion; x++) {
                    for (int y = 0; y < notas[x].length; y++) {
                        System.out.println(alumnos[y] + " : " + notas[x][y]);
                    }
                }
                System.out.println("***************************************");
                break;

            default:
                break;
        }

        return mostrarAsignaturas(notas, asignaturas, alumnos);
    }

}
