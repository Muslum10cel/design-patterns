package io.designpatterns.CreationalPatterns.builderpattern.implementations;

import io.designpatterns.CreationalPatterns.builderpattern.interfaces.Packing;

public class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
    
}
