package io.designpatterns.BehavioralPatterns.statepattern.main;

import io.designpatterns.BehavioralPatterns.statepattern.context.Context;
import io.designpatterns.BehavioralPatterns.statepattern.implementations.StartState;
import io.designpatterns.BehavioralPatterns.statepattern.implementations.StopState;

public class StatePatternDemo {
    
    public static void main(String[] args) {
        
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState());
    }
}
