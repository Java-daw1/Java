package cosasQueNoSePuedenOlvidar;

import java.util.Arrays;

public class NumeroRandomSinRepeticion {
        public NumeroRandomSinRepeticion (){


        int[] boleto = new int[6];
        generarRandom(boleto);
        
    //introduco numero que no se repita en el array
        for (int i = 0; i < boleto.length; i++) {
            boleto[i] = generarRandom(boleto);
        }
        System.out.println(Arrays.toString(boleto));
        
        
        
        
            }
    //busco el nuemro que no se repita
    private int generarRandom(int[] boleto) {
        int n = 0;

        do {
        
            n = (int) Math.floor(Math.random() * (49 - 1 + 1) + 1);

        } while (seRepite(boleto, n));

    return n;
    }
    
    private boolean seRepite(int[] boleto, int n) {

        for (int i = 0; i < boleto.length; i++) {
            if (boleto[i] == n) {
                return true;
            }
        }
        return false;

    }

}




        


