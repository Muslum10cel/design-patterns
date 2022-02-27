package io.designpatterns.StructuralPatterns.bridgepattern.implementations;

import io.designpatterns.StructuralPatterns.bridgepattern.interfaces.DrawAPI;

public class RedCircle implements DrawAPI{

    @Override
    public String drawCircle(int radius, int x, int y) {
        return "Red Circle Draw";
    }
    
}
