package ejercicios;

import java.util.Scanner;

public class Dniejercicio {

    public Dniejercicio() {
        Scanner leer = new Scanner(System.in);
        System.out.println("INTRODUCE TU NUMERO DE DNI");
        int numDni = leer.nextInt();
        int div = 23;
        int resto = numDni % div;

        switch (resto) {
            case 0:
                System.out.println("TU LETRA DEL DNI ES = T");
                break;

            case 1:
                System.out.println("TU LETRA DEL DNI ES = R");
                break;

            case 2:
                System.out.println("TU LETRA DEL DNI ES = W");
                break;

            case 3:
                System.out.println("TU LETRA DEL DNI ES = A");
                break;

            case 4:
                System.out.println("TU LETRA DEL DNI ES = G");
                break;

            case 5:
                System.out.println("TU LETRA DEL DNI ES = M");
                break;

            case 6:
                System.out.println("TU LETRA DEL DNI ES = Y");
                break;

            case 7:
                System.out.println("TU LETRA DEL DNI ES = F");
                break;

            case 8:
                System.out.println("TU LETRA DEL DNI ES = P");
                break;

            case 9:
                System.out.println("TU LETRA DEL DNI ES = D");
                break;

            case 10:
                System.out.println("TU LETRA DEL DNI ES = X");
                break;

            case 11:
                System.out.println("TU LETRA DEL DNI ES = B");
                break;

            case 12:
                System.out.println("TU LETRA DEL DNI ES = N");
                break;

            case 13:
                System.out.println("TU LETRA DEL DNI ES = J");
                break;

            case 14:
                System.out.println("TU LETRA DEL DNI ES = Z");
                break;

            case 15:
                System.out.println("TU LETRA DEL DNI ES = S");
                break;

            case 16:
                System.out.println("TU LETRA DEL DNI ES = Q");
                break;

            case 17:
                System.out.println("TU LETRA DEL DNI ES = V");
                break;

            case 18:
                System.out.println("TU LETRA DEL DNI ES = H");
                break;

            case 19:
                System.out.println("TU LETRA DEL DNI ES = L");
                break;

            case 20:
                System.out.println("TU LETRA DEL DNI ES = C");
                break;

            case 21:
                System.out.println("TU LETRA DEL DNI ES = K");
                break;

            case 22:
                System.out.println("TU LETRA DEL DNI ES = E");
                break;

            default:
                break;

        }
    }

}
