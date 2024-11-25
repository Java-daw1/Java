package estudioArray;

public class Ejerciciosarraysv4 {
    int sumaReferencia = 0;

    public Ejerciciosarraysv4() {
        int[][] tabla = {
                { 11, 24, 7, 20, 3 },
                { 4, 12, 25, 8, 16 },
                { 17, 5, 13, 21, 9 },
                { 10, 18, 1, 14, 22 },
                { 23, 6, 19, 2, 15 }
        };

        // Inicializar sumaReferencia con la suma de la primera fila
        sumaReferencia = sumaFilaInicial(tabla);

        boolean sumaFilaIgual = sumaFila(tabla);
        boolean sumaColumnaIgual = sumaColumna(tabla);
        boolean sumaDiagonalIgual = sumaDiagonalPrincipal(tabla) == sumaReferencia
                && sumaDiagonalInversa(tabla) == sumaReferencia;

        if (sumaFilaIgual && sumaColumnaIgual && sumaDiagonalIgual) {
            System.out.println("Es un cuadrado mágico");
        } else {
            System.out.println("No es un cuadrado mágico");
        }
    }

    private int sumaFilaInicial(int[][] tabla) {
        int suma = 0;
        for (int c = 0; c < tabla[0].length; c++) {
            suma += tabla[0][c];
        }
        System.out.println("Suma de referencia (primera fila): " + suma);
        return suma;
    }

    private int sumaDiagonalInversa(int[][] tabla) {
        int sumaDiagonal2 = 0;
        int c = tabla.length - 1;
        for (int f = 0; f < tabla.length; f++) {
            sumaDiagonal2 += tabla[f][c--];
        }
        System.out.println("Suma diagonal inversa: " + sumaDiagonal2);
        return sumaDiagonal2;
    }

    private int sumaDiagonalPrincipal(int[][] tabla) {
        int sumaDiagonal1 = 0;
        for (int f = 0; f < tabla.length; f++) {
            sumaDiagonal1 += tabla[f][f];
        }
        System.out.println("Suma diagonal principal: " + sumaDiagonal1);
        return sumaDiagonal1;
    }

    private boolean sumaColumna(int[][] tabla) {
        for (int c = 0; c < tabla[0].length; c++) {
            int sumaColumna = 0;
            for (int f = 0; f < tabla.length; f++) {
                sumaColumna += tabla[f][c];
            }
            System.out.println("Suma columna " + c + ": " + sumaColumna);
            if (sumaColumna != sumaReferencia) {
                return false;
            }
        }
        return true;
    }

    private boolean sumaFila(int[][] tabla) {
        for (int f = 0; f < tabla.length; f++) {
            int sumaFila = 0;
            for (int c = 0; c < tabla[f].length; c++) {
                sumaFila += tabla[f][c];
            }
            System.out.println("Suma fila " + f + ": " + sumaFila);
            if (sumaFila != sumaReferencia) {
                return false;
            }
        }
        return true;
    }
}