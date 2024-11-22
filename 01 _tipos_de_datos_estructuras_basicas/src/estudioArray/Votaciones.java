package estudioArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Votaciones {
    public Votaciones() {

        String[] partidos = { "p1", "p2", "p3" };
        int[] votos = { 100, 250, 60 };
        int escaños = 6;

        int[][] arrayPrincipal = new int[votos.length][escaños];

        

        repartoDeEscaños(arrayPrincipal, votos,escaños);

        for (int i = 0; i < arrayPrincipal.length; i++) {
            System.out.println(Arrays.toString(arrayPrincipal[i]));
        }
    }

    private void repartoDeEscaños(int[][] arrayPrincipal, int[] votos,int escaños) {
       
       for (int i = 0; i < votos.length; i++) {
        arrayPrincipal[i][0]=votos[i];
       }

       fo


        return;
    }
    
}
