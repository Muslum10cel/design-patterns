package io.designpatterns.abstractfactorypattern.factoryproducer;

import io.designpatterns.abstractfactorypattern.abstracts.AbstractFactory;
import io.designpatterns.abstractfactorypattern.enums.FactoryType;
import io.designpatterns.abstractfactorypattern.factory.ColorFactory;
import io.designpatterns.abstractfactorypattern.factory.ShapeFactory;

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
