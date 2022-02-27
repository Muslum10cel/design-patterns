package io.designpatterns.BehavioralPatterns.commandpattern.implementations;

import io.designpatterns.BehavioralPatterns.commandpattern.interfaces.Order;
import io.designpatterns.BehavioralPatterns.commandpattern.request.Stock;

public class BuyStock implements Order{

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        this.abcStock.buy();
    }
    
}
