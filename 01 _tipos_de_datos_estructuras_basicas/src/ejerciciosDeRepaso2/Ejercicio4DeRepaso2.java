package ejerciciosDeRepaso2;

public class Ejercicio4DeRepaso2 {

    public Ejercicio4DeRepaso2(){


int a= 7,b = 10;
String primosSexys = "";

        for (int i = a; i <=b; i++) {

            if (esPrimo(i) && esPrimo(i+6)) {
                primosSexys = primosSexys + " ( " +i+ "," + (i + 6) +" ), ";
                
            }
            
        }
        System.out.println(primosSexys);
    }

    public boolean esPrimo(int n){
        boolean esPrimo=true;
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                esPrimo=false;
                break;
            }
        }
        return esPrimo;
    }




}
