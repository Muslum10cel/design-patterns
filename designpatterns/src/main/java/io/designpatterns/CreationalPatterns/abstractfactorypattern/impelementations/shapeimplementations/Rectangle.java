package io.designpatterns.CreationalPatterns.abstractfactorypattern.impelementations.shapeimplementations;

import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.Shape;

public class Rectangle implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
}
