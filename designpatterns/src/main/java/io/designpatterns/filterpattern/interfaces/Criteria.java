package io.designpatterns.filterpattern.interfaces;

import java.util.List;

import io.designpatterns.filterpattern.model.Person;

public interface Criteria {
    
    List<Person> meetCriteria(List<Person> persons);
}
