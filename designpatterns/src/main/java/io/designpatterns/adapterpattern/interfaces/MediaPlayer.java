package io.designpatterns.adapterpattern.interfaces;

import io.designpatterns.adapterpattern.enums.AudioType;

public interface MediaPlayer {
    
    String play(AudioType audioType, String fileName);
}
