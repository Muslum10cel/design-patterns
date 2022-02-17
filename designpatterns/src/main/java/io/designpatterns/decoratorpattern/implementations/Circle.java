package io.designpatterns.decoratorpattern.implementations;

import io.designpatterns.decoratorpattern.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

}
