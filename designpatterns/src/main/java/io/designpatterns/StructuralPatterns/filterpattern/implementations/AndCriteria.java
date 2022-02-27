package io.designpatterns.StructuralPatterns.filterpattern.implementations;

import java.util.List;

import io.designpatterns.StructuralPatterns.filterpattern.interfaces.Criteria;
import io.designpatterns.StructuralPatterns.filterpattern.model.Person;

public class AndCriteria implements Criteria {

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return this.secondCriteria.meetCriteria(this.firstCriteria.meetCriteria(persons));
    }

}
