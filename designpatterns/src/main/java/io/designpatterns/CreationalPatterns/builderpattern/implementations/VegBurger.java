package io.designpatterns.CreationalPatterns.builderpattern.implementations;

import io.designpatterns.CreationalPatterns.builderpattern.abstracts.Burger;

public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
    
}
