package io.designpatterns.CreationalPatterns.factorypattern.impelementations;

import io.designpatterns.CreationalPatterns.factorypattern.interfaces.Shape;

public class Square implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}
