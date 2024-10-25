package modelo;
/**
 * Clase que define un pastel de chocolate.
 */
public class ChocolateCake extends Cake {
    /**
     * Método para preparar los ingredientes de un pastel de chocolate.
     */
    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando ingredientes para pastel de chocolate: cacao, harina, azúcar...");
    }
    /**
     * Método para decorar un pastel de chocolate.
     */
    @Override
    protected void decorar() {
        System.out.println("Decorando el pastel de chocolate con virutas de chocolate.");
    }
}

