package Excepciones;

public class CamposVaciosException extends Exception {
    public CamposVaciosException(){
        super("Error : Rellena todos los campos");
    }
}
