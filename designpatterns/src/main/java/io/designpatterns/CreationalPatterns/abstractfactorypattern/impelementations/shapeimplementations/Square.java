package io.designpatterns.CreationalPatterns.abstractfactorypattern.impelementations.shapeimplementations;

import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.Shape;

public class Square implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}
