package io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.implementations;

import io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.abstracts.AbstractLogger;

public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger.write() " + message);
    }
    
}
