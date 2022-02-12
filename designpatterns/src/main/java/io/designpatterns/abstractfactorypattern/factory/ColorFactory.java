package io.designpatterns.abstractfactorypattern.factory;

import io.designpatterns.abstractfactorypattern.abstracts.AbstractFactory;
import io.designpatterns.abstractfactorypattern.enums.ColorType;
import io.designpatterns.abstractfactorypattern.enums.ShapeType;
import io.designpatterns.abstractfactorypattern.impelementations.colorimplementations.Blue;
import io.designpatterns.abstractfactorypattern.impelementations.colorimplementations.Green;
import io.designpatterns.abstractfactorypattern.impelementations.colorimplementations.Red;
import io.designpatterns.abstractfactorypattern.interfaces.Color;
import io.designpatterns.abstractfactorypattern.interfaces.Shape;

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
