package modelo;
/**
 * Clase que define un pastel de vainilla.
 */
public class VanillaCake extends Cake {
    /**
     * Método para preparar los ingredientes de un pastel de vainilla.
     */
    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando ingredientes para pastel de vainilla: harina, azúcar, esencia de vainilla...");
    }
    /**
     * Método para decorar un pastel de vainilla.
     */
    @Override
    protected void decorar() {
        System.out.println("Decorando el pastel de vainilla con glaseado de vainilla.");
    }
}
