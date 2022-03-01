package io.designpatterns.BehavioralPatterns.observerpattern.subject;

import java.util.ArrayList;
import java.util.List;

import io.designpatterns.BehavioralPatterns.observerpattern.observer.Observer;

public class Subject {
    
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserves();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObserves() {
        observers.forEach(Observer::update);
    }
}
