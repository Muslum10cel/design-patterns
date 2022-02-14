package io.designpatterns.bridgepattern.implementations;

import io.designpatterns.bridgepattern.interfaces.DrawAPI;

public class GreenCircle implements DrawAPI{

    @Override
    public String drawCircle(int radius, int x, int y) {
        return "Green Circle Draw";
    }
    
}
