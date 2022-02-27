package io.designpatterns.CreationalPatterns.abstractfactorypattern.factory;

import io.designpatterns.CreationalPatterns.abstractfactorypattern.abstracts.AbstractFactory;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.enums.ColorType;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.enums.ShapeType;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.impelementations.colorimplementations.Blue;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.impelementations.colorimplementations.Green;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.impelementations.colorimplementations.Red;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.Color;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorType colorType) {
        switch (colorType) {
            case RED:
                return new Red();
            case GREEEN:
                return new Green();
            case BLUE:
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(ShapeType shapeType) {
        return null;
    }
}
