package adapter;

public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String nameOfSong) {
        //Dont touch
    }

    @Override
    public void playMP4(String nameOfSong) {
        System.out.println("Playing mp4 file. Name: " + nameOfSong);
    }
}
