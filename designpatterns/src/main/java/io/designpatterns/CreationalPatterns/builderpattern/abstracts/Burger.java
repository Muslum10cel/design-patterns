package io.designpatterns.CreationalPatterns.builderpattern.abstracts;

import io.designpatterns.CreationalPatterns.builderpattern.implementations.Wrapper;
import io.designpatterns.CreationalPatterns.builderpattern.interfaces.Item;
import io.designpatterns.CreationalPatterns.builderpattern.interfaces.Packing;

public abstract class Burger implements Item{
    
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
