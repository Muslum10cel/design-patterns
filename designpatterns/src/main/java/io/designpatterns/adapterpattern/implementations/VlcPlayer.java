package io.designpatterns.adapterpattern.implementations;

import io.designpatterns.adapterpattern.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public String playVlc(String fileName) {
        return "play Vlc";
    }

    @Override
    public String playMp4(String fileName) {
        throw new UnsupportedOperationException();
    }

}
