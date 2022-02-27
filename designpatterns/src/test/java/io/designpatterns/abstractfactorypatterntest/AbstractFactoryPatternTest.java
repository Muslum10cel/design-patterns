package io.designpatterns.abstractfactorypatterntest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.designpatterns.CreationalPatterns.abstractfactorypattern.abstracts.AbstractFactory;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.enums.*;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.factory.*;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.factoryproducer.FactoryProducer;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.impelementations.colorimplementations.*;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.impelementations.shapeimplementations.*;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.*;

public class AbstractFactoryPatternTest {
    
    @Test
    public void abstractFactoryPatternTest(){
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);

        assertTrue(shapeFactory.getClass() == ShapeFactory.class);

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);

        assertTrue(circle.getClass() == Circle.class);
        assertTrue(rectangle.getClass() == Rectangle.class);
        assertTrue(square.getClass() == Square.class);

        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
        assertTrue(colorFactory.getClass() == ColorFactory.class);

        Color red = colorFactory.getColor(ColorType.RED);
        Color green = colorFactory.getColor(ColorType.GREEEN);
        Color blue = colorFactory.getColor(ColorType.BLUE);

        assertTrue(red.getClass() == Red.class);
        assertTrue(green.getClass() == Green.class);
        assertTrue(blue.getClass() == Blue.class);
    }
}
