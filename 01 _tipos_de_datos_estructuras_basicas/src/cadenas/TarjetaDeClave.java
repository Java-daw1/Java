package cadenas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TarjetaDeClave {
    public TarjetaDeClave() {
        Scanner sc = new Scanner(System.in);
        int[][] tarjeta = new int[10][10];

        rellenarTarjeta(tarjeta, 100, 999);

        for (int i = 0; i < tarjeta.length; i++) {
            System.out.println(Arrays.toString(tarjeta[i]));
        }
        int fila = (int) Math.floor(Math.random() * (9 - 0+1) + 0);
        int columna = (int) Math.floor(Math.random() * (9 - 0+1) + 0);


        int intentos = 3;
        int supuestoNumero = 0;

        while (intentos !=0) {
            
            System.out.println("DIME EL NUMERO DE CLAVE CORRECTO" + " TIENES "+ intentos + " INTENTOS");
            System.out.println("FILA : " + fila + " COLUMNA : " + columna);
            supuestoNumero = sc.nextInt();

            if (tarjeta[fila][columna]==supuestoNumero) {
                System.out.println("ES CORRECTO");
                break;
            }else{
                System.out.println("INCORRECTO");
            }


        }



    }

    private void rellenarTarjeta(int[][] tarjeta, int limiteInferior, int limiteSupeior) {
        int n = 0;
        for (int i = 0; i < tarjeta.length; i++) {
            for (int j = 0; j < tarjeta[i].length; j++) {
                do {
                    n = (int) Math.floor(Math.random() * (limiteSupeior - limiteInferior + 1) + limiteInferior);
                } while (enArray(tarjeta, n));
                tarjeta[i][j] = n;
            }
        }
    }

    private boolean enArray(int[][] tarjeta, int n) {
        for (int i = 0; i < tarjeta.length; i++) {
            for (int j = 0; j < tarjeta[i].length; j++) {
                if (tarjeta[i][j] == n) {
                    return true;
                }
            }
        }
        return false;
    }

}
