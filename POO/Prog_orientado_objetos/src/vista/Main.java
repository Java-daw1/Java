package vista;

import Excepciones.CamposVaciosException;
import Excepciones.DniException;
import Interfaz.Animales;
import equals.Estudio_equals;
import herencia.Consultor;
import herencia.Empleado;
import herencia.Trabajador;
import modelo.*;

public class Main {
    public static void main(String[] args) {
       // polimorfismo();
       // interfaz();
        equals();

    
    }

    private static void equals() {
       Estudio_equals estudio_equals = new Estudio_equals();
    }

    private static void interfaz() {

    }

    public static void imprimirnombre(Trabajador t) {
        System.out.printf("EL TRABAJADOR %s TIENE UNA PAGA DE %s ", t.getNombre(), t.calcularPaga());
        System.out.println();
    }

    private static void polimorfismo() {
        Trabajador trabajador;
        Trabajador empleado;
        Trabajador consultor;

        trabajador = new Trabajador("cristian", "Director", "Callejon negro", "658570980", "4587349594354");
        empleado = new Empleado("cristian", "becario", "callejon ngro", "345973863", "495834953495", 3000, 2000);

        consultor = new Consultor("cristian", "becario", "callejon ngro", "345973863", "495834953495", 3000, 2000);

        imprimirnombre(trabajador);
        imprimirnombre(consultor);
        imprimirnombre(empleado);
    }

}
