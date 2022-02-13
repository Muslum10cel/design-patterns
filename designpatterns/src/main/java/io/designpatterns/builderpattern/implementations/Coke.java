package io.designpatterns.builderpattern.implementations;

import io.designpatterns.builderpattern.abstracts.ColdDrink;

public class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
    
}
