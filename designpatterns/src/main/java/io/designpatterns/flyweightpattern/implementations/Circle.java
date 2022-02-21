package io.designpatterns.flyweightpattern.implementations;

import io.designpatterns.flyweightpattern.interfaces.Shape;

public class Circle implements Shape{

    private int x;
    private int y;
    private int radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Circle [color=" + color + ", radius=" + radius + ", x=" + x + ", y=" + y + "]";
    }
}
