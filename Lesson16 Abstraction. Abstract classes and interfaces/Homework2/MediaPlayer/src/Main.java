public class Main {
    public static void main(String[] args) {
        // Создаем плееры
        MediaPlayer music = new AudioPlayer("Queen - Bohemian Rhapsody");
        MediaPlayer movie = new VideoPlayer("The Matrix (1999)");

        // Управляем аудио
        music.play();
        music.stop();

        // Управляем видео
        movie.play();
        movie.stop();
    }
}