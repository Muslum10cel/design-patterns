package io.designpatterns.BehavioralPatterns.visitorpattern.interfaces;

public interface ComputerPart {
    
    void accept(ComputerPartVisitor computerPartVisitor);
}
