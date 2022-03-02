package io.designpatterns.BehavioralPatterns.visitorpattern.main;

import io.designpatterns.BehavioralPatterns.visitorpattern.implementations.Computer;
import io.designpatterns.BehavioralPatterns.visitorpattern.implementations.ComputerPartDisplayVisitor;
import io.designpatterns.BehavioralPatterns.visitorpattern.interfaces.ComputerPart;

public class VisitorPatternDemo {
    
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
