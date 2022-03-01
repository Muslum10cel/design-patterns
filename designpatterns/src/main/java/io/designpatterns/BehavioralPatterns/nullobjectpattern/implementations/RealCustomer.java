package io.designpatterns.BehavioralPatterns.nullobjectpattern.implementations;

import io.designpatterns.BehavioralPatterns.nullobjectpattern.abstracts.Customer;

public class RealCustomer extends Customer{

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNill() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
