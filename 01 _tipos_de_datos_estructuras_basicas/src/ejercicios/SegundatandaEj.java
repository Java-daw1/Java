package ejercicios;

import java.util.Scanner;

public class SegundatandaEj {

  public SegundatandaEj() {

//1.- Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.,while y do while

/*
    
int MultiploDe = 5;

  do {
  System.out.println(MultiploDe);
  MultiploDe = MultiploDe + 5;
  } while (MultiploDe <= 100);

*/

//2 .- Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.

/* 
     int numero= 320;

     while (numero >= 160) {
      System.out.println(numero);
      numero -=20;
     }
     */

/*3.-Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá
la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”y si
acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.Tendremos cuatro oportunidades para abrir la
caja fuerte. */

/* 
Scanner leer = new Scanner(System.in);
System.out.println("INTRODUCE CLAVE");

    int oportunidades = 4;
    int clave = 8888;

while (oportunidades > 0) {

  int ClaveUsuario = leer.nextInt();

  if (ClaveUsuario == clave) {
  System.out.println("La caja fuerte se ha abierto satisfactoriamente");

  } else {
    
    oportunidades --;
    System.out.println("Lo siento, esa no es la combinación te quedan " + oportunidades + " opurtunidades");

  } if (oportunidades == 0) {
    System.out.println("no te quedan mas intentos");
  }
  
} */

/*4.- Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.*/

/*      System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
     long numeroIntroducido = Long.parseLong(System.console().readLine());
     
     long n = numeroIntroducido;
     int numeroDeDigitos = 1;
     
     while (n > 10) {
       numeroDeDigitos++;
       n /= 10;
     }
     
     System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígitos"); */

/*5.- Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A priori,
el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.*/

/* 
Scanner leer = new Scanner(System.in);

int cont = 0;
int NumeroIntroducido= 0;
double sumaAcumulador= 0;


  while (NumeroIntroducido >= 0) {

    System.out.println("INTRODUCE NUMEROS");
    NumeroIntroducido=leer.nextInt();
    cont++;
    sumaAcumulador += NumeroIntroducido;

  }
  System.out.println((sumaAcumulador-NumeroIntroducido)/(cont-1)); */

/*6.- Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie 
de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los 
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado. */

/* 
Scanner leer = new Scanner(System.in);

int primero = 0;
int segundo = 1;
int n = leer.nextInt();

for (int i= 0; i < n ; i++) {

int siguiente = primero + segundo;
primero = segundo;
segundo= siguiente;

System.out.println(siguiente);

} */

/* 7.- Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que
sólo es divisible entre él mismo y la unidad. */

/*
Scanner leer = new Scanner(System.in);
System.out.println("introduce un numero");
int NumeroIntroducido=leer.nextInt();

boolean esprimo= true;

for (int n = 2; n < NumeroIntroducido; n++  ){
  if ((NumeroIntroducido % n) == 0) {
    esprimo=false;
  }
} 

if (esprimo) {
  System.out.println("es primo");
}else{
  System.out.println("no es primo");
}*/

/* 8.- Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado
y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir incrementando
de 7 en 7. */

/* 
Scanner leer = new Scanner(System.in);

System.out.println("introduce un numero");
int numero=  leer.nextInt();
System.out.println("introducción hasta cuanto quiere que llege");
int numero2= leer.nextInt();

do {
  System.out.println(numero);
  numero= numero + 7;
} while (numero <= numero2);
*/

/*9.- Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos 
números se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/

// 10.- Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.



/*11.- Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dar la posición
(o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.*/


//12.- Escribe un programa que calcule el factorial de un número entero leído por teclado.

/* 
Scanner leer = new Scanner(System.in);

int n = leer.nextInt();
int factorial= 1;

for (int i = 1; i <= n ; i++) {

factorial *= i;
System.out.println(factorial);

}*/




  }

} 
