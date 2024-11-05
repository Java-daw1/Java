package ejercicios;

import java.util.Scanner;

public class Calculoareas {

    public Calculoareas() {

        
        Scanner leer = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. CARCULAR AREA DE UN CUADRADO");
        System.out.println("2. CARCULAR AREA DE UN TRIANGULO");
        System.out.println("3. CALCULAR AREA DE UN CIRCULOR");
        int reed = leer.nextInt();
        switch (reed) {
            case 1:
                System.out.println("INTRUDUCE EL LADO DEL CUADRADO");
                double lado1 = leer.nextDouble();
                System.out.println("INTRUDUCE EL SEGUNDO LADO DEL CUADRADO");
                double lado2 = leer.nextDouble();
                System.out.println("EL AREA DEL CUADRADO  ES = " + lado1 * lado2);
                break;

            case 2:
                System.out.println("INTRODUCE LA BASE DEL TRIANGULO");
                double base = leer.nextDouble();
                System.out.println("INTRODUCE LA ALTURA");
                double altrura = leer.nextDouble();
                System.out.println("EL AREA DEL TRIGULO ES = " + base * (altrura / 2));
                break;
            case 3:
                System.out.println("INTRODUCE EL RADIO");
                double r = leer.nextDouble();
                double pi = 3.1416;
                System.out.println("EL AREA DEL CIRCULO ES = " + pi * r * r);

                break;
            default:
                break;
                
        }

    }
}
