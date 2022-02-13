package io.designpatterns.builderpattern.interfaces;

public interface Item {
    
    public String name();
    
    public Packing packing();

    public float price();
}