package estudio_estructuras_basicas;

public class Operadores_aritmeticos {

public Operadores_aritmeticos(){

System.out.println("estuduio de operadores aritmeticos");

int suma, c = 0, d = 3, multi;
double suma_double, num1 = 5.5, num2 = 2.3;
suma = c + d;
multi= c * d;
System.out.println("suma =" + suma);
System.out.println("multiplicacion ="+ multi);
suma_double = num1 + num2;
System.out.println("sumadoble="+suma_double);
suma_double = num1 + c;
suma= (int) suma_double;
int divEntera, divid= 7, div =3;
double divreal, div2 =3;
divEntera= divid / div;
System.out.println("divi entera ="+ divEntera);
divreal = divid / (double) div; //division enteros
System.out.println("divid real =" + divreal);
divreal= divid / div2; //entero
System.out.println("divi real 2 ="+ divreal);

//orden de prioridad de las operaciones (error complicado de localizar)
int q = 4;
int u = 7;
System.out.println("esto da = "  + u * q / q);

int resto;
divid= 20;
div= 3;
resto = divid % div; //  %  este operador de se llama mod y da el resto de una division entera

System.out.println(resto);

/*estructuras aritmeticas muy importantes
contadores


ejercicio 1
quiero un programa que me muestre la tabla de multiplicar del numero que queramos

un contador se escribe asi:

    contador de 1 en 1 = c++ 
    contador de 2 en 2 = c + = 2
*/


int cont = 10;
cont = cont + 1;
System.out.println("contador = " + cont );
cont++;
System.out.println("contador = " + cont);

int y = cont++; // primero se asigna el valor de y = 12 y luego se incrementa el valor de cont = 13
System.out.println("contador = " + y);
y = ++cont; // se incrementa el valor de cont = 14 y se guarda en y = 14
System.out.println("contador = " + y);
cont = cont + 2;
cont += 2;
cont *= 4; //contador  x4
cont /= 2; //cotador entre 2

// estructura basica acumuladores  acu = acu + = c

int acu = 3;
acu += cont;
acu *= cont;

//operaciones de  relacion

int z = 5, r = 4;
boolean sw = false, sw1, sw2;
sw = z ==r; //preguntamos sy z es igual que r
System.out.println("sw =" +sw);
sw = z != r; //si z es distinto de r
System.out.println("sw ="  + sw);
sw = z >= r; // si z es mayor o igual
System.out.println("sw =" + sw);
sw = z <= r; // si z es menor o igual
System.out.println("sw =" + sw);
sw = z > r; // si z es mayor
System.out.println("sw =" + sw);
sw = z < r; // si z es menor
System.out.println("sw =" + sw);

//operador ternario

int resultado = (z > r) ? z : r ; // estamos preguntando si z es mayor que r  
System.out.println(resultado);

/*operadores logicos

AND = &&

a  | b  | z
0  | 0  | 0
0  | 1  | 0
1  | 0  | 0
1  | 1  | 1

OR = ||

a  | b  | z
0  | 0  | 0
0  | 1  | 1
1  | 0  | 1
1  | 1  | 1

NOT=

*/
sw1 = false;
sw2 = false;

System.out.println(!sw1);//Devuelve el contador de sw
System.out.println(sw1 || sw2);//devuelve true si uno de los dos es verdadero
System.out.println(sw1 && sw2);// devuelve true cuando los 2 sena verdadero
System.out.println(sw1 ^ sw2); // devulve true si solo  1 de los operadores  es true

boolean a = true;
boolean b = false;

System.out.println((a || (6 > 10 )));
System.out.println(((4 <= 4 || false)&&(!a)));


double mp,ex1,ex2;
mp = 7;
ex1 = 5;
ex2= (mp-0.4*ex1)/0.6;
System.out.println("la nota es = " + ex2);




}

}
