package io.designpatterns.BehavioralPatterns.observerpattern.observer;

import io.designpatterns.BehavioralPatterns.observerpattern.subject.Subject;

public abstract class Observer {
    
    protected Subject subject;
    public abstract void update();
}
