package io.designpatterns.CreationalPatterns.abstractfactorypattern.factory;

import io.designpatterns.CreationalPatterns.abstractfactorypattern.abstracts.AbstractFactory;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.enums.ColorType;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.enums.ShapeType;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.impelementations.shapeimplementations.*;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.Color;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.Shape;

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
