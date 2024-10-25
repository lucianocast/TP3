package modelo;
/**
 * Clase abstracta Cake que define la estructura general de un pastel.
 */
public abstract class Cake {
    /**
     * Método que define el proceso de fabricación de un pastel.
     */
    public final void makeCake() {
        prepararIngredientes();
        hornear();
        decorar();
        empaquetar();
    }
    /**
     * Método abstracto para preparar los ingredientes de un pastel que debe ser implementado por las subclases.
     */
    protected abstract void prepararIngredientes();
    /**
     * Método abstracto para decorar un pastel que debe ser implementado por las subclases.
     */
    protected abstract void decorar();
    /**
     * Método para hornear un pastel.
     */
    private void hornear() {
        System.out.println("Horneando el pastel...");
    }
    /**
     * Método para empaquetar un pastel.
     */
    private void empaquetar() {
        System.out.println("Empaquetando el pastel...");
    }
}
