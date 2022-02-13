package io.designpatterns.adapterpattern.adapter;

import io.designpatterns.adapterpattern.enums.AudioType;
import io.designpatterns.adapterpattern.implementations.Mp4Player;
import io.designpatterns.adapterpattern.implementations.VlcPlayer;
import io.designpatterns.adapterpattern.interfaces.AdvancedMediaPlayer;
import io.designpatterns.adapterpattern.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AudioType audioType) {
        switch (audioType) {
            case VLC:
                advancedMediaPlayer = new VlcPlayer();
            case MP4:
                advancedMediaPlayer = new Mp4Player();
            default:
                advancedMediaPlayer = null;
        }
    }

    @Override
    public void play(AudioType audioType, String fileName) {
        switch (audioType) {
            case VLC:
                advancedMediaPlayer.playVlc(fileName);
            case MP4:
                advancedMediaPlayer.playMp4(fileName);
            default:
                System.out.println("MediaAdapter.play()");
        }
    }

}
