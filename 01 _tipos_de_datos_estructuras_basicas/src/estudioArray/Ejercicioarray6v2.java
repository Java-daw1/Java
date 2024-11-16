package estudioArray;

public class Ejercicioarray6v2 {
    public Ejercicioarray6v2() {
        /*
          6.- Diseñar un programa que me permita almacenar 10 boletos de primitiva,
          luego genere un sorteo y me diga
          cuantos aciertos tiene cada boleto.
         */
        int[][] aleatorios = new int[10][6];
        aleatorios = generaAleatorios(10, 6, 1, 49);
        // boletos
        for (int i = 0; i < aleatorios.length; i++) {
            for (int j = 0; j < aleatorios[i].length; j++) {
                System.out.print("[" + aleatorios[i][j] + "]" + "");
            }
            System.out.println();
        }

        // GENERA EL SORTEO

        System.out.println();
        System.out.println("**** SORTEO ****");
        System.out.println();

        int[] sorteo = new int[6];
        sorteo = generaSorteoAleatorio(6, 1, 49);

        for (int i = 0; i < sorteo.length; i++) {
            System.out.print("[" + sorteo[i] + "]" + "");

        }
        System.out.println();

        // CUANTOS ACIERTOS TIENE CADA BOLETO
        int contador = 0;

        for (int i = 0; i < aleatorios.length; i++) {
            contador++;
            System.out.println("BOLETO : " + "[" + contador + "]" + " NUMERO DE ACIERTOS : "
                    + contarRepeticionFila(aleatorios[i], sorteo));

        }

    }

    private int[] generaSorteoAleatorio(int cantidad, int limiteInferior, int limiteSuperior) {

        int[] sorteo = new int[cantidad];

        // VARIABLES DEL BUCLE

        int ale = 0;
        int x = 0;

        // CREAR UN NUMERO RANDOM

        for (x = 0; x < sorteo.length; x++) {
            ale = (int) Math.floor(Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
            sorteo[x] = ale;
        }
        return sorteo;

    }

    private int[][] generaAleatorios(int filas, int columnas, int limiteInferior, int limiteSuperior) {

        int[][] aleatorios = new int[filas][columnas];

        for (int f = 0; f < aleatorios.length; f++) {
            for (int c = 0; c < aleatorios[f].length; c++) {
                aleatorios[f][c] = (int) Math.floor(Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
            }
            for (int i = 0; i < aleatorios.length; i++) {
                while (viewRepeticionFila(aleatorios[i]) == true) {
                    for (int c = 0; c < aleatorios[f].length; c++) {
                        aleatorios[i][c] = (int) Math.floor(Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
                    }
                }
            }
        }
        return aleatorios;

    }
    
    public boolean viewRepeticionFila(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //contar si un boleto se repite
    public int contarRepeticionFila(int[] array, int[] sorteo) {
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < sorteo.length; j++) {
                if (i != j && array[i] == sorteo[j]) {
                    contador++;

                }

            }
        }
        return contador;
    }

}
