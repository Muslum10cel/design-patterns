package io.designpatterns.prototypepattern.implementations;

import io.designpatterns.prototypepattern.abstracts.Shape;

public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
    
}
