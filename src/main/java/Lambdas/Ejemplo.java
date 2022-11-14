package Lambdas;

import java.util.function.UnaryOperator;


/**
 * La variables locales no pueden ser
 * modificadas dentro de una expresion lambda
 * ya que generaria concurrencia.
 */
public class Ejemplo {
    private double miDouble = 5.0;
    private String miString = "Hola";

    public void miMetodo() {
        double miDoubleLocal = 7.0;
        String miStringLocal = "Buenos días";

//        --- Ningun problema ---
//        UnaryOperator<Double> operacion1 = n -> {
//            miDouble++;
//            return miDouble + n ;
//        };

//        --- Error: Concurrencia ---
//        UnaryOperator<Double> operacion2 = n -> {
//            miDoubleLocal++;
//            return miDoubleLocal + n ;
//        };

        UnaryOperator<Double> operacion1 = n -> {
            String miString = "lambda String";
            System.out.println("Dentro de lambda this.miString es: " + this.miString);
            System.out.println("Dentro de lambda miString es: " + miString);
            miDouble++;
            return miDouble + n ;
        };

        UnaryOperator<String> operacion3 = n -> miString + n;
        UnaryOperator<String> operacion4 = n -> miStringLocal + n;

        System.out.println(operacion1.apply(3.0));

    }
}
