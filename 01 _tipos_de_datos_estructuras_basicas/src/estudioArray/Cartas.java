package estudioArray;

import java.util.Arrays;

public class Cartas {
    public Cartas() {
        // cartas del 1 al 48
        int[] cartas = new int[48];
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = i + 1;
        }
        // System.out.println(Arrays.toString(cartas));

        // Declaracion de los palos
        String[] palos = { "Oro", "Basto", "Espada", "Copas" };

        // Declaracion de la partida
        int[][] partida = new int[20][4];
        
        for (int i = 0; i < partida.length; i++) {
            for (int j = 0; j < partida[i].length; j++) {
                
                partida[i][j]= generacartasAleatoria(cartas, partida);
            }
        }


        // Genera las cartas y las introduce a la partida
        for (int i = 0; i < partida.length; i++) {
            for (int j = 0; j < partida[i].length; j++) {
                partida[i][j] = generacartasAleatoria(cartas, partida);

            }
        }

        // Introducir palos
       /*  for (int i = 0; i < cartas.length; i++) {
            System.out.println(introducirPalos(i, palos));
        }

        System.out.println();*/

        // imprimir la partida completa

        for (int i = 0; i < partida.length; i++) {
            System.out.printf("Jugador %s Tirada %s: %s, %s, %s, %s", getJugador(i), (i%10 + 1), introducirPalos(partida[i][0] - 1, palos),
                    introducirPalos(partida[i][1] - 1, palos), introducirPalos(partida[i][2] - 1, palos),
                    introducirPalos(partida[i][3] - 1, palos));
            System.out.println();
        }

    }

    private String introducirPalos(int carta, String[] palos) {

        String myCarta = ((carta % 12) + 1) + " " + palos[((carta) / 12)];

        return myCarta;

    }

    private int generacartasAleatoria(int[] cartas, int[][] partida) {
        int n = 0;
        // genera un numero ramdom y comprueba que no este ya en el array
        
        

            n = (int) Math.floor(Math.random() * (cartas.length - 1 + 1) + 1);

       
            

        return n;

    }

    private boolean comprobarArray(int n, int[][] partida) {
        // comprueba que el numero no este repetido (carta)
        for (int i = 0; i < partida.length; i++) {
            for (int j = 0; j < partida[i].length; j++) {
                if (partida[i][j] == n) {
                    return true;
                }
            }
        }
        return false;

    }
    public int getJugador(int n){
        int t=(n/10+1);
        return t;
    }
}
