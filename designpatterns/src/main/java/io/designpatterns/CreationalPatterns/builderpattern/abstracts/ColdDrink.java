package io.designpatterns.CreationalPatterns.builderpattern.abstracts;

import io.designpatterns.CreationalPatterns.builderpattern.implementations.Bottle;
import io.designpatterns.CreationalPatterns.builderpattern.interfaces.Item;
import io.designpatterns.CreationalPatterns.builderpattern.interfaces.Packing;

public abstract class ColdDrink implements Item{
    
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
