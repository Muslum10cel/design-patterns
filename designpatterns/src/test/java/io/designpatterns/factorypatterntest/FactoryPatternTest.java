package io.designpatterns.factorypatterntest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.designpatterns.CreationalPatterns.factorypattern.enums.ShapeType;
import io.designpatterns.CreationalPatterns.factorypattern.factory.ShapeFactory;
import io.designpatterns.CreationalPatterns.factorypattern.impelementations.Circle;
import io.designpatterns.CreationalPatterns.factorypattern.impelementations.Rectangle;
import io.designpatterns.CreationalPatterns.factorypattern.impelementations.Square;
import io.designpatterns.CreationalPatterns.factorypattern.interfaces.Shape;

public class FactoryPatternTest {
    
    @Test
    public void factoryPatternTest(){

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);

        assertTrue(circle.getClass() == Circle.class);
        assertTrue(rectangle.getClass() == Rectangle.class);
        assertTrue(square.getClass() == Square.class);
    }
}
