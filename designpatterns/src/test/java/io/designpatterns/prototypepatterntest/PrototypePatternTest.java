package io.designpatterns.prototypepatterntest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.designpatterns.CreationalPatterns.prototypepattern.abstracts.Shape;
import io.designpatterns.CreationalPatterns.prototypepattern.cache.ShapeCache;
import io.designpatterns.CreationalPatterns.prototypepattern.implementations.Circle;
import io.designpatterns.CreationalPatterns.prototypepattern.implementations.Rectangle;
import io.designpatterns.CreationalPatterns.prototypepattern.implementations.Square;

public class PrototypePatternTest {
    
    @Test
    public void prototypePatternTest(){
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("1");
        assertTrue(circle.getClass() == Circle.class);

        Shape square = ShapeCache.getShape("2");
        assertTrue(square.getClass() == Square.class);

        Shape rectangle = ShapeCache.getShape("3");
        assertTrue(rectangle.getClass() == Rectangle.class);
    }
}
