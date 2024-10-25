package modelo;
/**
 * Clase que representa un archivo en el sistema de ficheros.
 */
public class File extends FileSystemComponent {
    private int tamaño; // Tamaño del archivo en bytes
    /**
     * Constructor de la clase.
     * @param nombre Nombre del archivo.
     * @param tamaño Tamaño del archivo en bytes.
     */
    public File(String nombre, int tamaño) {
        super(nombre, ComponentType.ARCHIVO);
        this.tamaño = tamaño;
    }
    /**
     * Muestra los detalles del archivo.
     * @param nivelIdentacion Nivel de identación del archivo.
     */
    @Override
    public void showDetails(int nivelIdentacion) {
        System.out.println(" ".repeat(nivelIdentacion) + "- Archivo: " + nombre + " (" + tamaño + " bytes)");
    }
}

