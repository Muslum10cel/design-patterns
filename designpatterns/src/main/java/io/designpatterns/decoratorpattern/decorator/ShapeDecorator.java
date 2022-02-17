package io.designpatterns.decoratorpattern.decorator;

import io.designpatterns.decoratorpattern.interfaces.Shape;

public abstract class ShapeDecorator implements Shape{
    
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        this.decoratedShape.draw();
    }

}
