import modelo.*;
/**
 * Clase que representa un cliente de la fábrica de pasteles.
 */
public class CakeFactoryClient {
    /**
     * Método principal que crea pasteles de chocolate y vainilla.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        /**
         * Crear pasteles de chocolate y vainilla.
         */
        Cake pastelDeChocolate = new ChocolateCake();
        Cake pastelDeVainilla = new VanillaCake();

        /**
         * Fabricar pastel de chocolate.
         */
        System.out.println("Fabricando pastel de chocolate:");
        pastelDeChocolate.makeCake();
        /**
         * Fabricar pastel de vainilla.
         */
        System.out.println("\nFabricando pastel de vainilla:");
        pastelDeVainilla.makeCake();
    }
}

