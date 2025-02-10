package modelo;

import Excepciones.CamposVaciosException;
import Excepciones.DniException;

public class Persona4 {
    public String nombre;
    public String apellido;
    private String dni;

    // ! comprobar dni
    // ! nombre y apllido campos obligatorios exceptops DniExceptios y
    // ! camposvaciosException

    public Persona4(String nombre, String apellido, String dni) throws CamposVaciosException, DniException {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
    }

    public void setNombre(String nombre) throws CamposVaciosException {
        
        if (nombre.length() == 0) {
            throw new CamposVaciosException();
        }
        this.nombre = nombre;
    }

    public void setApellido(String apellido) throws CamposVaciosException {
        
        if (apellido.length() == 0) {
            throw new CamposVaciosException();
        }
        this.apellido = apellido;
    }

    public void setDni(String dni) throws DniException {
        

        // ? ***************** COMPROBAR DNI ******************

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (dni.length() != 9) {
            throw new DniException();
        }

        int dniSinLetra = Integer.parseInt(dni.substring(0, 8));
        char letraDni = dni.charAt(8);

        char supuestaLetra = letras.charAt(dniSinLetra % 23);

        if (letraDni != supuestaLetra) {
            throw new DniException();
        }

        this.dni = dni;

    }

    @Override
    public String toString() {
        return "Persona4 [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
    }

}
