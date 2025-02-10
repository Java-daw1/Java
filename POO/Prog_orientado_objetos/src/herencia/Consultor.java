package herencia;

public class Consultor extends Trabajador {
    private int horas;
    private double tarifa;

    public Consultor(){

    }

    public Consultor(int horas, double tarifa) {
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public Consultor(String nombre, String puesto, String direccion, String telefono, String numSeguridadSocial,
            int horas, double tarifa) {
        super(nombre, puesto, direccion, telefono, numSeguridadSocial);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public int getHoras() {
        return horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return super.toString() + "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
    }

   
    
    
}
