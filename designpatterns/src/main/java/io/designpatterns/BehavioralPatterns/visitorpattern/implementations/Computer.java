package io.designpatterns.BehavioralPatterns.visitorpattern.implementations;

import java.util.ArrayList;
import java.util.List;

import io.designpatterns.BehavioralPatterns.visitorpattern.interfaces.ComputerPart;
import io.designpatterns.BehavioralPatterns.visitorpattern.interfaces.ComputerPartVisitor;

public class Computer implements ComputerPart{

    private List<ComputerPart> parts = new ArrayList<>();

    public Computer() {
        parts.add(new Mouse());
        parts.add(new KeyBoard());
        parts.add(new Monitor());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        parts.forEach(part -> part.accept(computerPartVisitor));
        computerPartVisitor.visit(this);
    }
    
}
