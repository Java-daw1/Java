package estudioArray;

import java.sql.Array;
import java.util.Arrays;

public class Ejerciciosarraysv3 {
    public Ejerciciosarraysv3() {

        /*
         * 2.-Disena un programa en Java que rellene un array de 4x4 de la siguiente
         * manera:
         * 1 0 0 0
         * 0 1 0 0
         * 0 0 1 0
         * 0 0 0 1
         * A continuación muestre el contenido del array por pantalla.
         */

        int[][] tabla2 = new int[4][4];

        for (int f = 0; f < tabla2.length; f++) {

            for (int c = 0; c < tabla2.length; c++) {

                if (f == c) {

                    tabla2[f][c] = 1;

                } else {
                    tabla2[f][c] = 0;

                }
            }
        }
        printArrayBi(tabla2);
            
    }
    public void printArrayBi(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("["+array[i][j]+"]");                
            }
            System.out.println("");
        }
    }

}
