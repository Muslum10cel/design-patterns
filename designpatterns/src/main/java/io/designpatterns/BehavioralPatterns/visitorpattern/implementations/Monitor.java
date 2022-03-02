package io.designpatterns.BehavioralPatterns.visitorpattern.implementations;

import io.designpatterns.BehavioralPatterns.visitorpattern.interfaces.ComputerPart;
import io.designpatterns.BehavioralPatterns.visitorpattern.interfaces.ComputerPartVisitor;

public class Monitor implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
    
}
