package io.designpatterns.CreationalPatterns.builderpattern.implementations;

import io.designpatterns.CreationalPatterns.builderpattern.abstracts.Burger;

public class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
    
}
