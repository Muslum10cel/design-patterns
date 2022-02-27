package io.designpatterns.CreationalPatterns.abstractfactorypattern.abstracts;

import io.designpatterns.CreationalPatterns.abstractfactorypattern.enums.ColorType;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.enums.ShapeType;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.Color;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.Shape;

public abstract class AbstractFactory {
    
    public abstract Color getColor(ColorType colorType);

    public abstract Shape getShape(ShapeType shapeType);
}
