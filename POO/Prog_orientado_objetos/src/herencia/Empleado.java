package herencia;

public class Empleado extends Trabajador {
    private double sueldo;
    private double impuesto;

    private final int Pagas =14;

    public Empleado(){
        super();
    }

    public Empleado(double sueldo, double impuesto) {
        this.sueldo = sueldo;
        this.impuesto = impuesto;
    }

    

    public Empleado(String nombre, String puesto, String direccion, String telefono, String numSeguridadSocial) {
        super(nombre, puesto, direccion, telefono, numSeguridadSocial);
    }

    public Empleado(String nombre, String puesto, String direccion, String telefono, String numSeguridadSocial,
            double sueldo, double impuesto) {
        super(nombre, puesto, direccion, telefono, numSeguridadSocial);
        this.sueldo = sueldo;
        this.impuesto = impuesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public int getPagas() {
        return Pagas;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double calcularPaga(){
        return (sueldo-impuesto)/Pagas;
    }

    @Override
    public String toString() {
        return "Empleado [sueldo=" + sueldo + ", impuesto=" + impuesto + ", Pagas=" + Pagas + "]";
    }





    
}
