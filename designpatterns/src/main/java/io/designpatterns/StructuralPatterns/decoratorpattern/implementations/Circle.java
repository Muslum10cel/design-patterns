package io.designpatterns.StructuralPatterns.decoratorpattern.implementations;

import io.designpatterns.StructuralPatterns.decoratorpattern.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

}
