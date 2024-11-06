package estudioArray;

import java.util.Scanner;

public class EstudioArrayBidimensional {
    public EstudioArrayBidimensional() {
/* 
        int[][] notas;
        notas = new int[3][4];
        notas[0][0] = 5;
        notas[0][1] = 7;
        notas[0][2] = 9;
        notas[0][3] = 10;

        Scanner sc = new Scanner(System.in);

        for (int x = 0; x < notas.length; x++) {
            for (int y = 0; y < notas[x].length; y++) {
                notas[x][y] = sc.nextInt();
            }

        }
        System.out.println(notas);*/

        // intanciar array en una linea

        int[][] notas2 = new int[4][10];

        // intnaciamos una fila

        int[][] notas3 = new int[4][];
        // intnaciamos el tamayo de la fila
        notas3[0] = new int[4];
        notas3[1] = new int[3];

        // intnaciar array bidimensional con datos
        int[][] notas4 = { { 3, 5, 3, 2, 5, 6, 7, 4, 3, 10 },
                           { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                           { 8, 9, 6, 3, 2, 1, 4, 5, 7, 10 },
                           { 1, 9, 8, 7, 6, 5, 4, 1, 2, 10 } };


int [] notaUni = notas4[3];







    }

}
