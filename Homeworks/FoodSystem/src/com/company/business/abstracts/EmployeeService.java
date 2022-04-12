package com.company.business.abstracts;

import com.company.entities.concretes.Employee;

public interface EmployeeService {

    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
    void updateEmployee(Employee oldEmployee, Employee newEmployee);

}
