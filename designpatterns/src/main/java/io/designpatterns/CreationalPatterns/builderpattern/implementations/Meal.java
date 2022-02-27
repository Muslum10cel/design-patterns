package io.designpatterns.CreationalPatterns.builderpattern.implementations;

import java.util.ArrayList;
import java.util.List;

import io.designpatterns.CreationalPatterns.builderpattern.interfaces.Item;

public class Meal {
    
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0f;

        for(Item item:items){
            cost+=item.price();
        }

        return cost;
    }
}
