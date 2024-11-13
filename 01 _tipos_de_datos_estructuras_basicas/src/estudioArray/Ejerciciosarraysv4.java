package estudioArray;

public class Ejerciciosarraysv4 {
    public Ejerciciosarraysv4() {

        /*
         * 3.-Diseñar un programa en Java que compruebe si un array de enteros de 5x5,
         * es un cuadrado mágico. Se considera
         * un cuadrado mágico aquel en el que las filas, las columnas y las diagonales
         * suman igual.
         */

        int[][] tabla = {
                { 11, 24, 7, 20, 3 },
                { 4, 12, 25, 8, 16 },
                { 17, 5, 13, 21, 9 },
                { 10, 18, 1, 14, 22 },
                { 23, 6, 19, 2, 15 },};

        // suma diagonal 1

        int sumaDiagonal1 = diagonal1(tabla);
        System.out.println(sumaDiagonal1);

        // suma diagonal 2

        int sumaDiagonal2 = diagonal2(tabla);
        System.out.println(sumaDiagonal2);

        // suma de las columnas

        int sumaColumnas = Columnas(tabla);
        System.out.println(sumaColumnas);

        // suma filas

        int sumaFilas = Filas(tabla);
        System.out.println(sumaFilas);

        // COMPROBAMOS SI ES UN CUADRADO MAGICO

        if (sumaDiagonal1 == sumaDiagonal2 && sumaColumnas == sumaFilas) {
            System.out.println("ES CUADRADO MAGICO");
        } else {

            System.out.println("NO ES UN CUADRADO MAGICO");
        }

    }

    private int diagonal2(int[][] tabla) {

        int suma = 0;
        int n = tabla.length;

        for (int i = 0; i < n; i++) {
            suma += tabla[i][n - i - 1];
        }
        return suma;
    }

    private int Filas(int[][] tabla) {

        int suma = 0;

        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {

                suma += tabla[f][c];
            }
        }
        return suma;
    }

    private int Columnas(int[][] tabla) {

        int suma = 0;
        for (int c = 0; c < tabla.length; c++) {
            for (int f = 0; f < tabla[c].length; f++) {

                suma += tabla[f][c];
            }
        }
        return suma;
    }

    private int diagonal1(int[][] tabla) {
        int suma = 0;
        for (int f = 0; f < tabla.length; f++) {

            for (int c = 0; c < tabla[f].length; c++) {

                if (f == c) {

                    suma += tabla[f][c];
                }
            }
        }
        return suma;
    }
}