package io.designpatterns.BehavioralPatterns.nullobjectpattern.main;

import io.designpatterns.BehavioralPatterns.nullobjectpattern.abstracts.Customer;
import io.designpatterns.BehavioralPatterns.nullobjectpattern.factory.CustomerFactory;

public class NullObjectDemo {
    
    public static void main(String[] args) {

        Customer customer1 = CustomerFactory.getCustomer("Rob");
        Customer customer2 = CustomerFactory.getCustomer("Bob");
        Customer customer3 = CustomerFactory.getCustomer("Julie");
        Customer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers : ");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
        
    }
}
