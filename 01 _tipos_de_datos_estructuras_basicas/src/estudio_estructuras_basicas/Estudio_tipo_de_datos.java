package estudio_estructuras_basicas;

import java.util.Scanner;

public class Estudio_tipo_de_datos {


public Estudio_tipo_de_datos () {

//System.out.println("estudio de tipo de datos");
//declaracion de variable
byte tipo_byte=7;

//utilizar la variable
tipo_byte=34;
System.out.println("tipo_byte = " + tipo_byte);

//variale de tipo entero
int x; 
x = 5;
System.out.println("y ahora es " + x); 

//variable de tipo long
long numerololargo = 2768734238634367463l; 

System.out.println(numerololargo);

//variale de tipo caracter
char letra1 = 90; 
System.out.println(letra1);
char c = 'a';
int codAscii = c;
System.out.println("caracter" + c + "asci = "+ codAscii);

//tipo float

float tipo_Float; 
tipo_Float = (float) 23.4; 
System.out.println(tipo_Float);

//tipo double
double tipo_double;
tipo_double = (double) 34.4d;
System.out.println(tipo_double);
//casting+
int dividendo = 7,divisor = 3;
int cociente = dividendo/divisor;

System.out.println("El cociente de la division es : " + cociente);
double cocientee=dividendo/(double)divisor;

System.out.println("El cociente de la division es :" + cocientee);

//boolean
boolean sw=false;
sw=dividendo>divisor;
System.out.println(sw);

//cadenas (no son tipode datos primitivos aun que los tratemos como tal)

String palabras = "no son tipode datos primitivos aun que los tratemos como tal";
String nombres = "pablo";

System.out.println("unas palabras que uso con frecuencia" + palabras);

//pedir datos

Scanner leer = new Scanner(System.in);
String nombre= "";
int edad=0;
System.out.println("ingresa su nombre: ");
nombre=leer.next();

leer=null; //significado de null = rompe el enlace con la memeoria abriaque volver a intanciarlo
leer = new Scanner(System.in);
System.out.println("Ingrese su edad:");
edad=leer.nextInt();
System.out.println("hola "+nombre+" tienes " +edad+" años ");











    }

}


