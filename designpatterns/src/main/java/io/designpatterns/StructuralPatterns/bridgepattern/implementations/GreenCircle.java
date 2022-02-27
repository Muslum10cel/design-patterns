package io.designpatterns.StructuralPatterns.bridgepattern.implementations;

import io.designpatterns.StructuralPatterns.bridgepattern.interfaces.DrawAPI;

public class GreenCircle implements DrawAPI{

    @Override
    public String drawCircle(int radius, int x, int y) {
        return "Green Circle Draw";
    }
    
}
