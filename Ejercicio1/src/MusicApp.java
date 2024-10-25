import modelo.*;
/**
 * Clase que representa una aplicacion de musica
 */
public class MusicApp {
    /**
     * Atributo que representa un reproductor de musica
     */
    private MusicPlayer musicPlayer;
    /**
     * Constructor de la clase
     * @param musicPlayer reproductor de musica
     */
    public MusicApp(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    /**
     * Metodo que reproduce una cancion
     * @param fileName nombre del archivo
     */
    public void play(String fileName) {
        musicPlayer.playSong(fileName);
    }
    /**
     * Metodo main
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        /**
         * Se crea un reproductor de audio de terceros y se adapta a la interfaz de MusicPlayer
         */
        ThirdPartyAudioPlayer thirdPartyPlayer = new ThirdPartyAudioPlayer();
        /**
         * Se crea un reproductor de musica adaptado
         */
        MusicPlayer adaptedPlayer = new AudioPlayerAdapter(thirdPartyPlayer);
        /**
         * Se crea una aplicacion de musica
         */
        MusicApp app = new MusicApp(adaptedPlayer);
        /**
         * Se reproduce una cancion
         */
        app.play("cancion.mp3");
    }
}
