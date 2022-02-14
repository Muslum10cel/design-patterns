package io.designpatterns.bridgepattern.implementations;

import io.designpatterns.bridgepattern.interfaces.DrawAPI;

public class RedCicle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("RedCicle.drawCircle()");
    }
    
}
