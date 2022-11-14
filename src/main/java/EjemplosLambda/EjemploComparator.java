package EjemplosLambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemploComparator {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Guillermo", "Barros Schelotto");
        Persona persona2 = new Persona("Roman", "Riquelme");
        Persona persona3 = new Persona("Rodrigo", "Palacio");
        Persona persona4 = new Persona("Martin", "Palermo");

        List<Persona> lista =Arrays.asList(persona1, persona2, persona3, persona4);

        // note -- Ordenar por nombre
        lista.sort( (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        lista.forEach(System.out::println);

        // note -- Ordenar por apellido
        lista.sort(Comparator.comparing(Persona::getApellido));
        lista.forEach(System.out::println);
    }
}
