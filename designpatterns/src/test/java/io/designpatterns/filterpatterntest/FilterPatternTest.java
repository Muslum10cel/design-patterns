package io.designpatterns.filterpatterntest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.designpatterns.StructuralPatterns.filterpattern.enums.Gender;
import io.designpatterns.StructuralPatterns.filterpattern.enums.MaritalStatus;
import io.designpatterns.StructuralPatterns.filterpattern.implementations.AndCriteria;
import io.designpatterns.StructuralPatterns.filterpattern.implementations.CriteriaFemale;
import io.designpatterns.StructuralPatterns.filterpattern.implementations.CriteriaMale;
import io.designpatterns.StructuralPatterns.filterpattern.implementations.CriteriaSingle;
import io.designpatterns.StructuralPatterns.filterpattern.implementations.OrCriteria;
import io.designpatterns.StructuralPatterns.filterpattern.interfaces.Criteria;
import io.designpatterns.StructuralPatterns.filterpattern.model.Person;

public class FilterPatternTest {
    
    private List<Person> personList;

    @BeforeEach
    public void init(){
        personList = createPersonList();
    }

    @Test
    public void maleFilterTest() {
        Criteria maleCriteria = new CriteriaMale();
        List<Person> males = new ArrayList<>();
        males.add(new Person("Robert", Gender.MALE, MaritalStatus.SINGLE));
        males.add(new Person("John", Gender.MALE, MaritalStatus.MARRIED));
        males.add(new Person("Mike", Gender.MALE, MaritalStatus.SINGLE));
        males.add(new Person("Boby", Gender.MALE, MaritalStatus.SINGLE));

        List<Person> resultOfCriteria = maleCriteria.meetCriteria(personList);

        assertEquals(males, resultOfCriteria);
    }

    @Test
    public void femaleFilterTest() {
        Criteria femaleCriteria = new CriteriaFemale();
        List<Person> females = new ArrayList<>();
        females.add(new Person("Laura", Gender.FEMALE, MaritalStatus.MARRIED));
        females.add(new Person("Diana", Gender.FEMALE, MaritalStatus.SINGLE));

        List<Person> resultOfCriteria = femaleCriteria.meetCriteria(personList);

        assertEquals(females, resultOfCriteria);
    }

    @Test
    public void andFilterTest() {
        Criteria maleCriteria = new CriteriaMale();
        Criteria singleCriteria = new CriteriaSingle();

        Criteria singleMaleCriteria = new AndCriteria(maleCriteria, singleCriteria);
        List<Person> singleMales = new ArrayList<>();
        singleMales.add(new Person("Robert", Gender.MALE, MaritalStatus.SINGLE));
        singleMales.add(new Person("Mike", Gender.MALE, MaritalStatus.SINGLE));
        singleMales.add(new Person("Boby", Gender.MALE, MaritalStatus.SINGLE));

        List<Person> resultOfCriteria = singleMaleCriteria.meetCriteria(personList);

        assertEquals(singleMales, resultOfCriteria);
    }

    @Test
    public void orFilterTest() {
        Criteria femaleCriteria = new CriteriaFemale();
        Criteria singleCriteria = new CriteriaSingle();

        Criteria singleOrFemaleCriteria = new OrCriteria(femaleCriteria, singleCriteria);
        List<Person> singleOrFemales = new ArrayList<>();

        singleOrFemales.add(new Person("Laura", Gender.FEMALE, MaritalStatus.MARRIED));
        singleOrFemales.add(new Person("Diana", Gender.FEMALE, MaritalStatus.SINGLE));
        singleOrFemales.add(new Person("Robert", Gender.MALE, MaritalStatus.SINGLE));
        singleOrFemales.add(new Person("Mike", Gender.MALE, MaritalStatus.SINGLE));
        singleOrFemales.add(new Person("Boby", Gender.MALE, MaritalStatus.SINGLE));
       

        List<Person> resultOfCriteria = singleOrFemaleCriteria.meetCriteria(personList);

        assertEquals(singleOrFemales, resultOfCriteria);
    }

    private List<Person> createPersonList(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", Gender.MALE, MaritalStatus.SINGLE));
        persons.add(new Person("John", Gender.MALE, MaritalStatus.MARRIED));
        persons.add(new Person("Laura", Gender.FEMALE, MaritalStatus.MARRIED));
        persons.add(new Person("Diana", Gender.FEMALE, MaritalStatus.SINGLE));
        persons.add(new Person("Mike", Gender.MALE, MaritalStatus.SINGLE));
        persons.add(new Person("Boby", Gender.MALE, MaritalStatus.SINGLE));
        return persons;
    }
}
