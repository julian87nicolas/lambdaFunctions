package EjemplosLambda;

import java.util.AbstractList;
import java.util.ArrayList;

public class EjemploColecciones {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Lunes");
        arrayList.add("Martes");
        arrayList.add("Miercoles");
        arrayList.add("Jueves");
        arrayList.add("Viernes");
        arrayList.add("Sabado");
        arrayList.add("Domingo");

        arrayList.forEach( (s) -> System.out.println(s));
    }
}
