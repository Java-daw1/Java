package ejercicios;

import java.util.Scanner;

public class DecimalBinario {



    public DecimalBinario(){

//EJERCICIO 1 

/* 
    Scanner leer =new Scanner(System.in);

    System.out.println("introduce un año");
    int introduceYear = leer.nextInt();
    

    if ((introduceYear % 4 == 0 && introduceYear % 100 != 0) || (introduceYear % 100 == 0 && introduceYear % 400 == 0)) {
        
       System.out.println("es bisiesto");
        
       }else{
        System.out.println("no es bisiesto");
       }
 */

 //EJERCICIO 2 SUMA PARES IMPARES Y RESTALOS

 /* 
int sumaPares = 0 ;
    
System.out.println("********** PARES **********");
for (int i = 2; i < 21; i+=2) {

    sumaPares += i;

    }

System.out.println(sumaPares);



int sumaImpar=0;
int impar = 0;

System.out.println("********** IMPARES **********");

do {

    impar++;

    if (impar % 2 != 0 ) {

        sumaImpar += impar ;
         
    }
    
} while (impar < 51);

System.out.println(sumaImpar);

System.out.println("********** SUMA Y RESTA DE LOS DOS **********");

int suma3=0;
int numero = 0;



do {

    numero++;

    if (numero % 2 != 0 ) {

        suma3 += numero ;
         
    }

    if (numero % 2 == 0) {

        suma3 -= numero;
    }
    
} while (numero < 20);

System.out.println(suma3);

*/

//EJERCICIO 3

/* 
boolean initialized=false;
int mayor=0,menor=0,entradaint=0;
String mayor_name="",menor_name="", entrada=""; 
Scanner sc = new Scanner(System.in);
for(int i=1;i<=10;i++){
    if (initialized==false){

        System.out.println("Introduzca el nombre " + i);
        entrada=sc.next();

        System.out.println("Introduzca el sueldo neto mensual");
        entradaint=sc.nextInt();

        mayor=menor=entradaint;
        mayor_name=menor_name=entrada;
        initialized=true;
    }
    if (initialized==true&&i!=1){
        System.out.println("Introduzca el nombre " + i);
        entrada=sc.next();

        System.out.println("Introduzca el sueldo neto mensual");
        entradaint=sc.nextInt();

        if(entradaint>mayor){
            mayor=entradaint;
            mayor_name=entrada;
        }
        if(entradaint<menor){
            menor=entradaint;
            menor_name=entrada;
        }
    }
}

sc.close();
System.out.println("El mayor sueldo es de " + mayor + " y corresponde a " + mayor_name);
System.out.println("El menor sueldo es de " + menor + " y corresponde a " + menor_name);
*/

//EJERCICIO 4 

/* 
int a=214, b=7, min=1;
for (int i = 1; i <= a; i++) {
    while (((a%i==0)||(b%i==0))&&i!=1) {
        if ((a%i==0)&&(b%i==0)) {
            min*=i;
            a/=i;
            b/=i;
        } else if ((a%i!=0)&&(b%i==0)){
            min*=i;
            b/=i;
        } else if ((a%i==0)&&(b%i!=0)){
            min*=i;
            a/=i;
        }
    }
}
System.out.println(min);
*/

// EJERCICIO 5 BINARIO

/* 
Scanner leer = new Scanner(System.in);


 System.out.println("Introduzca un número entero para pasarlo a binario:");

 int numleido = leer.nextInt();

 String binario = "";

 // si el numero introducido es cero no entra al bucle
 if (numleido == 0) {

     binario = "0";
     
 } else {

     while (numleido > 0) {

         binario = (numleido % 2) + binario; 
         numleido /= 2; 
     }
 }

 System.out.println("En binario es: " + binario);

*/


    }
}
