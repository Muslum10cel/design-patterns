package io.designpatterns.facadepattern.implementations;

import io.designpatterns.facadepattern.interfaces.Shape;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
    
}
