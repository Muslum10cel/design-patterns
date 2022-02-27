package io.designpatterns.StructuralPatterns.facadepattern.maker;

import io.designpatterns.StructuralPatterns.facadepattern.implementations.Circle;
import io.designpatterns.StructuralPatterns.facadepattern.implementations.Rectangle;
import io.designpatterns.StructuralPatterns.facadepattern.implementations.Square;
import io.designpatterns.StructuralPatterns.facadepattern.interfaces.Shape;

public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        this.circle.draw();
    }

    public void drawRectangle() {
        this.rectangle.draw();  
    }

    public void drawSquare() {
        this.square.draw();
    }
}
