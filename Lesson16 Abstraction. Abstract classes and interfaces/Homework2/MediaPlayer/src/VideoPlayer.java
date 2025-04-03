public class VideoPlayer implements MediaPlayer {
    private String currentVideo;

    public VideoPlayer(String video) {
        this.currentVideo = video;
    }

    @Override
    public void play() {
        System.out.println("▶ Воспроизведение видео: " + currentVideo);
    }

    @Override
    public void stop() {
        System.out.println("■ Видео остановлено\n");
    }
}