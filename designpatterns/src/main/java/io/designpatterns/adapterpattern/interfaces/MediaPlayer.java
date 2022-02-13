package io.designpatterns.adapterpattern.interfaces;

import io.designpatterns.adapterpattern.enums.AudioType;

public interface MediaPlayer {
    
    void play(AudioType audioType, String fileName);
}
