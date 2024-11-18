package estudioArray;

import java.util.Arrays;

public class Ejerciciosarray7 {
    public Ejerciciosarray7() {

        int[] boletoSorteo = new int[6];
        boletoSorteo = generarBoleto(boletoSorteo);

        int[] boletoUsuario = new int[6];

        generarBoleto(boletoUsuario);
        int aciertos = 0;
        int intentos = 0;

        do {
            intentos++;
            aciertos = 0;
            boletoUsuario = generarBoleto(boletoUsuario);
            for (int i = 0; i < boletoUsuario.length; i++) {
                if (seRepite(boletoSorteo, boletoUsuario[i])) {
                    aciertos++;
                }
            }
        } while (aciertos != 6);

        System.out.println(Arrays.toString(boletoUsuario) + " | " + Arrays.toString(boletoSorteo) + intentos);

    }

    private int[] generarBoleto(int[] boletoUsuario) {

        for (int i = 0; i < boletoUsuario.length; i++) {
            boletoUsuario[i] = generarRandom(boletoUsuario);
        }

        return boletoUsuario;
    }

    private int generarRandom(int[] boletoSorteo) {
        int n = 0;

        do {

            n = (int) Math.floor(Math.random() * (49 - 1 + 1) + 1);

        } while (seRepite(boletoSorteo, n));

        return n;
    }

    private boolean seRepite(int[] boletoSorteo, int n) {

        for (int i = 0; i < boletoSorteo.length; i++) {
            if (boletoSorteo[i] == n) {
                return true;
            }
        }
        return false;

    }

}
