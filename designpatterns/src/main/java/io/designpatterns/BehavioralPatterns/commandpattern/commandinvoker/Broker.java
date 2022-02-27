package io.designpatterns.BehavioralPatterns.commandpattern.commandinvoker;

import java.util.ArrayList;
import java.util.List;

import io.designpatterns.BehavioralPatterns.commandpattern.interfaces.Order;

public class Broker {
    
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.forEach(Order::execute);
        orderList.clear();
    }
}
