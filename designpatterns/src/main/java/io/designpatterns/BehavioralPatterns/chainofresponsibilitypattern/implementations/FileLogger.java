package io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.implementations;

import io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.abstracts.AbstractLogger;

public class FileLogger extends AbstractLogger{

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger.write()" + message);        
    }
    
}
