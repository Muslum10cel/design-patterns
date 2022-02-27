package io.designpatterns.CreationalPatterns.abstractfactorypattern.factoryproducer;

import io.designpatterns.CreationalPatterns.abstractfactorypattern.abstracts.AbstractFactory;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.enums.FactoryType;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.factory.ColorFactory;
import io.designpatterns.CreationalPatterns.abstractfactorypattern.factory.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case COLOR:
                return new ColorFactory();
            case SHAPE:
                return new ShapeFactory();
            default:
                return null;
        }
    }
}
