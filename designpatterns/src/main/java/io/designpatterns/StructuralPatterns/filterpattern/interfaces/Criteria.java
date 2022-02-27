package io.designpatterns.StructuralPatterns.filterpattern.interfaces;

import java.util.List;

import io.designpatterns.StructuralPatterns.filterpattern.model.Person;

public interface Criteria {
    
    List<Person> meetCriteria(List<Person> persons);
}
