package estudioArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Votaciones {
    public Votaciones() {

        String[] partidos = { "p1", "p2", "p3" };
        int[] votos = { 100, 250, 60 };
        int escaños = 6;

        int[][] arrayPrincipal = new int[3][6];

        for (int i = 0; i < arrayPrincipal.length; i++) {
            System.out.println(Arrays.toString(arrayPrincipal[i]));
        }

        




    }

}
