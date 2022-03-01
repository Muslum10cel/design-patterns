package io.designpatterns.BehavioralPatterns.nullobjectpattern.factory;

import io.designpatterns.BehavioralPatterns.nullobjectpattern.abstracts.Customer;
import io.designpatterns.BehavioralPatterns.nullobjectpattern.implementations.NullCustomer;
import io.designpatterns.BehavioralPatterns.nullobjectpattern.implementations.RealCustomer;

public class CustomerFactory {

    public static final String[] NAMES = { "Rob", "Joe", "Julie" };

    public static Customer getCustomer(String name){
        
        for(String nameInDb : NAMES){
            if(nameInDb.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }

        return new NullCustomer();
    }

}
