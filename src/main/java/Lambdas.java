import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Las interfaces funcionales más importantes contenidas en java.util.functional son:
 *
 *      - Supplier: esta función se debe utilizar cuando se necesiten generar objetos sin requerir argumentos.
 *      Por ejemplo para realizar una inicialización perezosa.
 *      - Consumer esta en cambio es el opuesto de Supplier ya que consume, acepta como argumento el tipo T sin devolver ningún valor de retorno.
 *      - Function<T,R> esta interfaz permite definir una función que acepta un parámetro de tipo T y devuelve un resultado del tipo R pudiendo
 *      aplicarle alguna transformación u operación.
 *      - BiFunction<T,R,S> esta interfaz permite definir una función que acepta dos parámetros de tipo T y R,
 *      devolviendo un resultado del tipo S. Normalmente serán operaciones de agregación u operadores binarios como la suma, resta, etc..
 *      - Predicate la interfaz predicado debe devolver forzosamente un boolean dado un objeto de tipo T,
 *      normalmente utilizado para filtrar elementos de una colección.
 *
 *      El paquete incluye más interfaces que el programador puede usar, pero estas son las más básicas con las que ya es
 *      posible empezar a realizar algunos ejemplos útiles y frecuentes.
 */
public class Lambdas {
    public static void main(String[] args) {
        System.out.println("LONGITUD DE \"PALABRA\": " + sizeOf.apply("PALABRA"));
        System.out.println("CUADRADO DE LONGITUD DE PALABRA: " + square.apply(sizeOf.apply("PALABRA")));
        System.out.println("SUMA DE 5 y 7: " + sumaInteger.apply(5,7));
    }

    static Function<String, Integer> sizeOf = s -> s.length();
    static Function <Integer, Integer> square = n -> n * n;
    static BiFunction <Integer, Integer, Integer> sumaInteger = (a,b) -> a + b;



}
