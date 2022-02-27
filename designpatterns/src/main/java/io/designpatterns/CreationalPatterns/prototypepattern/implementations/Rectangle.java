package io.designpatterns.CreationalPatterns.prototypepattern.implementations;

import io.designpatterns.CreationalPatterns.prototypepattern.abstracts.Shape;

public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
    
}
