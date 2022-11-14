package genericos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Caja normal
        Caja miCaja = new Caja();
        miCaja.set(58);

        /**
         * Al intentar ejecutar la siguiente instrucción obtejemos un error
         * el cual no se visualiza al momento de compilar, sino al ejecutar
         */
        String miString = (String) miCaja.get();
        System.out.println(miString);



        // Caja generica
        CajaGenerica<Integer> miCajaGen = new CajaGenerica<>();
        miCajaGen.set(58);

        /**
         * Ahora el error si aparece al momento de compilar (En este ide aun antes)
         * lo cual resulta mas util para encontrar el error.
         */
        // Aca
//        String miStringG = (String) miCajaGen.get();

        /**
         * Utilizamos genericos siempre que tengamos objetos que pueden ser reutilizados
         */

        Object miObjeto = new Object();
        Integer miInteger = 22;
        miObjeto = miInteger;
        Number miNumero = miInteger;

        ArrayList<Object> miLista = new ArrayList<>();
        miLista.add(miObjeto);
        miLista.add(miNumero);
        miLista.add(miInteger);
    }

    /**
     * WILDCARD: representa un tipo desconocido.
     * Se indica con un <?>
     * Podemos indicar que la wildcard sea subclase de otra con <? extends otherType>
     */
}
