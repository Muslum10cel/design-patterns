package io.designpatterns.adapterpatterntest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.designpatterns.StructuralPatterns.adapterpattern.enums.AudioType;
import io.designpatterns.StructuralPatterns.adapterpattern.implementations.AudioPlayer;

public class AdapterPatternTest {
    
    @Test
    public void adapterPatternTest(){
        AudioPlayer audioPlayer = new AudioPlayer();
        String mp4Player = audioPlayer.play(AudioType.MP4, "alone.mp4");
        String vlcPlayer = audioPlayer.play(AudioType.VLC, "far_away.vlc");

        assertTrue(mp4Player.equals("play mp4"));
        assertTrue(vlcPlayer.equals("play Vlc"));
    }
}
