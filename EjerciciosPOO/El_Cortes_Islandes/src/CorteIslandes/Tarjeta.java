package CorteIslandes;

import java.util.Random;

import Excepciones.SaldoInsuficienteException;

public class Tarjeta {

    private double saldo;
    private int contTarjeta;
    private String idTarjeta;

    public Tarjeta() {

    }

    public Tarjeta(double saldo) {
        Random idRandom = new Random();

        this.setSaldo(saldo);
        this.setIdTarjeta((idRandom.nextInt(99999) + 1) + "");

    }

    public void gasta (double gasta) throws SaldoInsuficienteException{
        if (this.getSaldo() >= gasta) {
            this.setSaldo(this.getSaldo()-gasta);
            System.out.println("Te has gastado: " + gasta+" $");
        }else{
            throw new SaldoInsuficienteException();
        }
    }

    public Tarjeta fusion(Tarjeta tarjeta3){
        Tarjeta tarjetaFusionada = new Tarjeta(tarjeta3.getSaldo()+ this.getSaldo());

        return tarjetaFusionada;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getContTarjeta() {
        return contTarjeta;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setContTarjeta(int contTarjeta) {
        this.contTarjeta = contTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {

        this.idTarjeta = idTarjeta;

    }

    @Override
    public String toString() {
        return "Tarjeta [saldo=" + saldo+" $" + ", ID_Tarjeta=" + idTarjeta + "]";
    }

    

}
