package estudioArray;

import java.util.Arrays;

public class Caballo {
    public Caballo() {
        // declaracion de caballo , sus movimientos,
        int[][] caballo = { { -1, -2 }, { 1, -2 }, { 2, -1 }, { 2, 1 }, { 1, 2 }, { -1, 1 }, { -2, 1 }, { -2, -1 } };
        int[][] posiblesMovimineto = caballo;

        // declaracion del tablero y metodo
        int[][] tablero = new int[8][8];
        int[][] tableroAjedrez = tablero;
        rellenarTablero(tablero);

        // imprimir tablero
        for (int i = 0; i < tableroAjedrez.length; i++) {
            System.out.println(Arrays.toString(tableroAjedrez[i]));
        }

        // formatear tablero
        int[][] darFormato = tablero;
        //imprime el tablero formtado
        formatoTablero(tablero);



    }

    private void formatoTablero(int[][] tablero) {

        char blanco = '\u25A0'; // Símbolo de cuadrado blanco
        char negro = '\u25A1'; // Símbolo de cuadrado negro
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 1) {
                    System.out.print(blanco + " ");
                } else {
                    System.out.print(negro + " ");
                }
            }
            System.out.println();
        }
    }

    private void rellenarTablero(int[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = 1;

                } else {
                    tablero[i][j] = 0;
                }
            }
        }

    }
}
