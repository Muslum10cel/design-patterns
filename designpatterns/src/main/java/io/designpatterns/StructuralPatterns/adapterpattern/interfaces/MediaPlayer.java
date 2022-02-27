package io.designpatterns.StructuralPatterns.adapterpattern.interfaces;

import io.designpatterns.StructuralPatterns.adapterpattern.enums.AudioType;

public interface MediaPlayer {
    
    String play(AudioType audioType, String fileName);
}
