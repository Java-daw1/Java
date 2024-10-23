package primeraTandaEJ;

import java.util.Scanner;

public class Ejercicio4 {
    public Ejercicio4() {

        // 4-Escribe un programa que nos diga el horóscopo a partir del día y el mes de
        // nacimiento.

        Scanner leer = new Scanner(System.in);

        System.out.println("CUAL ES TU MES DE NACIMINETO");

        System.out.println("1. ENERO");
        System.out.println("2. FEBRERO");
        System.out.println("3. MARZO");
        System.out.println("4. ABRIL");
        System.out.println("5. MAYO");
        System.out.println("6. JUNIO");
        System.out.println("7. JULIO");
        System.out.println("8. AGOSTO");
        System.out.println("9. SEPTIEMBRE");
        System.out.println("10. OCTUBRE");
        System.out.println("11. NOVIEMBRE");
        System.out.println("12. DICIEMBRE");
        int DimeTuMes = leer.nextInt();

        switch (DimeTuMes) {
            case 1:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto1 = leer.nextInt();
                if (DiaNacimineto1 >= 20) {
                    System.out.println("ERES ACUARIO");
                } else {
                    System.out.println("ERES CAPRICORNIO");
                }

                break;
                
            case 2:

                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto2 = leer.nextInt();
                if (DiaNacimineto2 >= 21) {
                    System.out.println("PISCIS");
                } else {
                    System.out.println("ACUARIO");
                }

                break;

            case 3:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto3 = leer.nextInt();
                if (DiaNacimineto3 >= 21) {
                    System.out.println("ERES ARIES");
                } else {
                    System.out.println("ERES PISCIS");
                }

                break;

            case 4:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto4 = leer.nextInt();
                if (DiaNacimineto4 >= 20) {
                    System.out.println("ERES TAURO");
                } else {
                    System.out.println("ERES ARIES");
                }
                break;

            case 5:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto5 = leer.nextInt();
                if (DiaNacimineto5 >= 21) {
                    System.out.println("ERES GEMINIS");
                } else {
                    System.out.println("ERES TAURO");
                }
                break;

            case 6:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto6 = leer.nextInt();
                if (DiaNacimineto6 >= 21) {
                    System.out.println("ERES CANCER");
                } else {
                    System.out.println("ERES GEMINIS");
                }
                break;

            case 7:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto7 = leer.nextInt();
                if (DiaNacimineto7 >= 23) {
                    System.out.println("ERES LEO");
                } else {
                    System.out.println("ERES CANCER");

                }
                break;

            case 8:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto8 = leer.nextInt();
                if (DiaNacimineto8 >= 23) {
                    System.out.println("ERES VIRGO");
                } else {
                    System.out.println("ERES LEO");
                }
                break;

            case 9:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto9 = leer.nextInt();
                if (DiaNacimineto9 >= 23) {
                    System.out.println("ERES LIBRA");
                } else {
                    System.out.println("ERES VIRGO");
                }
                break;

            case 10:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto10 = leer.nextInt();
                if (DiaNacimineto10 >= 23) {
                    System.out.println("ERES ESCORPIO");
                } else {
                    System.out.println("ERES LIBRA");
                }
                break;

            case 11:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto11 = leer.nextInt();
                if (DiaNacimineto11 >= 22) {
                    System.out.println("ERES SAGITARIO");
                } else {
                    System.out.println("ERES ESCORPIO");
                }
                break;

            case 12:
                System.out.println("DIME TU DIA DE NACIMINETO");
                int DiaNacimineto12 = leer.nextInt();
                if (DiaNacimineto12 >= 22) {
                    System.out.println("ERES CAPRICORNIO");
                } else {
                    System.out.println("ERES SAGITARIO");
                }
                break;

            default:
                break;
        }

    }
}
