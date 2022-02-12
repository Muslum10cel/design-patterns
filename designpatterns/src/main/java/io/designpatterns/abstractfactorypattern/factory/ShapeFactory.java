package io.designpatterns.abstractfactorypattern.factory;

import io.designpatterns.abstractfactorypattern.abstracts.AbstractFactory;
import io.designpatterns.abstractfactorypattern.enums.ColorType;
import io.designpatterns.abstractfactorypattern.enums.ShapeType;
import io.designpatterns.abstractfactorypattern.impelementations.shapeimplementations.*;
import io.designpatterns.abstractfactorypattern.interfaces.Color;
import io.designpatterns.abstractfactorypattern.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorType colorType) {
        return null;
    }

    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
