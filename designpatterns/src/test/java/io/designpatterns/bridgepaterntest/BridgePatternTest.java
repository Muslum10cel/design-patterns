package io.designpatterns.bridgepaterntest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.designpatterns.StructuralPatterns.bridgepattern.abstracts.Shape;
import io.designpatterns.StructuralPatterns.bridgepattern.implementations.Circle;
import io.designpatterns.StructuralPatterns.bridgepattern.implementations.GreenCircle;
import io.designpatterns.StructuralPatterns.bridgepattern.implementations.RedCircle;

public class BridgePatternTest {
    
    @Test
    public void bridgePatternTest(){
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        assertTrue("Red Circle Draw".equals(redCircle.draw()));
        assertTrue("Green Circle Draw".equals(greenCircle.draw()));
    }
}
