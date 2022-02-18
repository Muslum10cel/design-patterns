package io.designpatterns.facadepattern.implementations;

import io.designpatterns.facadepattern.interfaces.Shape;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    
}
