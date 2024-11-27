package cadenas;

import excepciones.DniException;

public class EjercicioDniCadenas {
    public EjercicioDniCadenas() {

        try {
            compruebaDni("31628379K");
        } catch (DniException e) {

            System.out.println(e.getMessage());
        }

    }

    private void compruebaDni(String dni) throws DniException {
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (dni.length() != 9)
            throw new DniException();
        String numDniC = dni.substring(0, 8);
        char letraDni = dni.charAt(8);
        int num = 0;

        try {

            num = Integer.parseInt(numDniC);

        } catch (Exception e) {

            throw new DniException();
        }

        int resto = num%23;

        if (letrasDni.charAt(resto) != letraDni) {
            throw new DniException();
        }

    }

}
