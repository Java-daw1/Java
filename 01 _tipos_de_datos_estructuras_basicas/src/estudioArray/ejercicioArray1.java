package estudioArray;

public class ejercicioArray1 {

    public ejercicioArray1() {

        // 1.-Llena un array de 10 elementos con números aleatorios entre 1 y 100.
        // Luego, recorre el array para encontrar y
        // mostrar el valor mínimo y el valor máximo.:

        int[] elementos;
        elementos = new int[10];
        elementos[0] = aleatorio(1, 100);
        elementos[1] = aleatorio(1, 100);
        elementos[2] = aleatorio(1, 100);
        elementos[3] = aleatorio(1, 100);
        elementos[4] = aleatorio(1, 100);
        elementos[5] = aleatorio(1, 100);
        elementos[6] = aleatorio(1, 100);
        elementos[7] = aleatorio(1, 100);
        elementos[8] = aleatorio(1, 100);
        elementos[9] = aleatorio(1, 100);

        System.out.println(elementos[0] + " " + elementos[1] + " " + elementos[2] + " " + elementos[3] + " "
                + elementos[4] + " " + elementos[5] + " " + elementos[6] + " " + elementos[7] + " " + elementos[8] + " " + elementos[9]);

    }

    private int aleatorio(int limiteInferior, int limiteSuperior) {

        // VARIABLES DEL BUCLE

        int ale = 0;
        int x = 0;

        // CREAR UN NUMERO RANDOM

        for (x = 0; x < 10; x++) {
            ale = (int) Math.floor(Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);

        }

        return ale;



    }

}
