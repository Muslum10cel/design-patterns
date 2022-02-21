package io.designpatterns.flyweightpattern.factory;

import java.util.HashMap;
import java.util.Map;

import io.designpatterns.flyweightpattern.implementations.Circle;
import io.designpatterns.flyweightpattern.interfaces.Shape;

public class ShapeFactory {
    
    private static final Map<String, Shape> CIRCLE_MAP = new HashMap<>();

    public static Shape getCircle(String color){   
        
        Circle circle = (Circle) CIRCLE_MAP.get(color);

        if(circle == null){
            circle = new Circle(color);
            CIRCLE_MAP.put(color, circle);
        }else{
            circle.setNewlyCreated(false);
        }

        return circle;
    }
}
