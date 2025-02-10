package herencia;

public class Trabajador {
    private String nombre;
    private String puesto;
    private String direccion;
    private String telefono;
    private String numSeguridadSocial;

    private static final double SALARIO_BASE = 3000.0;

    public Trabajador (){

    }

    public Trabajador(String nombre, String puesto, String direccion, String telefono, String numSeguridadSocial) {
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setNumSeguridadSocial(numSeguridadSocial);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public static double getSalarioBase() {
        return SALARIO_BASE;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNumSeguridadSocial(String numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    
    public double calcularPaga(){
        return SALARIO_BASE;
    }

    @Override
    public String toString() {
        return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", direccion=" + direccion + ", telefono="
                + telefono + ", numSeguridadSocial=" + numSeguridadSocial + "]";
    }
    
    


}
