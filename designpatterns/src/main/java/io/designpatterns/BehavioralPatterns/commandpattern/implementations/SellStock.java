package io.designpatterns.BehavioralPatterns.commandpattern.implementations;

import io.designpatterns.BehavioralPatterns.commandpattern.interfaces.Order;
import io.designpatterns.BehavioralPatterns.commandpattern.request.Stock;

public class SellStock implements Order{

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
       this.abcStock.sell();
    }
    
}
