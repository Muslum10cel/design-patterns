package io.designpatterns.StructuralPatterns.filterpattern.model;

import java.util.Objects;

import io.designpatterns.StructuralPatterns.filterpattern.enums.Gender;
import io.designpatterns.StructuralPatterns.filterpattern.enums.MaritalStatus;

public class Person {

    private String name;
    private Gender gender;
    private MaritalStatus maritalStatus;

    public Person(String name, Gender gender, MaritalStatus maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }  

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return this.gender;
    }

    public MaritalStatus getMaritalStatus() {
        return this.maritalStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(gender, person.gender) && Objects.equals(maritalStatus, person.maritalStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, maritalStatus);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", gender='" + getGender() + "'" +
            ", maritalStatus='" + getMaritalStatus() + "'" +
            "}";
    }

}
