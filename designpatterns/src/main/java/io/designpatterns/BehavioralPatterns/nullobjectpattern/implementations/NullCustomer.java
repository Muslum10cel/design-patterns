package io.designpatterns.BehavioralPatterns.nullobjectpattern.implementations;

import io.designpatterns.BehavioralPatterns.nullobjectpattern.abstracts.Customer;

public class NullCustomer extends Customer{

    @Override
    public boolean isNill() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available In Customer Database!";
    }
}
