package io.designpatterns.StructuralPatterns.filterpattern.implementations;

import java.util.List;
import java.util.stream.Collectors;

import io.designpatterns.StructuralPatterns.filterpattern.interfaces.Criteria;
import io.designpatterns.StructuralPatterns.filterpattern.model.Person;
import io.designpatterns.StructuralPatterns.filterpattern.util.Predicates;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(Predicates.MALE_FILTER).collect(Collectors.toList());
    }

}
