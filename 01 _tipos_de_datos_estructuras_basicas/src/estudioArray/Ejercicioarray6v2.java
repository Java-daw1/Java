package estudioArray;

public class Ejercicioarray6v2 {
    public Ejercicioarray6v2() {

        int[][] aleatorios = new int[10][6];
        aleatorios = generaAleatorios(10, 6, 1, 49);

        for (int i = 0; i < aleatorios.length; i++) {
            for (int j = 0; j < aleatorios[i].length; j++) {

                System.out.print("[" + aleatorios[i][j] + "]" + "");
            }
            System.out.println();

        }


        
    }

    private int[][] generaAleatorios(int filas, int columnas, int limiteInferior, int limiteSuperior) {

        int[][] aleatorios = new int[filas][columnas];

        for (int f = 0; f < aleatorios.length; f++) {
            for (int c = 0; c < aleatorios[f].length; c++) {
                aleatorios[f][c] = (int) Math.floor(Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
            }
            for (int i = 0; i < aleatorios.length; i++) {
                while (viewRepeticionFila(aleatorios[i])==true){
                    for (int c = 0; c < aleatorios[f].length; c++) {
                        aleatorios[i][c] = (int) Math.floor(Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
                    }
                }                
            }
        }
        return aleatorios;

    }

    public boolean viewRepeticionFila(int [] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                if(i!=j && array[i]==array[j]){
                    return true;
                }
            }
        }
        return false;
    }

}
