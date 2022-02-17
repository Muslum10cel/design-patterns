package io.designpatterns.decoratorpattern.decorator;

import io.designpatterns.decoratorpattern.interfaces.Shape;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder(decoratedShape);
    }

    private void setBorder(Shape decoratedShape){
        System.out.println("RedShapeDecorator.setBorder()");
    }
    
}
