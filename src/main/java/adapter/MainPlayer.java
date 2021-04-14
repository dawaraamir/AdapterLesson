package adapter;

public class MainPlayer {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Back to black");
        audioPlayer.play("mp4", "Back to black");
        audioPlayer.play("wave", "wasted times");
    }
}
