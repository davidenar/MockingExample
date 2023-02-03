package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeesTest {

    @Test
    public void testPayEmployeesShouldReturnTwoPayments() {
        Employees employees = new Employees(new EmployeeRepositoryStubReturningTwoEmployees(), new StubBankService());

        Assertions.assertEquals(2, employees.payEmployees());
    }
}