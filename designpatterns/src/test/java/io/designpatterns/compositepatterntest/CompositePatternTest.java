package io.designpatterns.compositepatterntest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import io.designpatterns.compositepattern.enums.Department;
import io.designpatterns.compositepattern.model.Employee;

public class CompositePatternTest {
    
    @Test
    public void compositePatternTest(){
       
        Employee ceo = new Employee("John", Department.CEO, 30000);

        Employee headMarketing = new Employee("Michel", Department.HEAD_MARKETING, 20000);
        Employee headSales = new Employee("Robert", Department.HEAD_SALES, 20000);

        Employee clerk1 = new Employee("Laura", Department.MARKETING, 10000);
        Employee clerk2 = new Employee("Bob", Department.MARKETING, 10000);

        Employee salesExecutive1 = new Employee("Richard", Department.SALES, 10000);
        Employee salesExecutive2 = new Employee("Rob", Department.SALES, 10000);

        ceo.addSubordinates(headMarketing);
        ceo.addSubordinates(headSales);

        headSales.addSubordinates(salesExecutive1);
        headSales.addSubordinates(salesExecutive2);

        headMarketing.addSubordinates(clerk1);
        headMarketing.addSubordinates(clerk2);

        List<Employee> salesEmployees = new ArrayList<>();
        salesEmployees.add(salesExecutive1);
        salesEmployees.add(salesExecutive2);

        assertTrue(ceo.getSubordinates().contains(headMarketing));
        assertTrue(ceo.getSubordinates().contains(headSales));

        assertEquals(salesEmployees, headSales.getSubordinates());
    }
}
