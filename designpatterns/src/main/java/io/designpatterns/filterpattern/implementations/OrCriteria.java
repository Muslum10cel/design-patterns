package io.designpatterns.filterpattern.implementations;

import java.util.List;
import java.util.stream.Collectors;

import io.designpatterns.filterpattern.interfaces.Criteria;
import io.designpatterns.filterpattern.model.Person;

public class OrCriteria implements Criteria {

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> resultOfFirstCriteria = this.firstCriteria.meetCriteria(persons);
        List<Person> resultOfSecondCriteria = this.secondCriteria.meetCriteria(persons);
        resultOfFirstCriteria.addAll(resultOfSecondCriteria.stream().filter(f -> !resultOfFirstCriteria.contains(f))
                .collect(Collectors.toList()));
        return resultOfFirstCriteria;
    }

}
