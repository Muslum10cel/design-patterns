package io.designpatterns.StructuralPatterns.facadepattern.implementations;

import io.designpatterns.StructuralPatterns.facadepattern.interfaces.Shape;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
    
}
