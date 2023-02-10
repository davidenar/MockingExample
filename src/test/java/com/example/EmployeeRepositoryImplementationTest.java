package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeRepositoryImplementationTest {

    ArrayList<Employee> employees = new ArrayList<>();
    EmployeeRepositoryImplementation employeeRepositoryImplementation = new EmployeeRepositoryImplementation(employees);
    @Test
    public void testSaveToEmptyList() {
        Employee jane = new Employee("1", 20000);
        employeeRepositoryImplementation.save(jane);
        Assertions.assertEquals(jane, employeeRepositoryImplementation.employeeList.get(0));
    }

    @Test
    public void testSaveShouldOverwriteExtantId(){
        Employee jane = new Employee("1", 10000);
        employeeRepositoryImplementation.save(jane);
        Employee john = new Employee("1", 20000);
        employeeRepositoryImplementation.save(john);
        Assertions.assertEquals(john, employeeRepositoryImplementation.employeeList.get(0));
    }

    @Test
    public void findAllShouldReturnEmployeeList(){
        Employee jane = new Employee("1", 10000);
        employeeRepositoryImplementation.employeeList.add(jane);
        Employee john = new Employee("2", 20000);
        employeeRepositoryImplementation.employeeList.add(john);
        Assertions.assertEquals((Arrays.asList(jane, john)), employeeRepositoryImplementation.findAll());


    }

}
