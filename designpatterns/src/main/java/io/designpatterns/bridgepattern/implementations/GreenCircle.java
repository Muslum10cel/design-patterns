package io.designpatterns.bridgepattern.implementations;

import io.designpatterns.bridgepattern.interfaces.DrawAPI;

public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("GreenCircle.drawCircle()");
    }
    
}
