package modelo;
/**
 * Clase que representa un reproductor de audio de terceros
 */
public class ThirdPartyAudioPlayer {
    /**
     * Metodo que reproduce un audio
     * @param file nombre del archivo
     */
    public void startAudio(String file) {
        System.out.println("Reproduciendo audio desde ThirdPartyAudioPlayer: " + file);
    }
}
