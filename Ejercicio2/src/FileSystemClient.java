import modelo.*;
/**
 * Clase cliente que prueba el sistema de ficheros.
 */
public class FileSystemClient {
    /**
     * Método principal.
     */
    public static void main(String[] args) {
        /**
         * Creación de archivos.
        */ 
        File archivo1 = new File("archivo1.txt", 500);
        File archivo2 = new File("archivo2.txt", 1500);
        File archivo3 = new File("archivo3.txt", 2500);
        /**
         * Creación de directorios.
         */
        Directory dir1 = new Directory("Documentos");
        Directory dir2 = new Directory("Fotos");
        Directory rootDir = new Directory("Root");
        /**
         * Añadir archivos a los directorios.
         */
        dir1.addComponent(archivo1);
        dir1.addComponent(archivo2);
        dir2.addComponent(archivo3);
        /**
         * Añadir directorios al directorio raíz.
         */
        rootDir.addComponent(dir1);
        rootDir.addComponent(dir2);
        /**
         * Mostrar detalles del directorio raíz.
         */
        rootDir.showDetails(0);
    }
}

