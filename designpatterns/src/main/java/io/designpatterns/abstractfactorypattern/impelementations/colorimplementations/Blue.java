package io.designpatterns.abstractfactorypattern.impelementations.colorimplementations;

import io.designpatterns.abstractfactorypattern.interfaces.Color;

public class Blue implements Color{

    @Override
    public void fill() {
        System.out.println("Blue.fill()");
    }
}
