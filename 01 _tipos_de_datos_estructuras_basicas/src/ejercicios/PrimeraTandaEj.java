package ejercicios;

import java.util.Scanner;

public class PrimeraTandaEj {

    public PrimeraTandaEj() {
// 1.- Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
/*     
Scanner leer = new Scanner(System.in);
System.out.println("=================================");
System.out.println("DIME UN DIA DE LA SEMANA");
System.out.println("---------------------------------");
System.out.println("1. LUNES");
System.out.println("2. MARTES");
System.out.println("3. MIERCOLES");
System.out.println("4. JUEVES");
System.out.println("5. VIERNES");
System.out.println("=================================");
          
int menu= leer.nextInt();
switch (menu) {
          
case 1:
System.out.println("EL LUNES A PRIMERA TOCA: PROGRAMACION ");
break;
          
case 2:
System.out.println("EL MARTES A PRIMERA TOCA: SISTEMAS");
break;
         
case 3:
System.out.println("EL MIERCOLES A PRIEMRA TOCA: SOSTENIBILIDAD");
break;
         
case 4:
System.out.println("EL JUEVES A PRIMERA TOCA: DIGITALIZACION");
break;
         
case 5:
System.out.println("EL VIERNES A PRIMERA TOCA: FOL");
break;
         
default:
 break;
         
}*/
         

/*2.- Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas
noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. Sólo se tienen en
cuenta las horas, los minutos no se deben introducir por teclado.*/

/*
Scanner leer = new Scanner(System.in);
System.out.println("----------------------- ");
System.out.println("DIME UNA HORA DE DIA ");
System.out.println("----------------------- ");
int HORA = leer.nextInt();

if (HORA <= 12 && HORA >=6) {
System.out.println("--------------------------------------------");
System.out.println("BUENOS DIAS SON LAS " + HORA + " DE LA MAÑANA" );
System.out.println("--------------------------------------------");
}
else if (HORA <= 20 && HORA >=13) {
System.out.println("------------------------------------------");
System.out.println("BUENOS DIAS SON LAS " + HORA + " DE LA TARDE");
System.out.println("------------------------------------------");
}
else if (HORA <= 24 && HORA >= 0) {
System.out.println("------------------------------------------");
System.out.println("BUENOS DIAS SON LAS " + HORA + " DE LA NOCHE");
System.out.println("------------------------------------------");
}
else if (HORA > 24) {
System.out.println("---------------------------");
System.out.println("INTRODUCE UNA HORA CORRECTA");
System.out.println("---------------------------");
}
*/

/* 3.- Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias
(40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora. */

/*
Scanner leer= new Scanner(System.in);
System.out.println("CUANTAS HORAS HAS TRABAJADO");
int horas = leer.nextInt();
int HorasOrdinarias = horas * 12;
int HorasExtras = (((horas - 40 ) * 16) + 40 * 12);

 if (horas <= 40) {
System.out.println("TU SALARIO SEMANAL ES = " + HorasOrdinarias);
}
else {
System.out.println("TU SALARIO SEMANAL ES = " + HorasExtras);
}*/


// 4-Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

/*
         * Scanner leer = new Scanner(System.in);

         * System.out.println("CUAL ES TU MES DE NACIMINETO");
         * 
         * System.out.println("1. ENERO");
         * System.out.println("2. FEBRERO");
         * System.out.println("3. MARZO");
         * System.out.println("4. ABRIL");
         * System.out.println("5. MAYO");
         * System.out.println("6. JUNIO");
         * System.out.println("7. JULIO");
         * System.out.println("8. AGOSTO");
         * System.out.println("9. SEPTIEMBRE");
         * System.out.println("10. OCTUBRE");
         * System.out.println("11. NOVIEMBRE");
         * System.out.println("12. DICIEMBRE");
         * int DimeTuMes = leer.nextInt();
         * 
         * switch (DimeTuMes) {
         * case 1:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto1 = leer.nextInt();
         * if ( DiaNacimineto1 >= 20 ) {
         * System.out.println("ERES ACUARIO");
         * }
         * else {
         * System.out.println("ERES CAPRICORNIO");
         * }
         * 
         * break;
         * case 2:
         * 
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto2 = leer.nextInt();
         * if ( DiaNacimineto2 >= 21 ) {
         * System.out.println("PISCIS");
         * }
         * else {
         * System.out.println("ACUARIO");
         * }
         * 
         * break;
         * case 3:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto3 = leer.nextInt();
         * if ( DiaNacimineto3 >= 21 ) {
         * System.out.println("ERES ARIES");
         * }
         * else {
         * System.out.println("ERES PISCIS");
         * }
         * 
         * break;
         * case 4:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto4 = leer.nextInt();
         * if ( DiaNacimineto4 >= 20 ) {
         * System.out.println("ERES TAURO");
         * }
         * else {
         * System.out.println("ERES ARIES");
         * }
         * break;
         * case 5:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto5 = leer.nextInt();
         * if ( DiaNacimineto5 >= 21 ) {
         * System.out.println("ERES GEMINIS");
         * }
         * else {
         * System.out.println("ERES TAURO");
         * }
         * break;
         * 
         * case 6:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto6 = leer.nextInt();
         * if ( DiaNacimineto6 >= 21 ) {
         * System.out.println("ERES CANCER");
         * }
         * else {
         * System.out.println("ERES GEMINIS");
         * }
         * break;
         * 
         * case 7:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto7 = leer.nextInt();
         * if ( DiaNacimineto7 >= 23 ) {
         * System.out.println("ERES LEO");
         * }
         * else {
         * System.out.println("ERES CANCER");
         * 
         * }
         * break;
         * case 8:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto8 = leer.nextInt();
         * if ( DiaNacimineto8 >= 23 ) {
         * System.out.println("ERES VIRGO");
         * }
         * else {
         * System.out.println("ERES LEO");
         * }
         * break;
         * case 9:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto9 = leer.nextInt();
         * if ( DiaNacimineto9 >= 23 ) {
         * System.out.println("ERES LIBRA");
         * }
         * else {
         * System.out.println("ERES VIRGO");
         * }
         * break;
         * case 10:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto10 = leer.nextInt();
         * if ( DiaNacimineto10 >= 23 ) {
         * System.out.println("ERES ESCORPIO");
         * }
         * else {
         * System.out.println("ERES LIBRA");
         * }
         * break;
         * case 11:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto11 = leer.nextInt();
         * if ( DiaNacimineto11 >= 22 ) {
         * System.out.println("ERES SAGITARIO");
         * }
         * else {
         * System.out.println("ERES ESCORPIO");
         * }
         * break;
         * case 12:
         * System.out.println("DIME TU DIA DE NACIMINETO");
         * int DiaNacimineto12 = leer.nextInt();
         * if ( DiaNacimineto12 >= 22 ) {
         * System.out.println("ERES CAPRICORNIO");
         * }
         * else {
         * System.out.println("ERES SAGITARIO");
         * }
         * break;
         * 
         * default:
         * break;
         * }
         */


/*5-Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar
a la medianoche.*/
/* 
Scanner leer = new Scanner(System.in);
    System.out.println("DIME LA HORA");
    int PedirUnaHora = leer.nextInt();
    System.out.println("DIME LOS MINUTOS");
    int PedirUnMinuto= leer.nextInt();
    int hora = PedirUnaHora * 3600;
    int minutos = PedirUnMinuto * 60;
    if (PedirUnaHora <=24 && PedirUnMinuto  <=60) {
        System.out.println("FALTAN " + (hora + minutos) +" SEGUNDOS");
    }
    else{
        System.out.println("ESA HORA NO EXISTE");*/

    

/*6- Escribe un programa que ordene tres números enteros introducidos por teclado. */
    

/* 
    Scanner leer = new Scanner(System.in);
    

    System.out.println("INTRODUCEEL EL PRIMER NUMERO: ");
    int n1 = leer.nextInt();
    System.out.println("INTRODUCEEL EL SEGUNDO NUMERO: ");
    int n2 = leer.nextInt();
    System.out.println("INTRODUCEEL EL TERCER NUMERO: ");
    int n3 = leer.nextInt();

    if (n1 < n2 && n2 < n3) {
            System.out.println(n1 + ","+ n2 +","+ n3 );
        
    }
    else if (n1< n3 && n3 < n2) {
        
            System.out.println(n1 + ","+ n3 +","+ n2 );
    }
    else if (n2 < n1 && n1 < n3) {
        
            System.out.println(n2 + ","+ n1 +","+ n3 );
    }
    else if (n2 < n3 && n3 < n1) {
        
            System.out.println(n2 + ","+ n3 +","+ n1 );
    }
    else if (n3 < n1 && n1 < n2) {
        
            System.out.println(n3 + ","+ n1 +","+ n2 );
    }
    else if (n3 < n2 && n2 < n1) {
        
            System.out.println(n3 + ","+ n2 +","+ n1 );
    }
*/
    
//7-Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

/*Scanner leer = new Scanner(System.in);
System.out.println("INTRODUCE UN NUMERO POSITIVO");
int Numero= leer.nextInt();
int UltimaCifra= Numero%10;
System.out.println("LA ULTIMA CIFRA DEL NUMERO "+ Numero + " ES " + UltimaCifra);*/



/*8- Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten
números de hasta 5 cifras.*/

/* 
Scanner leer = new Scanner(System.in);
System.out.println("INTRODUCE UN NUMERO POSITIVO");
int Numero= leer.nextInt();

int Numero5Cifras= Numero / 10000;
int Numero4Cifras= Numero / 1000;
int Numero3Cifras= Numero / 100;
int Numero2Cifras= Numero / 10;
int Numero1Cifras= Numero;

if (Numero < 0 || Numero >99999) {
        System.out.println("EL NUMERO INTRODUCIDO ES MAYOR DE 5 CIFRAS O ES NEGATIVO");  
}
else if (Numero >= 9999 && Numero <= 99999 ) {
        System.out.println("LA ULTIMA CIFRA DEL NUMERO "+ Numero + " ES " + Numero5Cifras);
}
else if (Numero >= 999 && Numero <= 9999 ) {
        System.out.println("LA ULTIMA CIFRA DEL NUMERO "+ Numero + " ES " + Numero4Cifras );  
}      
else if (Numero >= 99 && Numero <= 999 ) {
        System.out.println("LA ULTIMA CIFRA DEL NUMERO "+ Numero + " ES " + Numero3Cifras);  
}
else if (Numero >= 9 && Numero <= 99 ) {
        System.out.println("LA ULTIMA CIFRA DEL NUMERO "+ Numero + " ES " + Numero2Cifras);  
}
else if (Numero >= 0 && Numero <= 9 ) {
        System.out.println("LA ULTIMA CIFRA DEL NUMERO "+ Numero + " ES " + Numero1Cifras);  
}*/


/*9- Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se
permiten números de hasta 5 dígitos.*/

/*

Scanner leer= new Scanner(System.in);
System.out.println("INTRODUCE UN NUMERO DE HASTA 5 CIFRAS");

int numero= leer.nextInt();

if (numero < -99999 || numero > 99999) {
        System.out.println("EL NUMERO ES MAYOR DE 5 CIFRAS");
        
}
else if (numero >= -9 && numero <= 9) {
        System.out.println("EL NUMERO TIENE 1 CIFRA");
}
else if (numero >= -99 && numero <= 99) {
        System.out.println("EL NUMERO TIENE 2 CIFRA");
}
else if (numero >= -999 && numero <= 999) {
        System.out.println("EL NUMERO TIENE 3 CIFRA");
}
else if (numero >= -9999 && numero <= 9999) {
        System.out.println("EL NUMERO TIENE 4 CIFRA");
}
else if (numero >= -99999 && numero <= 99999) {
        System.out.println("EL NUMERO TIENE 5 CIFRA");
}*/

//10-Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten
//números de hasta 5 cifras.
/* 
Scanner leer = new Scanner(System.in);

System.out.println("INTRODUCE UN NUMERO DE ALMENOS DE 5 CIFRAS ");

int numero = leer.nextInt();
boolean capicua = false;
if (numero < 0 || numero > 99999) {
        System.out.println("EL NUMERO ES MAYOR DE 5 CIFRAS");
}

if (numero < 10) {
        capicua= true;
        System.out.println("CAPICUA ES " + capicua );
        
}
else if (numero <100 && numero > 10 ) {
        if ((numero / 10) == (numero % 10)) {
                capicua = true;
                System.out.println("CAPICUA ES " + capicua);
              }  
}
else if (numero <1000 && numero > 100 ) {
        if ((numero / 100) == (numero % 10)) {
                capicua = true;
                System.out.println("CAPICUA ES " + capicua);
              }  
}
else if (numero <10000 && numero >1000) {

        
        
}*/













    }

}




