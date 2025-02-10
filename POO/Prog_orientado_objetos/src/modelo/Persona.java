package modelo;

public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    public int altura;
    public float peso;
    private String dni;
    // ! comprobar dni
    // ! nombre y apllido campos obligatorios exceptops DniExceptios y
    // ! camposvaciosException

    

    // ! sin constructor

    public void caminar() {
        System.out.println("Estoy caminado");
    }

    public void nacer() {
        System.out.println("Estoy naciendo");
    }

    public void morir() {
        System.out.println("Me estoy muriendo");
    }

}
