package estudioArray;

import java.util.Scanner;

public class Notas {

    public Notas (){

        System.out.println("*********GESTION DE NOTAS********");


        Scanner leer = new Scanner(System.in);

        int[] []notas={{5,6,7,5,7,3,4,6,8,1},
                       {2,4,5,3,7,6,8,4,9,10},
                       {4,3,8,7,6,7,4,5,6,2},
                       {7,8,9,6,5,7,7,8,9,10}};

        String [] alumnos = {"Luis","Cristian","Alex","Nacho","Victo","Manuel","Alvaro","Pablo","Dani","Diego"};
        String [] asignaturas = {"Programacion","BaseDeDatos","Sistmas","Entornos"};

        System.out.println("***** ELIGE UNA OPCION *****");
        System.out.println("1. Mostrar notas de una asignatura");

        int opcion = leer.nextInt();




        switch (opcion) {
            case 1:
                System.out.println();

            mostrarAsignaturas(notas,asignaturas,alumnos);
                            
                            break;
                    
                        default:
                            break;
                    }
            
            
            
            
            
            
            
            
            
            
            
            
                }
            
                private void mostrarAsignaturas(int[][] notas, String[] asignaturas, String[] alumnos) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'mostrarAsignaturas'");
                }

}
