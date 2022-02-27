package io.designpatterns.flyweightpatterntest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.designpatterns.StructuralPatterns.flyweightpattern.factory.ShapeFactory;
import io.designpatterns.StructuralPatterns.flyweightpattern.implementations.Circle;

public class FlyWeightPatternTest {
    
    @Test
    public void flyWeightPatternTest(){
        Circle redCircle = (Circle) ShapeFactory.getCircle("RED");
        Circle greenCircle = (Circle) ShapeFactory.getCircle("GREEB");
        Circle blueCircle = (Circle) ShapeFactory.getCircle("BLUE");

        assertTrue(redCircle.isNewlyCreated());
        assertTrue(greenCircle.isNewlyCreated());
        assertTrue(blueCircle.isNewlyCreated());

        Circle redCircleRepeat = (Circle) ShapeFactory.getCircle("RED");
        Circle greenCircleRepeat = (Circle) ShapeFactory.getCircle("GREEB");
        Circle blueCircleRepeat = (Circle) ShapeFactory.getCircle("BLUE");

        assertFalse(redCircleRepeat.isNewlyCreated());
        assertFalse(greenCircleRepeat.isNewlyCreated());
        assertFalse(blueCircleRepeat.isNewlyCreated());
    }
}
