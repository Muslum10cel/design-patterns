package io.designpatterns.factorypattern.factory;

import io.designpatterns.factorypattern.enums.ShapeType;
import io.designpatterns.factorypattern.impelementations.Circle;
import io.designpatterns.factorypattern.impelementations.Rectangle;
import io.designpatterns.factorypattern.impelementations.Square;
import io.designpatterns.factorypattern.interfaces.Shape;

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
