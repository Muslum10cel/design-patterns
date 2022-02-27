package io.designpatterns.CreationalPatterns.builderpattern.implementations;

import io.designpatterns.CreationalPatterns.builderpattern.interfaces.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
    
}
