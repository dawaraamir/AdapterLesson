package adapter;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter  mediaAdapter;

    @Override
    public void play(String audioType, String nameOfSong) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + nameOfSong);
        }else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, nameOfSong);
        }else {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}
