package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerIntegrationTest {

    @Test
    public void testPayEmployeesShouldReturnThreePayments() {
        List<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("1", 20000));
        employeeArrayList.add(new Employee("2", 20000));
        employeeArrayList.add(new Employee("3", 20000));

        EmployeeRepositoryImplementation employeeRepositoryImplementation = new EmployeeRepositoryImplementation(employeeArrayList);
        Employees employees = new Employees(employeeRepositoryImplementation, new BankServiceStub());

        Assertions.assertEquals(3, employees.payEmployees());
    }
}

