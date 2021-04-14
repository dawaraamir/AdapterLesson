package adapter;

public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String nameOfSong) {
        System.out.println("Playing vlc file. Name: " + nameOfSong);
    }

    @Override
    public void playMP4(String nameOfSong) {
        //Dont touch
    }
}
