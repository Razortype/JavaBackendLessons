package com.company.dataAccess.abstracts;

import com.company.entities.concretes.Employee;

import java.util.ArrayList;

public interface EmployeesDataDao {

    ArrayList<Employee> getAll();
    void add(Employee employee);
    void delete(Employee employee);
    Employee get(int id);
}
