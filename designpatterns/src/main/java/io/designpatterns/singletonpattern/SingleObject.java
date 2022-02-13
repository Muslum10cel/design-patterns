package io.designpatterns.singletonpattern;

public class SingleObject {
    
    private static final SingleObject INSTANCE = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return INSTANCE;
    }
}
