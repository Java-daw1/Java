package estudioArray;

import java.util.Scanner;

public class Correccion {
    public Correccion() {

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
        System.out.println("2. Muestra el boletin de un alumno y media");
        System.out.println("3. Mostrar boletin si el alumno a aprobado y media");

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:

                System.out.println("introduce el nombre de la  asignatura");
                System.out.println("1. Matematicas, 2. Base de datos, 3. Sistemas, 4.Entornos");
                int asignatura = leer.nextInt();
                asignatura--;
                muestraAsignaturas(asignatura, asignaturas, alumnos, notas);

                break;

            case 2:
                System.out.println("De que alumno quieres ver el boletin");
                System.out.println("1. Luis, 2. Cristian, 3. Alex, 4. Nacho, 5. Victor, 6. Manuel, 7. Alvaro, 8. Pablo, 9. Dani, 10. Diego ");
                int alumno = leer.nextInt();
                alumno--;
                mostrarBoletin(alumnos, notas, asignaturas, alumno);

                break;

            default:
                break;
        }

    }

    private void mostrarBoletin(String[] alumnos, int[][] notas, String[] asignaturas, int alumno ) {

        System.out.println("**************************");
        System.out.println(alumnos[alumno]);
        System.out.println("**************************");
        double suma=0;

        for (int c = 0; c < notas.length; c++) {
            
            System.out.println(asignaturas[c] + " : "+  notas[c][alumno]);
                
            }
        for (int f = 0; f < notas.length; f++) {
            
            
        }


        }

    

    private void muestraAsignaturas(int asignatura, String[] asignaturas, String[] alumnos, int[][] notas) {
        System.out.println("**************************");
        System.out.println(asignaturas[asignatura]);
        System.out.println("**************************");

        for (int c = 0; c < notas[asignatura].length; c++) {
            System.out.println("-----------------------------------");
            System.out.println(alumnos[c] + " : " + notas[asignatura][c]);
            System.out.println("-----------------------------------");

        }
    }

}
