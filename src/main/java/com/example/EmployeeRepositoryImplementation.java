package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        for (int i = 0; i < employeeList.size(); i++) {
            if (Objects.equals(employeeList.get(i).getId(), e.getId())) {
                employeeList.set(i, e);
            }
        }
        employeeList.add(e);
        return e;
    }
}
