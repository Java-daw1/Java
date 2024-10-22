package ejercicios;

import java.util.Scanner;

public class DecimalBinario {



    public DecimalBinario(){


    Scanner leer =new Scanner(System.in);

    System.out.println("introduce un año");
    int introduceYear = leer.nextInt();
    

    if ((introduceYear % 4 == 0 && introduceYear % 100 != 0) || (introduceYear % 100 == 0 && introduceYear % 400 == 0)) {
        
       System.out.println("es bisiesto");
        
       }else{
        System.out.println("no es bisiesto");
       }


    









       






































    }
}
