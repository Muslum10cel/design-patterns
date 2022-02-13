package io.designpatterns.builderpattern.implementations;

import io.designpatterns.builderpattern.interfaces.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
    
}
