package io.designpatterns.abstractfactorypattern.abstracts;

import io.designpatterns.abstractfactorypattern.enums.ColorType;
import io.designpatterns.abstractfactorypattern.enums.ShapeType;
import io.designpatterns.abstractfactorypattern.interfaces.Color;
import io.designpatterns.abstractfactorypattern.interfaces.Shape;

public abstract class AbstractFactory {
    
    public abstract Color getColor(ColorType colorType);

    public abstract Shape getShape(ShapeType shapeType);
}
