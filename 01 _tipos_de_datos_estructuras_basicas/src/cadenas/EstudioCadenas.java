package cadenas;

import java.nio.channels.Pipe.SourceChannel;

public class EstudioCadenas {
    public EstudioCadenas(){

        System.out.println("estudio de cadenas");
        System.out.println("propiedades de las cadenas");
        String cadena = "bienvenido a la clase de programacion";
        String cad2 = "aaa";

        //devuelve la longitud de la String , incluye espacios en blanco
        int tam = cadena.length();
        System.out.println( "el tamaño de " +cadena+ "= " + tam);
        /* char chatAT (int indice) devuelve el caracter asociado al indice que se le pasa como argumento
          de ls string sobre la que se aplica el metodo. se el indice no existe se lanza una StringIndexOutOfBoundsException
          que hereda de indexOutOBounsException. MUY USADO
         */

         System.out.println("==========================");
         System.out.println("==========charAT============");
         System.out.println("caracter = " + cadena.charAt(0));

        for (int x = 0; x < cadena.length(); x++) {
                System.out.println(cadena.charAt(x) + "-");
        }


        System.out.println("==============================0");
        System.out.println("====Substring==========");
        /* String subtring (int indiceint,int indiceFin): duvuleve una string obtenida a partir del indice inicial
           incluido y del indice final excluido es decir se comporta como un intervalo semibinario
         */

         System.out.println(cadena.substring(0, 10));
         System.out.println(cadena.substring(1));


         /*int indexOF devuelve el indice en el que aparece por primera vez la String del primer
          argumento en la qe se aplica metodo,a partir del indice especificado en el segundo argumento. Recordar que una String esta indexada. Si el indice a partir del quese indica la busqueda 
          no existe o la String no aparece
         */

         System.out.println("======================");
         System.out.println("====indexOF==========");


         System.out.println(cadena.indexOf("clase"));
         System.out.println(cadena.indexOf('o'));
         System.out.println(cadena.indexOf('x'));

         System.out.println("=======================");
        System.out.println("===Equals================");
        String nombre = "Antonio",nombre2 = "Antonio";
        nombre = "antonio";

         /* compareTO permite comparar dos cadenas entre si lexicograficamente retornara 0
           si son iguales , un numero menor que cero si la cadena (cad1) es anterior en orden alfabetico a la que 
           se pasa por argumento , y un numero mayor que cero si la cadena es posterior en orden alfabetico
          */

          System.out.println("===========================");
          System.out.println("===compareto=========");
          nombre = "Ana";
          System.out.println(nombre.compareTo(nombre2));

          //trim devuelve otra cadena donde elimina espacios por delante y por detras de una cadena
          System.out.println("=====================");
          System.out.println("===trim============");
          String cad3 = cadena.trim();
          System.out.println(cad3.length());

          //toUpperCase() devuelve una cadena  en minisculas o mayusculas

          System.out.println("===================");
          System.out.println( "===replace===============");
          System.out.println( cadena.replace(" ", ""));
          System.out.println( cadena.replace("a", "*****"));

          /*cad1.stratswith  retornara true si la cadena comineza por la cadena pasada como
            arguemnto. En caso contrario retornara false tambien tenemos cad1.endsWith
          */

          System.out.println(cadena.startsWith("Bienvenido"));
          System.out.println(cadena.contains("ido"));

          /*cadena.split lo usamos mucho con los ficheros */

          String alumno = "Jesus,Alcocer,1DAW,programacion,bbdd,sistemas";
          String[] rompeCadena=alumno.split(",");



          //char[] devulve un array con los caracteres de la tabla ascii

          String asignatura = "Programacion";
          char[]caracteres=asignatura.toCharArray();











    }

}
