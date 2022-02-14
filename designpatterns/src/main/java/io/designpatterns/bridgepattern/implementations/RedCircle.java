package io.designpatterns.bridgepattern.implementations;

import io.designpatterns.bridgepattern.interfaces.DrawAPI;

public class RedCircle implements DrawAPI{

    @Override
    public String drawCircle(int radius, int x, int y) {
        return "Red Circle Draw";
    }
    
}
