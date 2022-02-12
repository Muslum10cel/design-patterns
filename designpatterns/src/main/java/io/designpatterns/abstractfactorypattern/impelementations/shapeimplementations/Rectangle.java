package io.designpatterns.abstractfactorypattern.impelementations.shapeimplementations;

import io.designpatterns.abstractfactorypattern.interfaces.Shape;

public class Rectangle implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
}
