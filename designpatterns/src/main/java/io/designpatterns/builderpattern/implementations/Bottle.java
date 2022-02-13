package io.designpatterns.builderpattern.implementations;

import io.designpatterns.builderpattern.interfaces.Packing;

public class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
    
}
