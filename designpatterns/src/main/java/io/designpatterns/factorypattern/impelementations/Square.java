package io.designpatterns.factorypattern.impelementations;

import io.designpatterns.factorypattern.interfaces.Shape;

public class Square implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}
