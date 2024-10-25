package modelo;
/**
 * Interfaz que representa un reproductor de musica
 */
public interface MusicPlayer {
    /**
     * Metodo que reproduce una cancion
     * @param fileName nombre del archivo
     */
    void playSong(String fileName);
}
