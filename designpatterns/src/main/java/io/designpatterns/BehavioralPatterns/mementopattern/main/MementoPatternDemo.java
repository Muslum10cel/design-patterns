package io.designpatterns.BehavioralPatterns.mementopattern.main;

import io.designpatterns.BehavioralPatterns.mementopattern.memento.CareTaker;
import io.designpatterns.BehavioralPatterns.mementopattern.memento.Originator;

public class MementoPatternDemo {
    
    public static void main(String[] args) {
        
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");

        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");

        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");

        System.out.println("Current State : " + originator.getState());

        int mementoSize = careTaker.getMementoSize();

        for(int i = 0 ; i < mementoSize ; i++){
            originator.getStateFromMemento(careTaker.getMemento(i));
            System.out.println((i + 1) +". State : " + originator.getState());
        }

    }
}
