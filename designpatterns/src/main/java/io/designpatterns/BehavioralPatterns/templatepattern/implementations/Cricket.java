package io.designpatterns.BehavioralPatterns.templatepattern.implementations;

import io.designpatterns.BehavioralPatterns.templatepattern.abstracts.Game;

public class Cricket extends Game {

    @Override
    public void initialize() {
        System.out.println("Cricket.initialize()");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket.startPlay()");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket.endPlay()");
    }

}
