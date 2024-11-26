package cadenas;

public class Ejercicio2Cadenas {
    public Ejercicio2Cadenas(){

        //2.- Un programa que me pida una frase y e diga si es palíndroma. Busca frases palíndromas en internet.

        //frase polindroma
        String frase = "Sé verlas al revés."; // tiene del 0 al 14 caracteres
        //modifico la frase
        String modificar = frase;
        modificar= modificar.replace(" ", "");//quita los espacios
        modificar= modificar.replace(",", "");//quita la  comas
        modificar= modificar.replace(".", "");//quita los puntos
        modificar =  modificar.toLowerCase();//pongo la frase en minusculas
        String fraaseModificada = modificar.trim();//frase ya modificada

        String darLaVuelta = " ";
        
        for (int i = fraaseModificada.length() - 1; i >= 0; i--) {
            
            darLaVuelta = darLaVuelta +fraaseModificada.charAt(i);
        }
        String frase1 = fraaseModificada;//frase 1 es la frase principal ya formateada
        String frase2 = darLaVuelta.trim();//frase 2 es la frase dada la vuelta formateado sin espacios delante ni detras
        
        System.out.println(frase1.equals(frase2));//comprueva si la frase es polindroma

    }

}
