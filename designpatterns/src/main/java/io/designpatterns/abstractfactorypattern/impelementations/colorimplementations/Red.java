package io.designpatterns.abstractfactorypattern.impelementations.colorimplementations;

import io.designpatterns.abstractfactorypattern.interfaces.Color;

public class Red implements Color{
    
    @Override
    public void fill() {
        System.out.println("Red.fill()");
    }
}
