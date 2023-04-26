package org.example.AdapterDesignPattern;

import org.example.AdapterDesignPattern.Adapter.MediaAdapter;
import org.example.AdapterDesignPattern.Target.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("vlc", "file2.vlc");
        audioPlayer.play("mp4", "file3.mp4");
        audioPlayer.play("avi", "file4.avi");
    }
}
