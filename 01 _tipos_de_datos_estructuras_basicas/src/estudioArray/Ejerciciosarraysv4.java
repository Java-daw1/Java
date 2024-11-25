package estudioArray;

public class Ejerciciosarraysv4 {
    int sumaReferencia = 0;

    public Ejerciciosarraysv4() {

        /*
         * 3.-Diseñar un programa en Java que compruebe si un array de enteros de 5x5,
         * es un cuadrado mágico. Se considera
         * un cuadrado mágico aquel en el que las filas, las columnas y las diagonales
         * suman igual.
         */

        int[][] tabla = {
                { 11, 24, 7, 2, 3 },
                { 4, 12, 25, 8, 16 },
                { 17, 5, 13, 21, 9 },
                { 10, 18, 1, 14, 22 },
                { 23, 6, 19, 2, 15 }, };

        boolean sumaFilaIgual = false, sumaColumna = false, sumaDiagonalIgual = false;

        sumaFilaIgual = sumaFila(tabla);
        System.out.println(sumaFilaIgual);

        sumaColumna = sumaColumna(tabla);
        System.out.println(sumaColumna);

        sumaDiagonalIgual = sumaDiagonalPrincipal(tabla) == sumaReferencia
                && sumaDiagonalInversa(tabla) == sumaReferencia;

        if (sumaFilaIgual && sumaColumna && sumaDiagonalIgual) {
            System.out.println("es un cuadrado magico");
        } else
            System.out.println("no es un cuadrado magico");
    }

    private int sumaDiagonalInversa(int[][] tabla) {
        int sumaDiagonal2 = 0;
        int c = tabla.length - 1;
        for (int f = 0; f < tabla.length; f++) {
            sumaDiagonal2 += tabla[f][c--];
        }
        return sumaDiagonal2;
    }

    private int sumaDiagonalPrincipal(int[][] tabla) {
        int sumaDiagonal1 = 0;
        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                if (f == c) {
                    sumaDiagonal1 += tabla[f][c];
                }
            }
        }
        return sumaDiagonal1;
    }

    private boolean sumaColumna(int[][] tabla) {
        for (int f = 0; f < tabla.length; f++) {
            sumaReferencia+= tabla [f][0]
        }

        int sumaColumna = 0;

        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                sumaColumna += tabla[f][c];
            }
            if (sumaColumna != sumaReferencia) {
                return false;
            }
        }
        return true;
    }

    private boolean sumaFila(int[][] tabla) {

        for (int c = 0; c < tabla.length; c++) {

            sumaReferencia += tabla[0][c];

        }

        int sumaFila = 0;

        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {

                sumaFila += tabla[f][c];

            }
            if (sumaFila != sumaReferencia) {
                return false;
            }
        }

        return true;
    }
}