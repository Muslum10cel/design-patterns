package io.designpatterns.BehavioralPatterns.commandpattern.main;

import io.designpatterns.BehavioralPatterns.commandpattern.commandinvoker.Broker;
import io.designpatterns.BehavioralPatterns.commandpattern.implementations.BuyStock;
import io.designpatterns.BehavioralPatterns.commandpattern.implementations.SellStock;
import io.designpatterns.BehavioralPatterns.commandpattern.request.Stock;

public class CommandPatternDemo {
    
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
