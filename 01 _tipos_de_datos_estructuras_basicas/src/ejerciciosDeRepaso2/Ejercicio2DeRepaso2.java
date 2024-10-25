package ejerciciosDeRepaso2;

import java.util.Scanner;



public class Ejercicio2DeRepaso2 {
    public Ejercicio2DeRepaso2(){

/*2.Diseña un programa que resuelva ecuaciones de segundo grado. El programa me pedirá por teclado 
los coeficiente a,b y c. ( ten en cuenta que puede haber ecuaciones que no tienen solución) */
Scanner leer = new Scanner(System.in);

//PEDIR COEFICIENTES
System.out.println("DIME EL COEFICIENTE A");
int a = leer.nextInt();
System.out.println("DIME EL COEFICIENTE B");
int b = leer.nextInt();
System.out.println("DIME EL COEFICIENTE C");
int c = leer.nextInt();

double raiz= Math.pow (b,2)-4 * a * c;

if (a == 0) {
    System.out.println("ESTA ECUACION NO ES DE SEGUNDO GRADO");
    return;
}

if (raiz >= 0) {
    double solucion1 = (-b + Math.sqrt(raiz)) /2 * a;
    double solucion2 = (-b - Math.sqrt(raiz)) /2 * a;
    
    System.out.println("LA ECUACION TIENE 2 SOLUCIONES " + solucion1 + " y " + solucion2);
    return;
}

if (raiz == 0) {

    double x = -b/(2*a);
    System.out.println("LA ECUACION SOLO TIENE UNA SOLUCION Y ES " + x);
    return;
    
}else {

    System.out.println("LA ECUACION NO TIENE SOLUCION REAL");
    return;
}
    }
}
