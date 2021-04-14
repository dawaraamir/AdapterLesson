package adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VLCPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String nameOfSong) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVLC(nameOfSong);
        }else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMP4(nameOfSong);
        }
    }
}
