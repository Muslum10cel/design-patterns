package io.designpatterns.adapterpattern.implementations;

import io.designpatterns.adapterpattern.adapter.MediaAdapter;
import io.designpatterns.adapterpattern.enums.AudioType;
import io.designpatterns.adapterpattern.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(AudioType audioType, String fileName) {
       switch(audioType){
           case MP3:
            System.out.println("MP3 file is playing. Name : " + fileName);
            case MP4:
            case VLC:
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
       }
    }
    
}
