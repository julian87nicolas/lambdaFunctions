package Lambdas;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        MiValor miValor = () -> 2;
        System.out.println(miValor);
        System.out.println(miValor.obtenerValor());

        OperadorUnario raizCuadrada = n -> Math.sqrt(n);
        System.out.println(raizCuadrada.aplicar(2));

        OperadorUnario triple = n -> 3*n;
        System.out.println(triple.aplicar(5));

        OperadorBinario<Integer> suma = (a, b) -> a + b;
        System.out.println(suma.aplicar(2, 6));

        OperadorTernario raices = (a,b,c) -> {
            double res1 = (-b + raizCuadrada.aplicar(2 * a * b - c) / 2 * a);
            double res2 = (-b - raizCuadrada.aplicar(2 * a * b - c) / 2 * a);
            return String.valueOf(res1 + " - " + res2);
        };

        System.out.println(raices.aplicarDoble(1,2,1));

        OperadorBinario<Double> minimoComunMultiplo = (x, y) -> {
            double mcm;
            if (x > y) mcm = x;
            else mcm = y;

            while(mcm % x!= 0 || mcm % y != 0) {
                mcm ++;
            }
            return mcm;
        };

        System.out.println("Minimo comun multiplo: " + minimoComunMultiplo.aplicar(58.0,37.0));

        OperadorCuaternario sumaDeCuatro = (a, b, c, d ) -> a + b + c + d;
        System.out.println(sumaDeCuatro.aplicar(1,1,1,1));

        OperadorBinario<String> concatenacion = (x, y) -> x.concat(y);

        // Con BinaryOperator
        BinaryOperator<String> concat = (x, y) -> x.concat(y);

        System.out.println(concatenacion.aplicar("Hola", " Mundo!"));
        System.out.println(concat.apply("Hello", " World!"));

        Ejemplo ejemplo = new Ejemplo();
        ejemplo.miMetodo();

    }
}
