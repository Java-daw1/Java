package cadenas;

import java.time.chrono.IsoChronology;
import java.util.Scanner;
// 978-84-415-2682-2
public class EjercicioISBN {
    public EjercicioISBN() {

        Scanner sc = new Scanner(System.in);
            System.out.println("INTRODUCE UN ISBN VALIDO");
            String isbn = sc.nextLine();
            isbn = isbn.replace("-", "");

        
            
        String isbnSinNumControl = isbn.substring(0, 12); // isbn sin numero de control
        char numControlChar = isbn.charAt(12);
        int numControl = numControlChar - '0';

        System.out.println("isbn: " + isbnSinNumControl + "\n" + "numero de control: " + numControlChar);

        // pares 2,4,6,8,10,12
        pares(isbnSinNumControl);
        System.out.println("Total numeros pares: " + pares(isbnSinNumControl));

        // impares 1, 3, 5, 7, 9, 11
        impares(isbnSinNumControl);
        System.out.println("Total numeros impares: " + impares(isbnSinNumControl));

        int sumaResultados = impares(isbnSinNumControl) + pares(isbnSinNumControl);
        System.out.println("Resultados de la suma tras haber multiplicado todos los numeros: " + sumaResultados + "\n");

        // caculo del digito de control
        int calculaResto = sumaResultados % 10;
        int calculaDigitoDeControl = 10 - calculaResto;
        System.out.println("Calculo del digito de control: " + calculaDigitoDeControl + "\n");

        // saber si el numero de control es igual que el que hemos sacado
        System.out.println("************************************************");
        if (calculaDigitoDeControl == numControl) {
            System.out.println("El isbn es correcto");
        } else
            System.out.println("El isbn no es correcto");

    }

    private int impares(String isbnSinNumControl) {

        int suma = 0;
        for (int i = 1; i < isbnSinNumControl.length(); i += 2) {

            char digito = isbnSinNumControl.charAt(i);
            int pasar = digito - '0'; // el menos hace que de el valor de un int
            suma += pasar * 3;
        }

        return suma;
    }

    private int pares(String isbnSinNumControl) {
        int suma = 0;
        for (int i = 0; i < isbnSinNumControl.length(); i += 2) {

            char digito = isbnSinNumControl.charAt(i);
            int pasar = digito - '0'; // el menos hace que de el valor de un int
            suma += pasar * 1;
        }

        return suma;
    }

}
