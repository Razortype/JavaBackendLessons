package com.company.business.concretes;

import com.company.business.abstracts.EmployeeService;
import com.company.entities.concretes.Employee;

import java.util.ArrayList;

public class EmployeeManagement implements EmployeeService {

    ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
        this.employees.add(this.employees.indexOf(oldEmployee), newEmployee);
    }
}
