package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import modelo.Bicicleta;
import modelo.Persona1;

public class Lista {
    public Lista() {

        Persona1 p1 = new Persona1("cristian", "Lopez", "3463689G");
        Persona1 p2 = new Persona1("diego", "Lopez", "3463689K");
        Bicicleta b1 = new Bicicleta(4, 2, 50);

        Collection collection = new ArrayList<>();
        collection.add(p1);
        collection.add(p2);
        collection.add(b1);

        for (Object elem : collection) {
            System.out.println("PERSONA :" + elem);
        }
        System.out.println();



        List<Persona1> lista=null;

        lista = new ArrayList<Persona1>();
        lista.add(p1);
        lista.add(p2);
        //lista.set(0,p2); //! pone el valor en una determinada posiion pero borra lo que halla dentro

        for (Persona1 person : lista) {
            System.out.println(person);
        }
        
        System.out.println("TAMAÑO DE LA LISTA "+ lista.size());
        lista.remove(0);
        System.out.println("TAMAÑO DE LA LISTA "+ lista.size());

        java.util.Iterator<Persona1> iter = lista.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }

        System.out.println(lista.isEmpty());
        System.out.println(lista.indexOf(p2));
        System.out.println(lista.contains(p2));
       
        Collections.sort(lista);
        

    }

}
