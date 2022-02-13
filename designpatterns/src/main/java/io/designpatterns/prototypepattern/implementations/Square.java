package io.designpatterns.prototypepattern.implementations;

import io.designpatterns.prototypepattern.abstracts.Shape;

public class Square extends Shape{

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
       System.out.println("Square.draw()");
    }
    
}
