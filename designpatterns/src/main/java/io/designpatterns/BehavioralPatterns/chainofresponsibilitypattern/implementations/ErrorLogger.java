package io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.implementations;

import io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.abstracts.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger.write() " + message);
    }

}
