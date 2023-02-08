package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class EmployeesTest {

    @Test
    public void testPayEmployeesShouldReturnTwoPayments() {
        Employees employees = new Employees(new EmployeeRepositoryStubReturningTwoEmployees(), new BankServiceStub());

        Assertions.assertEquals(2, employees.payEmployees());
    }

    @Test
    public void testPayEmployeesShouldReturnThreePayments() {
        EmployeeRepository mockRepository = Mockito.mock(EmployeeRepository.class);
        Employees employees = new Employees(mockRepository, new BankServiceStub());
        List<Employee> employeeArrayList = new ArrayList<>();
        when(mockRepository.findAll()).thenReturn(employeeArrayList);

        employeeArrayList.add(new Employee("1", 20000));
        employeeArrayList.add(new Employee("2", 20000));
        employeeArrayList.add(new Employee("3", 20000));

        Assertions.assertEquals(3, employees.payEmployees());
    }
}