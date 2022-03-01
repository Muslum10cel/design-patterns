package io.designpatterns.BehavioralPatterns.observerpattern.implementations;

import io.designpatterns.BehavioralPatterns.observerpattern.observer.Observer;
import io.designpatterns.BehavioralPatterns.observerpattern.subject.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String : " + Integer.toBinaryString(subject.getState()));
    }

}
