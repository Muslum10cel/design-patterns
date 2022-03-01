package io.designpatterns.BehavioralPatterns.observerpattern.implementations;

import io.designpatterns.BehavioralPatterns.observerpattern.observer.Observer;
import io.designpatterns.BehavioralPatterns.observerpattern.subject.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String : " + Integer.toOctalString(subject.getState()));
    }

}
