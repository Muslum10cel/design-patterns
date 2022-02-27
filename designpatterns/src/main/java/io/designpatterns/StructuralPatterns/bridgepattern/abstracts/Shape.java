package io.designpatterns.StructuralPatterns.bridgepattern.abstracts;

import io.designpatterns.StructuralPatterns.bridgepattern.interfaces.DrawAPI;

public abstract class Shape {
    
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract String draw();
}
