package com.company.Person;

public class Student extends User {

    private int year;
    private double averageGrade;

    public Student(int userID, String name, String surname, int age, boolean gender, int year, double averageGrade) {
        super(userID, name, surname, age, gender);
        this.year = year;
        this.averageGrade = averageGrade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

}
