package modelo;

import java.util.SortedMap;
import java.util.TreeMap;

public class Persona1 implements Comparable<Persona1> {

    //! los atributos de una clase tienen que ser privados
    private String nombre;
    private String apellido ;
    private int edad;
    private int altura;
    private float peso;
    private String dni;
    private SortedMap<String,String> agendatlefono;

    public Persona1(){

    }
    public Persona1(String nombre ,String apellido,String dni){
        //! igualamos valores de atributos a variable
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni=dni;
        this.agendatlefono = new TreeMap<String,String>();

    }
    public void setAgendatlefono(SortedMap<String, String> agendatlefono) {
        this.agendatlefono = agendatlefono;
    }
    public SortedMap<String, String> getAgendatlefono() {
        return agendatlefono;
    }
    public Persona1(String nombre, String apellido, int edad, int altura, float peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public int getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Persona1 [nombre = " + nombre + ", apellido = " + apellido + ", dni = " + dni + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + edad;
        result = prime * result + altura;
        result = prime * result + Float.floatToIntBits(peso);
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona1 other = (Persona1) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (edad != other.edad)
            return false;
        if (altura != other.altura)
            return false;
        if (Float.floatToIntBits(peso) != Float.floatToIntBits(other.peso))
            return false;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }
    @Override
    public int compareTo(Persona1 o) {
        return this.apellido.compareTo(o.apellido);
    }

    



    

    

}
