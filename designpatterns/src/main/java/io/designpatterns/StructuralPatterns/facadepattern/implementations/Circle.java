package io.designpatterns.StructuralPatterns.facadepattern.implementations;

import io.designpatterns.StructuralPatterns.facadepattern.interfaces.Shape;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    
}
