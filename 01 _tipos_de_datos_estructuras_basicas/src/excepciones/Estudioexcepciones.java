package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Estudioexcepciones {
  public Estudioexcepciones() {
    /*
     * try {
     * int div = 4 / 2;
     * System.out.println("div : " + div);
     * int[] array = { 1, 2, 3 };
     * System.out.println(array[2]);
     * } catch (ArithmeticException e) {
     * System.out.println("Error :" + e.getMessage());
     * 
     * }
     * 
     * catch (ArrayIndexOutOfBoundsException e) {
     * System.out.println("Error :" + e.getMessage());
     * System.out.println("indice fuera de rango");
     * 
     * }
     * // error comun con objetos
     * String texto = "hola";
     * 
     * try {
     * System.out.println(texto.length());
     * } catch (NullPointerException e) {
     * System.out.println("Error :" + e.getMessage());
     * System.out.println("objeto no instanciado");
     * }
     * Scanner sc = new Scanner(System.in);
     * 
     * try {
     * System.out.println("introduce un numero");
     * int num = sc.nextInt();
     * 
     * } catch (InputMismatchException e) {
     * System.out.println("Error :" + e.getMessage());
     * System.out.println("tipo de dato incorrepto");
     * }
     */
    /*
     * try {
     * division(7, 0);
     * } catch (ArithmeticException e) {
     * System.out.println("Estas dividiendo entre 0");
     * }
     */

    try {
      calculaEdad(17);
    } catch (MenorEdadException e) {
        System.out.println("Error : " + e.getMessage());
      
    }
    
      }
    
    
    
      private void calculaEdad(int i) throws MenorEdadException {
        if (i<18) {
          throw new MenorEdadException();
        }
    }
    
    
    
    private void division(int i, int j) {
    double div = i / j;
    System.out.println(div);

  }
}
