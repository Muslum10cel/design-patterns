package io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.main;

import io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.abstracts.AbstractLogger;
import io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.implementations.ConsoleLogger;
import io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.implementations.ErrorLogger;
import io.designpatterns.BehavioralPatterns.chainofresponsibilitypattern.implementations.FileLogger;

public class ChainPatternDemo {
    
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an info message.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level message.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an error level message.");

    }
}
