public class AudioPlayer implements MediaPlayer {
    private String currentTrack;

    public AudioPlayer(String track) {
        this.currentTrack = track;
    }

    @Override
    public void play() {
        System.out.println("Воспроизведение аудио: " + currentTrack);
    }

    @Override
    public void stop() {
        System.out.println("Аудио остановлено\n");
    }
}