package estudioArray;

public class Ejerciciosarraysv6 {
    public Ejerciciosarraysv6() {

        /*
         * 6.- Diseñar un programa que me permita almacenar 10 boletos de primitiva,
         * luego genere un sorteo y me diga
         * cuantos aciertos tiene cada boleto.
         */

        int[] GeneraAleatorios = generaAleatoriosSinRepeteicion(10, 1, 10);
        String array = "";
        for (int i = 0; i < GeneraAleatorios.length; i++) {

            array += GeneraAleatorios[i] + " ";

        }
        System.out.println(array);

    }

    private int[] generaAleatoriosSinRepeteicion(int cantidad, int limiteInferior, int limiteSuperior) {

        int[] aleatorios = new int[cantidad];

        // VARIABLES DEL BUCLE

        int ale = 0;
        int x = 0;

        // CREAR UN NUMERO RANDOM

        while (x < cantidad) {
            ale = (int) Math.floor(Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);

            // Verificar si el número ya existe en el array
            boolean existe = false;
            for (int i = 0; i < x; i++) {
                if (aleatorios[i] == ale) {
                    existe = true;
                    break;
                }
            }

            // Si no existe, lo agrega al array
            if (!existe) {
                aleatorios[x] = ale;
                x++;
            }
        }

        return aleatorios;

    }

}
