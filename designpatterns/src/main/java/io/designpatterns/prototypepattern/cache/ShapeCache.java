package io.designpatterns.prototypepattern.cache;

import java.util.Hashtable;
import java.util.Map;

import io.designpatterns.prototypepattern.abstracts.Shape;
import io.designpatterns.prototypepattern.implementations.Circle;
import io.designpatterns.prototypepattern.implementations.Rectangle;
import io.designpatterns.prototypepattern.implementations.Square;

public class ShapeCache {

    private static final Map<String, Shape> SHAPE_MAP = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape shape = SHAPE_MAP.get(shapeId);
        return (Shape) shape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        SHAPE_MAP.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        SHAPE_MAP.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        SHAPE_MAP.put(rectangle.getId(), rectangle);
    }
}
