package modelo;
/**
 * Clase que adapta la interfaz de MusicPlayer a la de ThirdPartyAudioPlayer
 */
public class AudioPlayerAdapter implements MusicPlayer {
    /**
     * Atributo que representa un reproductor de audio de terceros
     */
    private ThirdPartyAudioPlayer thirdPartyAudioPlayer;
    /**
     * Constructor de la clase
     * @param thirdPartyAudioPlayer reproductor de audio de terceros
     */
    public AudioPlayerAdapter(ThirdPartyAudioPlayer thirdPartyAudioPlayer) {
        this.thirdPartyAudioPlayer = thirdPartyAudioPlayer;
    }
    /**
     * Metodo que reproduce una cancion
     * @param fileName nombre del archivo
     */
    @Override
    public void playSong(String fileName) {
        thirdPartyAudioPlayer.startAudio(fileName);
    }

}
