package com.company.business.concretes;

import com.company.business.abstracts.EmployeeService;
import com.company.dataAccess.concretes.PostgreEmployeesData;
import com.company.entities.concretes.Employee;

import java.util.ArrayList;

public class EmployeeManagement implements EmployeeService {

    ArrayList<Employee> employees = new ArrayList<>();

    final private PostgreEmployeesData postgreEmployeesData;

    public EmployeeManagement(PostgreEmployeesData postgreEmployeesData) {
        this.postgreEmployeesData = postgreEmployeesData;
    }

    @Override
    public void addAllData() {

        employees = postgreEmployeesData.getAll();
    }

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
