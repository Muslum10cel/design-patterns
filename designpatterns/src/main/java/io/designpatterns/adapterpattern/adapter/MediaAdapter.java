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
                break;
            case MP4:
                advancedMediaPlayer = new Mp4Player();
                break;
            default:
                advancedMediaPlayer = null;
        }
    }

    @Override
    public String play(AudioType audioType, String fileName) {
        switch (audioType) {
            case VLC:
                return advancedMediaPlayer.playVlc(fileName);
            case MP4:
                return advancedMediaPlayer.playMp4(fileName);
            default:
                return "Media Player play";
        }
    }

}
