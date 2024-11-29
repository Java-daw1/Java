package cadenas;

import excepciones.IsbnException;

public class Isbnv2 {
    public Isbnv2() {

        String isbnCadena = "978-84-415-2682-2";

        try {
            compruebaIsbn(isbnCadena); // metodo para comprobar el isbn

            if (compruebaIsbn(isbnCadena) == true) { // imprime si el isbn es correcto

                System.out.println("isbn correcto");
            } else {
                System.out.println("isbn incorrecto");
            }

        } catch (IsbnException e) {

            System.err.println(e.getMessage());
        }

    }

    private boolean compruebaIsbn(String isbnCadena) throws IsbnException {
        boolean correcto = true; // esto se devulve cuado lo compruebe

        isbnCadena = isbnCadena.replace("-", "").trim();
        isbnCadena = isbnCadena.replace(" ", "");

        if (isbnCadena.length() != 13) { // si el isbn es mayor de 13 caracteres es incorrecto y llamamos al a excepcion
            throw new IsbnException();
        }

        // comprobamos si el isbn es correcto si esta mal escrito saltara la excepcion
        try {
            double isbnDouble = Double.parseDouble(isbnCadena);// pasa isbn a dooble
        } catch (Exception e) {

            throw new IsbnException();
        }

        String isbnSinNumControl = isbnCadena.substring(0, 12);
        char dc = isbnCadena.charAt(12);

        boolean impar = true;//la ponemos a true por que 1 es impar
        int suma = 0;

        for (int i = 0; i < isbnSinNumControl.length(); i++) { // recorre la cadena con el valor de i
            int num = Integer.parseInt(Character.toString(isbnSinNumControl.charAt(i))); // convierte el valor de i a entero (Character.toString()convierte un char a una cadena)

            if (impar==true) {
                suma += num;
                impar = false;//cambiamos la variable para alternar entre impar o par 1 es impar asi que 2 sera false a la sigueinte vuelta sera par asi que no entrara aqui.

            } else {
                suma += num * 3;
                impar = true;
            }
        }

        int digitoControl = (suma%10) - 10;

         int digitoControlEntero= Integer.parseInt(Character.toString(dc)); // pasa dc que es una cadena a entero

        if (digitoControl != digitoControl) {// si el carlculo digitoControl es diferente de el que hemos sacado de la cadena lanzamos una excepcion.
            throw new IsbnException();
        }
        return correcto;
    }
}
