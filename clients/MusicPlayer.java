package clients;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.nio.file.Paths;



public class MusicPlayer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        music();
    }

    private static MediaPlayer mediaPlayer;
    public static void music() //command to start playing audio
    {
        String s = "Tokyo Music Walker - Way Home.mp3";
        Media media = new Media (Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
    }

    public static void sound()
    {
        String s = "cha ching sound effect download.mp3";
        Media media = new Media (Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
}