package io.designpatterns.abstractfactorypattern.impelementations.shapeimplementations;

import io.designpatterns.abstractfactorypattern.interfaces.Shape;

public class Square implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}
