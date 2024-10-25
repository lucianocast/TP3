package modelo;
/**
 * Clase abstracta que representa un componente del sistema de ficheros.
 */
public abstract class FileSystemComponent {
    /**
     * Nombre del componente.
     */
    protected String nombre;
    /**
     * Tipo del componente.
     */
    protected ComponentType tipo;
    /**
     * Constructor de la clase.
     * @param nombre Nombre del componente.
     * @param tipo Tipo del componente.
     */
    public FileSystemComponent(String nombre, ComponentType tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    /**
     * Devuelve el nombre del componente.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Devuelve el tipo del componente.
     */
    public ComponentType getTipo() {
        return tipo;
    }
    /**
     * Muestra los detalles del componente.
     * @param nivelIdentacion Nivel de identación del componente.
     */
    public abstract void showDetails(int nivelIdentacion);
    /**
     * Añade un componente al directorio.
     * @param componente Componente a añadir.
     */
    public void addComponent(FileSystemComponent componente) {
        throw new UnsupportedOperationException("Operación no soportada en archivos.");
    }
    /**
     * Elimina un componente del directorio.
     * @param componente Componente a eliminar.
     */
    public void removeComponent(FileSystemComponent componente) {
        throw new UnsupportedOperationException("Operación no soportada en archivos.");
    }
}
