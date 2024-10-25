package modelo;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa un directorio en el sistema de ficheros.
 */
public class Directory extends FileSystemComponent {
    /**
     * Lista de componentes que contiene el directorio.
     */
    private List<FileSystemComponent> componentes;
    /**
     * Constructor de la clase.
     * @param nombre Nombre del directorio.
     */
    public Directory(String nombre) {
        super(nombre, ComponentType.DIRECTORIO);
        this.componentes = new ArrayList<>();
    }
    /**
     * Añade un componente al directorio.
     */
    @Override
    public void addComponent(FileSystemComponent componente) {
        componentes.add(componente);
    }
    /**
     * Elimina un componente del directorio.
     */
    @Override
    public void removeComponent(FileSystemComponent componente) {
        componentes.remove(componente);
    }
    /**
     * Muestra los detalles del directorio y sus componentes.
     * @param nivelIdentacion Nivel de identación del directorio.
     */
    @Override
    public void showDetails(int nivelIdentacion) {
        System.out.println(" ".repeat(nivelIdentacion) + "+ Directorio: " + nombre);
        for (FileSystemComponent componente : componentes) {
            componente.showDetails(nivelIdentacion + 2);
        }
    }
}

