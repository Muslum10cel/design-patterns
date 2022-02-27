package io.designpatterns.StructuralPatterns.adapterpattern.implementations;

import io.designpatterns.StructuralPatterns.adapterpattern.adapter.MediaAdapter;
import io.designpatterns.StructuralPatterns.adapterpattern.enums.AudioType;
import io.designpatterns.StructuralPatterns.adapterpattern.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public String play(AudioType audioType, String fileName) {
       switch(audioType){
           case MP3:
            return "Mp3 Player";
            case MP4:
            case VLC:
                mediaAdapter = new MediaAdapter(audioType);
                return mediaAdapter.play(audioType, fileName);
       }
       return null;
    }
    
}
