package io.designpatterns.BehavioralPatterns.visitorpattern.implementations;

import io.designpatterns.BehavioralPatterns.visitorpattern.interfaces.ComputerPartVisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("ComputerPartDisplayVisitor.visit() computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("ComputerPartDisplayVisitor.visit() mouse");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("ComputerPartDisplayVisitor.visit() keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("ComputerPartDisplayVisitor.visit() monitor");
    }
}