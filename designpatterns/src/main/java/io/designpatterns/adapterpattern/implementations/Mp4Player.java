package io.designpatterns.adapterpattern.implementations;

import io.designpatterns.adapterpattern.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
      throw new UnsupportedOperationException();
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4Player.playMp4()");
    }
    
}
