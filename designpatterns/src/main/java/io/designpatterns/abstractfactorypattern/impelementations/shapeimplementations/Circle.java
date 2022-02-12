package io.designpatterns.abstractfactorypattern.impelementations.shapeimplementations;

import io.designpatterns.abstractfactorypattern.interfaces.Shape;

public class Circle implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
}
