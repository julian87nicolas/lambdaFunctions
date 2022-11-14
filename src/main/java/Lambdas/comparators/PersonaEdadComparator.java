package Lambdas.comparators;

import java.util.Comparator;

public class PersonaEdadComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        int result = p1.getEdad()>p2.getEdad()? 1:-1;
        return result;
    }
}