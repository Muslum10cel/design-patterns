package io.designpatterns.BehavioralPatterns.visitorpattern.interfaces;

import io.designpatterns.BehavioralPatterns.visitorpattern.implementations.Computer;
import io.designpatterns.BehavioralPatterns.visitorpattern.implementations.KeyBoard;
import io.designpatterns.BehavioralPatterns.visitorpattern.implementations.Monitor;
import io.designpatterns.BehavioralPatterns.visitorpattern.implementations.Mouse;

public interface ComputerPartVisitor {
 
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(KeyBoard keyBoard);
    void visit(Monitor monitor);
}
