package io.designpatterns.factorypattern.impelementations;

import io.designpatterns.factorypattern.interfaces.Shape;

public class Rectangle implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
}
