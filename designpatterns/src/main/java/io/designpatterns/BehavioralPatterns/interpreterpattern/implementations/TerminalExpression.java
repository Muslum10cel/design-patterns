package io.designpatterns.BehavioralPatterns.interpreterpattern.implementations;

import io.designpatterns.BehavioralPatterns.interpreterpattern.interfaces.Expression;

public class TerminalExpression implements Expression{

    private String data;
    
    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
    
}
