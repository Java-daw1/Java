package modelo;

public class Persona1 {

    //! los atributos de una clase tienen que ser privados
    private String nombre;
    private String apellido ;
    private int edad;
    private int altura;
    private float peso;
    private String dni;

    public Persona1(){

    }
    public Persona1(String nombre ,String apellido,String dni){
        //! igualamos valores de atributos a variable
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

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
        return "Persona1 [nombre = " + nombre + ", apellido = " + apellido + ", edad = " + edad + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }


    

    

}
