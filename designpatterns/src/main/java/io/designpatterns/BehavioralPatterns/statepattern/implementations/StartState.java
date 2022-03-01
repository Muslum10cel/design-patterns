package io.designpatterns.BehavioralPatterns.statepattern.implementations;

import io.designpatterns.BehavioralPatterns.statepattern.context.Context;
import io.designpatterns.BehavioralPatterns.statepattern.interfaces.State;

public class StartState implements State{

    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("Player is in start state.");
    }

    @Override
    public String toString() {
        return "Start State";
    }
    
}
