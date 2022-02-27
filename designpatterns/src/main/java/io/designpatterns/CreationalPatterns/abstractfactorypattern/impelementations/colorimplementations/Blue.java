package io.designpatterns.CreationalPatterns.abstractfactorypattern.impelementations.colorimplementations;

import io.designpatterns.CreationalPatterns.abstractfactorypattern.interfaces.Color;

public class Blue implements Color{

    @Override
    public void fill() {
        System.out.println("Blue.fill()");
    }
}
