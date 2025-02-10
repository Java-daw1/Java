package modelo;

public class Bicicleta {
    private int numMarchas;
    private int diametroRueda;
    private int velocidad;
    private int id;

    private static int numeroBicicletas = 0;

    public Bicicleta(int marchas, int dRueda, int velocidad) {
        this.numMarchas = marchas;
        this.diametroRueda = dRueda;
        this.velocidad = velocidad;
        this.id = ++numeroBicicletas;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public int getDiametroRueda() {
        return diametroRueda;
    }

    public void setDiametroRueda(int diametroRueda) {
        this.diametroRueda = diametroRueda;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bicicleta [numMarchas=" + numMarchas + ", diametroRueda=" + diametroRueda + ", velocidad=" + velocidad
                + ", id=" + id + "]";
    }

    public static int getNumeroBicicletas() {
        return numeroBicicletas;
    }

}
