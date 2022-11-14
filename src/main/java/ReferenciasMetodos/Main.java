package ReferenciasMetodos;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;


/**
 * Para referenciar un metodo estático basta con usar la notacion: NombreClase::NombreMetodo
 * Usando una interfaz compatible (En el siguiente ejemplo BinaryOperator es compatible con suma de Calculadora).
 */
public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> suma = (a, b) -> a + b;
        System.out.println("La suma de 2 y 3 es: " + suma.apply(2, 3));

        BinaryOperator<Integer> sumaDesdeCalc = Calculadora::suma;
        System.out.println("La suma de 2 y 3 es: " + sumaDesdeCalc.apply(2, 3));


        String miString = "Hola mundo!";
        Supplier<String> mayusculear = miString::toUpperCase;

        System.out.println(mayusculear.get());
    }
}
