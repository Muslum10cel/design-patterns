package io.designpatterns.BehavioralPatterns.observerpattern.main;

import io.designpatterns.BehavioralPatterns.observerpattern.implementations.BinaryObserver;
import io.designpatterns.BehavioralPatterns.observerpattern.implementations.HexObserver;
import io.designpatterns.BehavioralPatterns.observerpattern.implementations.OctalObserver;
import io.designpatterns.BehavioralPatterns.observerpattern.subject.Subject;

public class ObserverPatternDemo {
    
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("Fist State Change : 15");
        subject.setState(15);
        System.out.println("Fist State Change : 10");
        subject.setState(10);
    }
}
