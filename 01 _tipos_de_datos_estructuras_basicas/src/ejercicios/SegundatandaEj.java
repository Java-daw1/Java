package ejercicios;

import java.util.Scanner;

public class SegundatandaEj {

  public SegundatandaEj() {

    // 1.- Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle
    // for.,while y do while

    /*
     * 
     * int i = 0;
     * 
     * while(i <= 100) {
     * System.out.println(i);
     * i+=5;
     * }
     * 
     */

    // 2 .- Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
    // utilizando un bucle while.

    /*
     * int numero= 320;
     * 
     * while (numero >= 160) {
     * System.out.println(numero);
     * numero -=20;
     * }
     */

    /*
     * 3.-Realiza el control de acceso a una caja fuerte. La combinación será un
     * número de 4 cifras. El programa nos pedirá
     * la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo
     * siento, esa no es la combinación”y si
     * acertamos se nos dirá “La caja fuerte se ha abierto
     * satisfactoriamente”.Tendremos cuatro oportunidades para abrir la
     * caja fuerte.
     */

    /*
     * Scanner leer = new Scanner(System.in);
     * System.out.println("INTRODUCE CLAVE");
     * 
     * int oportunidades = 4;
     * int clave = 8888;
     * 
     * while (oportunidades > 0) {
     * 
     * int ClaveUsuario = leer.nextInt();
     * 
     * if (ClaveUsuario == clave) {
     * System.out.println("La caja fuerte se ha abierto satisfactoriamente");
     * 
     * } else {
     * 
     * oportunidades --;
     * System.out.println("Lo siento, esa no es la combinación te quedan " +
     * oportunidades + " opurtunidades");
     * 
     * } if (oportunidades == 0) {
     * System.out.println("no te quedan mas intentos");
     * }
     * 
     * }
     */

    /*
     * 4.- Realiza un programa que nos diga cuántos dígitos tiene un número
     * introducido por teclado.
     */

    /*
     * System.out.
     * print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
     * long numeroIntroducido = Long.parseLong(System.console().readLine());
     * 
     * long n = numeroIntroducido;
     * int numeroDeDigitos = 1;
     * 
     * while (n > 10) {
     * numeroDeDigitos++;
     * n /= 10;
     * }
     * 
     * System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos +
     * " dígitos");
     */

    /*
     * 5.- Escribe un programa que calcule la media de un conjunto de números
     * positivos introducidos por teclado. A priori,
     * el programa no sabe cuántos números se introducirán. El usuario indicará que
     * ha terminado de introducir los datos
     * cuando meta un número negativo.
     */

    /*
     * Scanner leer = new Scanner(System.in);
     * 
     * int cont = 0;
     * int NumeroIntroducido= 0;
     * double sumaAcumulador= 0;
     * 
     * 
     * while (NumeroIntroducido >= 0) {
     * 
     * System.out.println("INTRODUCE NUMEROS");
     * NumeroIntroducido=leer.nextInt();
     * cont++;
     * sumaAcumulador += NumeroIntroducido;
     * 
     * }
     * System.out.println((sumaAcumulador-NumeroIntroducido)/(cont-1));
     */

    /*
     * 6.- Escribe un programa que muestre los n primeros términos de la serie de
     * Fibonacci. El primer término de la serie
     * de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
     * anteriores, por lo que tendríamos que los
     * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
     * debe introducir por teclado.
     */

    /*
     * Scanner leer = new Scanner(System.in);
     * 
     * int primero = 0;
     * int segundo = 1;
     * int n = leer.nextInt();
     * 
     * for (int i= 0; i < n ; i++) {
     * 
     * int siguiente = primero + segundo;
     * primero = segundo;
     * segundo= siguiente;
     * 
     * System.out.println(siguiente);
     * 
     * }
     */

    /*
     * 7.- Escribe un programa que diga si un número introducido por teclado es o no
     * primo. Un número primo es aquel que
     * sólo es divisible entre él mismo y la unidad.
     */

    /*
     * Scanner leer = new Scanner(System.in);
     * System.out.println("introduce un numero");
     * int NumeroIntroducido=leer.nextInt();
     * 
     * boolean esprimo= true;
     * 
     * for (int n = 2; n < NumeroIntroducido; n++ ){
     * if ((NumeroIntroducido % n) == 0) {
     * esprimo=false;
     * break;
     * }
     * }
     * 
     * if (esprimo) {
     * System.out.println("es primo");
     * }
     * 
     * else{
     * System.out.println("no es primo");
     * }
     */

    /*
     * 8.- Escribe un programa que obtenga los números enteros comprendidos entre
     * dos números introducidos por teclado
     * y validados como distintos, el programa debe empezar por el menor de los
     * enteros introducidos e ir incrementando
     * de 7 en 7.
     */

    /*
     * Scanner leer = new Scanner(System.in);
     * boolean SonIguales=false;
     * int numero1;
     * int numero2;
     * 
     * 
     * do {
     * System.out.println("introduce un numero");
     * numero1= leer.nextInt();
     * 
     * System.out.println("introducción otro numero");
     * numero2= leer.nextInt();
     * 
     * SonIguales= numero1==numero2;
     * 
     * if (SonIguales) {
     * System.out.
     * println("Los numeros introducidos son iguales, por favor vuele a introducir"
     * );
     * }
     * 
     * 
     * 
     * } while (SonIguales);
     * 
     * if (numero1 > numero2) {
     * 
     * int aux = numero1;
     * numero1 = numero2;
     * numero2 = aux;
     * }
     * 
     * for (int i = numero1; i <= numero2; i+= 7) {
     * System.out.println(i);
     * }
     */

    /*
     * 9.- Realiza un programa que vaya pidiendo números hasta que se introduzca un
     * numero negativo y nos diga cuantos
     * números se han introducido, la media de los impares y el mayor de los pares.
     * El número negativo sólo se utiliza para
     * indicar el final de la introducción de datos pero no se incluye en el
     * cómputo.
     */

    /*
     * System.out.println("Por favor, vaya introduciendo números enteros.");
     * System.out.
     * println("Puede terminar mediante la introducción de un número negativo.");
     * 
     * int numeroIntroducido;
     * int numeroDeElementos = 0;
     * int sumaImpares = 0;
     * int numeroDeElementosImpares = 0;
     * int maximoPar = 0;
     * 
     * do {
     * numeroIntroducido = Integer.parseInt(System.console().readLine());
     * 
     * if (numeroIntroducido >= 0) {
     * numeroDeElementos++;
     * if ((numeroIntroducido % 2) == 1) { // número impar
     * sumaImpares += numeroIntroducido;
     * numeroDeElementosImpares++;
     * } else { // número par
     * if (numeroIntroducido > maximoPar)
     * maximoPar = numeroIntroducido;
     * }
     * }
     * } while (numeroIntroducido >= 0);
     * 
     * System.out.println("Ha introducido " + numeroDeElementos +
     * " números positivos.");
     * System.out.print("La media de los impares es ");
     * System.out.println(sumaImpares / numeroDeElementosImpares + ".");
     * System.out.println("El máximo de los pares es " + maximoPar + ".");
     * }
     */

    // 10.- Realiza un programa que pida un número por teclado y que luego muestre
    // ese número al revés.

    /*
     * Scanner leer = new Scanner(System.in);
     * 
     * int numeroIntroducido = 0;
     * int ultimaCifra = 0;
     * String resultado = "";
     * 
     * System.out.println("introduce un numero");
     * numeroIntroducido = leer.nextInt();
     * 
     * for (int i = 0; numeroIntroducido >= 1; i++) {
     * 
     * ultimaCifra = numeroIntroducido % 10;
     * numeroIntroducido=numeroIntroducido / 10;
     * resultado += ultimaCifra;
     * 
     * }
     * System.out.println(resultado);
     */

    /*
     * 11.- Realiza un programa que pida primero un número y a continuación un
     * dígito. El programa nos debe dar la posición
     * (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el
     * número introducido.
     */

    /*
     * System.out.print("Introduzca un número entero: ");
     * long numeroIntroducido = Integer.parseInt(System.console().readLine());
     * 
     * System.out.print("Introduzca un dígito: ");
     * int digito = Integer.parseInt(System.console().readLine());
     * 
     * System.out.print("Contando de izquierda a derecha, el " + digito);
     * System.out.println(" aparece dentro de " + numeroIntroducido);
     * System.out.print("en las siguientes posiciones: ");
     * 
     * // se hace una copia del número introducido
     * long numero = numeroIntroducido;
     * 
     * // añade un 1 al final por si el número introducido termina en ceros,
     * // por ej. 10, 1000, etc.
     * numero = numero * 10 + 1;
     * 
     * // le da la vueta al número y calcula la longitud
     * 
     * long volteado = 0;
     * int longitud = 0;
     * int posicion = 1;
     * 
     * if (numero == 0) {
     * longitud = 1;
     * }
     * 
     * while (numero > 0) {
     * volteado = (volteado * 10) + (numero % 10);
     * numero /= 10;
     * longitud++;
     * } // while
     * 
     * // comprueba la posición
     * while (volteado != 1) {
     * if ((volteado % 10) == digito) {
     * System.out.print(posicion + " ");
     * }
     * volteado /= 10;
     * posicion++;
     * } // while
     * 
     * System.out.println();
     * }
     * 
     */

    // 12.- Escribe un programa que calcule el factorial de un número entero leído
    // por teclado.

    /*
     * Scanner leer = new Scanner(System.in);
     * 
     * int n = leer.nextInt();
     * int factorial= 1;
     * 
     * for (int i = 1; i <= n ; i++) {
     * 
     * factorial *= i;
     * 
     * 
     * }
     * System.out.println(factorial);
     */



  }

}
