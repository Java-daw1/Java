package estudioArray;

import java.util.Arrays;

public class ejercicioArray1 {

    public ejercicioArray1() {

        // 1.-Llena un array de 10 elementos con números aleatorios entre 1 y 100.
        // Luego, recorre el array para encontrar y
        // mostrar el valor mínimo y el valor máximo.:

        int [] aleatorios = generaAleatoriosSinRepeteicion(10,1,10);
                
                
                String ale ="";
                int min = aleatorios [0];
                int max = aleatorios [0];
                for (int i = 0; i < aleatorios.length; i++) {
                    
                    ale += aleatorios[i] + " ";
                    if (aleatorios[i] < min) {
                        min = aleatorios[i];
                    }
                    if (aleatorios[i] > max) {
                        max = aleatorios[i];
                    }
                }
                
                System.out.println(ale);
                System.out.println("EL VALOR MINIMO ES "+ min);
                System.out.println("EL VALOR MINIMO ES "+max);
                
            }
        
            private int[] generaAleatoriosSinRepeteicion(int cantidad, int limiteInferior, int limiteSuperior) {
             
                int [] chenchoCorleone = new int[cantidad];

                // VARIABLES DEL BUCLE
        
                int ale = 0;
                int x = 0;
        
                // CREAR UN NUMERO RANDOM
        
                for (x = 0; x < 10; x++) {
                    ale = (int) Math.floor(Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
                    chenchoCorleone[x] = ale;
                }
        
                return chenchoCorleone;
            }
     
    }


