package estudioArray;

public class Ejerciciosarraysv2 {
    public Ejerciciosarraysv2() {

        /*
         * 1.- Escriba un programa que permita registrar 6 números en forma de tabla
         * 3x2. A continuación el programa
         * mostrará los valores máximo y mínimo de cada fila y de toda la tabla.
         */

        // Crear una tabla 3x2 con valores iniciales
        int[][] tabla = {
                { 20, 60 },
                { 10, 30 },
                { 90, 30 }
        };

        // Inicializar los mínimos y máximos de toda la tabla con el primer elemento
        int minimoTabla = tabla[0][0];
        int maximoTabla = tabla[0][0];

        for (int f = 0; f < tabla.length; f++) {
            int minimofila = tabla[f][0];
            int maximofila = tabla[f][0];

            // recorre cada elemto en la fila
                for (int c = 0; c < tabla[f].length; c++) {
                int valor = tabla[f][c];

            // Actualizar el mínimo y máximo de la fila
                if (valor < minimofila) {
                    minimofila = valor;
                }
                if (valor > maximofila) {
                    maximofila = valor;
                }
                if (valor < minimoTabla) {
                    minimoTabla = valor;
                }
                if (valor > maximoTabla) {
                    maximoTabla = valor;
                }
            }
            // Mostrar el mínimo y máximo de la fila actual
            System.out.println("Fila " + (f + 1) + " - Mínimo: " + minimofila + ", Máximo: " + maximofila);
        }
        // Mostrar el mínimo y máximo de toda la tabla
        System.out.println("Mínimo de toda la tabla: " + minimoTabla);
        System.out.println("Máximo de toda la tabla: " + maximoTabla);

    }
}
