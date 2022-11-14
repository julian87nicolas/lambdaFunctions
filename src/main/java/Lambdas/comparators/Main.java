package Lambdas.comparators;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona personaA = new Persona("pedro", "perez", 20);
        Persona personaB = new Persona("ana", "blanco", 15);
        Persona personaC = new Persona("miguel", "alvarez", 50);
        Persona personaD = new Persona("pedrerol", "perez", 22);
        Persona personaE = new Persona("anastasia", "blanco", 1);
        Persona personaF = new Persona("miguelon", "alvarez", 56);
        List< Persona > lista = Arrays.asList(personaA, personaB, personaC, personaD, personaE, personaF);

        // Clase Comparator normal
//        lista.sort(new PersonaEdadComparator());

        // Inner Class JAVA 7
//        lista.sort(new Comparator<Persona>() {
//            @Override
//            public int compare(Persona p1, Persona p2) {
//                return  p1.getEdad() - p2.getEdad();
//            }
//        });

        // Funciones Lambda JAVA 8 en adelante
//        lista.sort( (p1,p2) ->  p1.getEdad() - p1.getEdad() );

//        for (Persona p: lista) {
//            System.out.println(p.getNombre() + " ," + p.getEdad());
//        }
    }
}
