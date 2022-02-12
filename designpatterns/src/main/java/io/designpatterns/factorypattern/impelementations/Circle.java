package io.designpatterns.factorypattern.impelementations;

import io.designpatterns.factorypattern.interfaces.Shape;

public class Circle implements Shape{
    
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
}
