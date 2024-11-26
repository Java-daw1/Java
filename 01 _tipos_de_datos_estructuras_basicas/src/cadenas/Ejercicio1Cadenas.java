package cadenas;

import java.util.Scanner;

public class Ejercicio1Cadenas {
    public Ejercicio1Cadenas(){
        //1.- Rompe cadenas: Crea un programa que me pida una frase y me la rompa en palabras.
        
        //crear Scaner para pedir la cadena
        Scanner leer = new Scanner(System.in);

        //pedimos la cadena
        System.out.println("introduce una frase");

        //le pido al usuario que introduzca una frase
        String frase = leer.nextLine();
        System.out.println("**************frase separada************");
        System.out.println( frase.replace(" ", "\n"));
        



    }

}
