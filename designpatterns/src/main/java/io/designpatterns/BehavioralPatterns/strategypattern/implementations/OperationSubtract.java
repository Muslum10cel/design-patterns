package io.designpatterns.BehavioralPatterns.strategypattern.implementations;

import io.designpatterns.BehavioralPatterns.strategypattern.interfaces.Strategy;

public class OperationSubtract implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
    
}
