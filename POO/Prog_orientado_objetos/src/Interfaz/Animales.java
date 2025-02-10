package Interfaz;

public class Animales {
    private String especies;
    private String habitat;

    public Animales() {

    }

    public Animales(String especies, String habitat) {
        this.especies = especies;
        this.habitat = habitat;
    }

    public String getEspecies() {
        return especies;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setEspecies(String especies) {
        this.especies = especies;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animales [especies=" + especies + ", habitat=" + habitat + "]";
    }

}
