package io.designpatterns.CreationalPatterns.factorypattern.factory;

import io.designpatterns.CreationalPatterns.factorypattern.enums.ShapeType;
import io.designpatterns.CreationalPatterns.factorypattern.impelementations.Circle;
import io.designpatterns.CreationalPatterns.factorypattern.impelementations.Rectangle;
import io.designpatterns.CreationalPatterns.factorypattern.impelementations.Square;
import io.designpatterns.CreationalPatterns.factorypattern.interfaces.Shape;

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {

        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }

}
