package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImplementation implements EmployeeRepository {

    List<Employee> employeeList = new ArrayList<>();

    public EmployeeRepositoryImplementation(List<Employee> list) {
        this.employeeList = list;
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
