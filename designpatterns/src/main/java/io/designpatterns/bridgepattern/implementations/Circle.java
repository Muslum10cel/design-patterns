package io.designpatterns.bridgepattern.implementations;

import io.designpatterns.bridgepattern.abstracts.Shape;
import io.designpatterns.bridgepattern.interfaces.DrawAPI;

public class Circle extends Shape {

    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String draw() {
        return drawAPI.drawCircle(radius, x, y);
    }

}
