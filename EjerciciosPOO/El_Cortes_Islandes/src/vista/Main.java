package vista;

import CorteIslandes.Tarjeta;
import Excepciones.SaldoInsuficienteException;
import fraccion.Fraccion_00;

public class Main {

    public static void main(String[] args) {

        // EstudioTarjeta();
        Fraccion();
        
    }

    private static void Fraccion() {
        Fraccion_00 fraccion_00 = new Fraccion_00(2,5);
        Fraccion_00 f1 = new Fraccion_00(5, 3);
        fraccion_00.multiplicar(f1);
        System.out.println("============== multiplicar ==============");
        System.out.println(fraccion_00);


        fraccion_00.dividir(f1);
        System.out.println("============== dividir ==============");
        System.out.println(fraccion_00);

        fraccion_00.invertir();
        System.out.println("============== invertir ==============");
        System.out.println(fraccion_00);


       
    }

    private static void EstudioTarjeta() {
        Tarjeta tarjeta1 = new Tarjeta(100);
        Tarjeta tarjeta2 = new Tarjeta(200);
        System.out.println(tarjeta1);
        System.out.println(tarjeta2);

        try {
            tarjeta1.gasta(50);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        Tarjeta tarjeta3 = tarjeta1.fusion(tarjeta2);
        System.out.println(tarjeta3);
    }

}
