package io.designpatterns.CreationalPatterns.builderpattern.builder;

import io.designpatterns.CreationalPatterns.builderpattern.implementations.ChickenBurger;
import io.designpatterns.CreationalPatterns.builderpattern.implementations.Coke;
import io.designpatterns.CreationalPatterns.builderpattern.implementations.Meal;
import io.designpatterns.CreationalPatterns.builderpattern.implementations.Pepsi;
import io.designpatterns.CreationalPatterns.builderpattern.implementations.VegBurger;

public class MealBuilder {
    
    public Meal prepareVegMeal(){
        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Coke());
        return vegMeal;
    }

    public Meal prepareNonVegMeal(){
        Meal nonVegMeal = new Meal();
        nonVegMeal.addItem(new ChickenBurger());
        nonVegMeal.addItem(new Pepsi());
        return nonVegMeal;
    }

}
