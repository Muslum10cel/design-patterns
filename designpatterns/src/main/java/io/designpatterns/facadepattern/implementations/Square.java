package io.designpatterns.facadepattern.implementations;

import io.designpatterns.facadepattern.interfaces.Shape;

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    
}
