package io.designpatterns.adapterpattern.implementations;

import io.designpatterns.adapterpattern.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("VlcPlayer.playVlc()");
    }

    @Override
    public void playMp4(String fileName) {
       throw new UnsupportedOperationException();
    }
    
}
