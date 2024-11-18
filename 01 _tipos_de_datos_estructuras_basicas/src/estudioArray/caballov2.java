package estudioArray;

public class caballov2 {
    public caballov2() {

        // Movimientos del caballo en el tablero
        int[][] movimientosCaballo = {
                { -1, -2 }, { 1, -2 }, { 2, -1 }, { 2, 1 },
                { 1, 2 }, { -1, 2 }, { -2, 1 }, { -2, -1 }
        };

        // Crear el tablero
        int[][] tablero = new int[8][8];
        rellenaTablero(tablero);

        // Posición inicial del caballo
        int caballoX = 3; // Fila
        int caballoY = 3; // Columna

        // Colocar el caballo en el tablero
        tablero[caballoX][caballoY] = 2;

        // Calcular las posiciones a las que puede moverse el caballo
        marcarMovimientosValidos(tablero, movimientosCaballo, caballoX, caballoY);

        // Imprimir el tablero con los movimientos válidos
        imprimirTablero(tablero);
    }

    private void marcarMovimientosValidos(int[][] tablero, int[][] movimientos, int x, int y) {
        for (int[] movimiento : movimientos) {
            int nuevoX = x + movimiento[0];
            int nuevoY = y + movimiento[1];

            // Verificar que la nueva posición está dentro del tablero
            if (esPosicionValida(tablero, nuevoX, nuevoY)) {
                tablero[nuevoX][nuevoY] = 3; // 3 representa una posición válida de movimiento
            }
        }
    }

    private boolean esPosicionValida(int[][] tablero, int x, int y) {
        return x >= 0 && x < tablero.length && y >= 0 && y < tablero[0].length;
    }

    private void imprimirTablero(int[][] tablero) {
        char blanco = '\u25A0'; // Símbolo de cuadrado blanco
        char negro = '\u25A1'; // Símbolo de cuadrado negro
        char caballo = 'C'; // Representación del caballo
        char movimiento = 'X'; // Representación de una posición válida de movimiento

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 2) {
                    System.out.print(caballo + " ");
                } else if (tablero[i][j] == 3) {
                    System.out.print(movimiento + " ");
                } else if (tablero[i][j] == 1) {
                    System.out.print(blanco + " ");
                } else {
                    System.out.print(negro + " ");
                }
            }
            System.out.println();
        }
    }

    private void rellenaTablero(int[][] tablero) {
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
