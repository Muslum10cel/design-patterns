package io.designpatterns.builderpattern.abstracts;

import io.designpatterns.builderpattern.implementations.Wrapper;
import io.designpatterns.builderpattern.interfaces.Item;
import io.designpatterns.builderpattern.interfaces.Packing;

public abstract class Burger implements Item{
    
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
