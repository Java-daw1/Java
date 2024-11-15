package estudioArray;

public class Ejercicioarrays5 {
    public Ejercicioarrays5() {

        /*
         * 4.- Dado un array de enteros de tamaño 5x5, diseñar un programa en Java que
         * lo rellene como en la siguiente figura:
         * 0 1 2 3 4
         * 1 2 3 4 3
         * 2 3 4 3 2
         * 3 4 3 2 1
         * 4 3 2 1 0
         */

        int tabla[][] = new int[5][5];

        int[][] rellenar = rellenarTabla(tabla);
        printArrayBi(tabla);
    
        System.out.println(rellenarTabla(tabla));
    }

    private int[][] rellenarTabla(int[][] tabla) {
    
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                int valor =i+j;

                if (valor>=4) {
                    valor=4 - (valor-4);
                }
                tabla[i][j] = valor;
        }
    }
        return tabla;

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
