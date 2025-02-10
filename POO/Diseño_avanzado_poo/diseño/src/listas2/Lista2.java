package listas2;


import java.text.Collator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

import modelo.Persona1;

public class Lista2 {
    public Lista2() {
        System.out.println("==========  estudio lista 2  ==========");

        /* la inteface SET se encarga del tratamineto de conuntos */

        Set<Persona1> listaHasSet = new HashSet<Persona1>();
        Persona1 p1 = new Persona1("cristian", "Lopez", "346356689H");
        Persona1 p2 = new Persona1("Alex", "Gonzalez", "346323689F");
        Persona1 p3 = new Persona1("Vicente", "Ramirez", "346362245489");
        Persona1 p4 = new Persona1("diego", "A", "34636854L");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        

        System.out.println(listaHasSet.add(p1));
        System.out.println(listaHasSet.add(p2));
        System.out.println(listaHasSet.add(p3));
        System.out.println(listaHasSet.add(p4));

        System.out.println("==========  list sorted  ==========");
        SortedSet<Persona1> listaSorted = new TreeSet<Persona1>();
        listaSorted.add(p1);
        listaSorted.add(p2);
        listaSorted.add(p3);
        listaSorted.add(p4);
        for (Persona1 person : listaSorted) {
            System.out.println(person);
        }

      System.out.println("==========   map  ==========  ");

      p1.getAgendatlefono().put("Trabajo", "658570980");
      p2.getAgendatlefono().put("Oficina", "789456123");
      p3.getAgendatlefono().put("Movil", "741852963");
      p4.getAgendatlefono().put("Casa", "738192465");

        System.out.println("==========  TELEFONO  ==========");
      System.out.println(p1.getAgendatlefono().get("Trabajo"));

      System.out.println("==========  STACK  ==========");

      Stack<String> binario= new Stack<String>();
      binario.push("1");
      binario.push("1");
      binario.push("0");
      binario.push("1");
      String bin = "";
        java.util.Iterator<String> iter = binario.iterator();
      while (iter.hasNext()) {
            bin += binario.pop();
      }
      System.err.println(bin);
    }

}
