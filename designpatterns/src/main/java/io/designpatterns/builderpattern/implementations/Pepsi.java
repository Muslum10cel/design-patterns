package io.designpatterns.builderpattern.implementations;

import io.designpatterns.builderpattern.abstracts.ColdDrink;

public class Pepsi extends ColdDrink{

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
    
}
