package equals;

import modelo.Persona1;

public class Estudio_equals {
    public Estudio_equals() {
        try {
            Persona1 p1 = new Persona1("Cristian", "Lopez", "49852630S");
            Persona1 p2 = new Persona1("Cristian", "Lopez", "49852630S");

            System.out.println(p1.equals(p2));
            System.out.println(p1.hashCode());
            System.out.println(p2.hashCode());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
