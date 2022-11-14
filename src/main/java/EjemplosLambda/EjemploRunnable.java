package EjemplosLambda;

/**
 * Es una de las mas usadas: creamos un nuevo hilo pasandole un nuevo runnable
 */
public class EjemploRunnable {
    public static void main(String[] args) {
        // Codigo clasico
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Corriendo . . .");
            }
        });

        thread1.start();

        // Código con expresión Lambda

        Thread thread2 = new Thread( () -> System.out.println("Corriendo desde Lambda . . . "));
        thread2.start();
    }
}
