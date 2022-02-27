package io.designpatterns.BehavioralPatterns.commandpattern.request;

public class Stock {

    private static final String NAME = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock.buy() name "+ NAME +" with quantity : " + quantity);
    }

    public void sell() {
        System.out.println("Stock.sell() name "+ NAME +" with quantity : " + quantity);
    }
}
