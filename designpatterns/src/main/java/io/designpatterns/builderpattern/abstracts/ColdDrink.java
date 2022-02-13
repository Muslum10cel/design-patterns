package io.designpatterns.builderpattern.abstracts;

import io.designpatterns.builderpattern.implementations.Bottle;
import io.designpatterns.builderpattern.interfaces.Item;
import io.designpatterns.builderpattern.interfaces.Packing;

public abstract class ColdDrink implements Item{
    
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
