package estudioArray;

public class EstudioArrayUnidimensional {

    public EstudioArrayUnidimensional() {


/* 
        System.out.println("Arrays Unidimensionales");
        int[] enteros;
        enteros = new int[5];
        enteros[0] = 10;
        enteros[1] = 7;
        enteros[2] = 0;
        enteros[3] = 4;
        enteros[4] = 5;
        System.out.println("El valor de la posicion 2 es " + enteros[2]); */

        //array 2

        String [] nombres = {"cristian", "vicente", "parrado", "diego", "edu", "pablo", "nacho", "victor","manuel","andres"};

        //array 3

        int[] enteros2 = new int[10];

        int[] notas = { 10, 6, 7, 8, 9, 10, 3, 2, 4, 8 };
        int suspenso = 0;
        int aprobados =0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                suspenso++;
            }
            if (notas[i] > 5) {
                aprobados++;
            }
        }
        System.out.println("Han suspendido " + suspenso + " alumnos");


        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]+ " : " + notas[i]);
            
        }
        System.out.println("HAY "+ suspenso+ " SUSPENSOS");
        System.out.println("HAY "+ aprobados+ " APROBADOS");

        //UNA FUNCION QUE SE LLAME GENERA ALEATROIOS (CANTIDAD LIMITE INFERIOR Y SUPERIOR)
       // TIENE UQE DEVOLVER UNA ARRAY CON NUMEROS DE ESE TAMAÑO (LA CALVE ESQUE NO SE REPITAN LOS NUMEROS)
/* 
        int[] notas2 = notas;
        notas2[0] = 10;
        int numero = 5;
        double media = calculaMedia(notas, numero);
        int[] primitiva = generaPrimitiva();

        System.out.println("La media de la clase es: " + media);*/
    }
 
    private int[] generaPrimitiva() {
        int[] primi = { 12, 45, 3, 8, 23, 7 };
        return primi;
    }

    // los objetos a los metodos se pasan por referencia
    // si le paso una variable primitiva se pasa por valor (se pasa una copia | no
    // se modifica su valor real)
    private double calculaMedia(int[] notasAsignaturas, int numero) {
        double media = 0;
        for (int i = 0; i < notasAsignaturas.length; i++) {
            media += notasAsignaturas[i];
        }
        numero = 10;
        return media / notasAsignaturas.length;

    }

}
