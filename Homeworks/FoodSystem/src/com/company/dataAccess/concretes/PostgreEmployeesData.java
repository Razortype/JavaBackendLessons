package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.EmployeesDataDao;
import com.company.entities.concretes.Employee;

import java.util.ArrayList;

public class PostgreEmployeesData implements EmployeesDataDao {

    @Override
    public ArrayList<Employee> getAll() {
        return null;
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public Employee get(int id) {
        return null;
    }
}
