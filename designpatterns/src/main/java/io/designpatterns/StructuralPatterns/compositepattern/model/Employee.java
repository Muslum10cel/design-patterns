package io.designpatterns.StructuralPatterns.compositepattern.model;

import java.util.ArrayList;
import java.util.List;

import io.designpatterns.StructuralPatterns.compositepattern.enums.Department;

public class Employee {
    
    private String name;
    private Department department;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, Department department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinates(Employee employee){
        this.subordinates.add(employee);
    }

    public void removeSubordinates(Employee employee){
        this.subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return this.subordinates;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (department != other.department)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", department='" + department + "'" +
            ", salary='" + salary + "'" +
            "}";
    }
    
}
