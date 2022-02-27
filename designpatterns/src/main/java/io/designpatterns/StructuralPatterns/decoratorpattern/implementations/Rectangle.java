package io.designpatterns.StructuralPatterns.decoratorpattern.implementations;

import io.designpatterns.StructuralPatterns.decoratorpattern.interfaces.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }

}
