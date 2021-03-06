package io.designpatterns.BehavioralPatterns.templatepattern.implementations;

import io.designpatterns.BehavioralPatterns.templatepattern.abstracts.Game;

public class Football extends Game {

    @Override
    public void initialize() {
        System.out.println("Football.initialize()");
    }

    @Override
    public void startPlay() {
        System.out.println("Football.startPlay()");
    }

    @Override
    public void endPlay() {
        System.out.println("Football.endPlay()");
    }

}
