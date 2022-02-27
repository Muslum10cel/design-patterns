package io.designpatterns.CreationalPatterns.prototypepattern.implementations;

import io.designpatterns.CreationalPatterns.prototypepattern.abstracts.Shape;

public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
       System.out.println("Circle.draw()"); 
    }
    
}
