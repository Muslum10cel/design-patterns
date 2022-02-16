package io.designpatterns.filterpattern.implementations;

import java.util.List;
import java.util.stream.Collectors;

import io.designpatterns.filterpattern.interfaces.Criteria;
import io.designpatterns.filterpattern.model.Person;
import io.designpatterns.filterpattern.util.Predicates;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(Predicates.FEMALE_FILTER).collect(Collectors.toList());
    }

}
