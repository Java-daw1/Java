package fraccion;
public class Fraccion_00 {
    private double numerador; //arriba
    private double denominador; //abajo

    public Fraccion_00 (){

    }

    public Fraccion_00(double numerador, double denominador) {
        this.setDenominador(denominador);
        this.setNumerador(numerador);
    }

    

    public void multiplicar (Fraccion_00 f2){
        this.setNumerador(this.getNumerador()*f2.getNumerador());
        this.setDenominador(this.getDenominador()*f2.getDenominador());
        
    }

    public void dividir (Fraccion_00 f2){
        this.setNumerador(this.getNumerador()*f2.getDenominador());
        this.setDenominador(this.getDenominador()*f2.getNumerador());
    }

    public void invertir (){
        double numerador1 = this.getDenominador();
        double denominador1 = this.getNumerador();

        this.setNumerador(numerador1);
        this.setDenominador(denominador1);

        
    }

    public double getNumerador() {
        return numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Fraccion_00 [numerador=" + numerador + ", denominador=" + denominador + "]";
    }

    

}
