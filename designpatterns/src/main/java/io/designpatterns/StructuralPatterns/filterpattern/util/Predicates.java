package io.designpatterns.StructuralPatterns.filterpattern.util;

import java.util.function.Predicate;

import io.designpatterns.StructuralPatterns.filterpattern.enums.Gender;
import io.designpatterns.StructuralPatterns.filterpattern.enums.MaritalStatus;
import io.designpatterns.StructuralPatterns.filterpattern.model.Person;

public class Predicates {

    public static final Predicate<Person> MALE_FILTER = person -> person.getGender() == Gender.MALE;
    public static final Predicate<Person> FEMALE_FILTER = person -> person.getGender() == Gender.FEMALE;
    public static final Predicate<Person> SINGLE_FILTER = person -> person.getMaritalStatus() == MaritalStatus.SINGLE;
    public static final Predicate<Person> MARRIED_FILTER = person -> person.getMaritalStatus() == MaritalStatus.MARRIED;
}
