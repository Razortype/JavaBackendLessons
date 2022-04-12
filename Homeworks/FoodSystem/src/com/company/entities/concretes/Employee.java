package com.company.entities.concretes;

import com.company.entities.abstracts.EmployeeEntity;

public class Employee implements EmployeeEntity {

    private int id;
    private String name;
    private String surname;
    private String position;
    private double wage;

    public Employee(int id, String name, String surname, String position, double wage) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

}
