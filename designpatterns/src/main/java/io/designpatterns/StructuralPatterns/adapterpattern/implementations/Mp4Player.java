package io.designpatterns.StructuralPatterns.adapterpattern.implementations;

import io.designpatterns.StructuralPatterns.adapterpattern.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public String playVlc(String fileName) {
      throw new UnsupportedOperationException();
    }

    @Override
    public String playMp4(String fileName) {
        return "play mp4";
    }
    
}
