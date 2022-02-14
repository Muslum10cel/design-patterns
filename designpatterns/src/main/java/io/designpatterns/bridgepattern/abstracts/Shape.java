package io.designpatterns.bridgepattern.abstracts;

import io.designpatterns.bridgepattern.interfaces.DrawAPI;

public abstract class Shape {
    
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract String draw();
}
