package io.designpatterns.CreationalPatterns.abstractfactorypattern.impelementations.shapeimplementations;

import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.Shape;

public class Circle implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
}
