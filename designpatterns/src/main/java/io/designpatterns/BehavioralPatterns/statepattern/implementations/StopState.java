package io.designpatterns.BehavioralPatterns.statepattern.implementations;

import io.designpatterns.BehavioralPatterns.statepattern.context.Context;
import io.designpatterns.BehavioralPatterns.statepattern.interfaces.State;

public class StopState implements State{

    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("Player is in stop state.");
    }

    @Override
    public String toString() {
        return "Stop State";
    }
    
}
