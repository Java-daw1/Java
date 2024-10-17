package ejercicios;

public class Ejercicio01 {

    public Ejercicio01 () {

        

 //ejercicio uno
    
    int mayorEdad= 18;
    boolean edad=(18 <= mayorEdad);

    if (edad){
        System.out.println("es mayor de edad");

    }
    else{
    System.out.println("es menor de edad");
    }


//dime si pueden votar
int edadPedro= 19;
int edadLuis= 10;

if (edadPedro >=18 && edadLuis >=18){
System.out.println("Los dos puede votar");
}

    else if (edadPedro >=18) {
        System.out.println("Pedro puede votar y Luis no");
    
    } 

    else if (edadLuis >=18) {
        System.out.println("Luis puede votar pero Pedro no");
    
    } 
    else {
        System.out.println("ninguno de los dos pueden votar");
    }

    }
    
}

