package segundaTandaEJ;

import java.util.Scanner;

public class Ejercicio10 {
   public Ejercicio10() {

// 10.- Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

      Scanner leer = new Scanner(System.in);

      int numeroIntroducido = 0;
      int ultimaCifra = 0;
      String resultado = "";

      System.out.println("introduce un numero");
      numeroIntroducido = leer.nextInt();

      for (int i = 0; numeroIntroducido >= 1; i++) {

         ultimaCifra = numeroIntroducido % 10;
         numeroIntroducido = numeroIntroducido / 10;
         resultado += ultimaCifra;

      }
      System.out.println(resultado);

   }
}
