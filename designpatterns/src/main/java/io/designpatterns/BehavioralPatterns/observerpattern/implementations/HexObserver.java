package io.designpatterns.BehavioralPatterns.observerpattern.implementations;

import io.designpatterns.BehavioralPatterns.observerpattern.observer.Observer;
import io.designpatterns.BehavioralPatterns.observerpattern.subject.Subject;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String : " + Integer.toHexString(subject.getState()));
    }

}
