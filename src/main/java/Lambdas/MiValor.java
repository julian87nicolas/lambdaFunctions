package Lambdas;

/**
 * Interfaz funcional: interfaz que posee solo un metodo.
 * Un ejemplo muy representativo es la interface Runnable.
 *
 * Las expresiones lambdas son expresiones que no estan ligadas
 * a un identificador. Las interfaces funcionales son el objetivo perfecto
 * de las expresiones lambda.
 *
 * La etiqueta @FunctionalInterface evita que a una interfaz funcional
 * se le definan más metodos.
 */

@FunctionalInterface
public interface MiValor {
    double obtenerValor();
}
