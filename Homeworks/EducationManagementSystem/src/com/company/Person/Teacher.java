package com.company.Person;

import com.company.Console.Print;

import java.util.ArrayList;

public class Teacher extends User {

    ArrayList<Integer> studentIds = new ArrayList<Integer>();
    int courseCredit;

    Print print = new Print();

    public Teacher(int userID, String name, String surname, int age, boolean gender, int courseCredit) {
        super(userID, name, surname, age, gender);
        this.courseCredit = courseCredit;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public void addToClassList(Student student) {
        studentIds.add(student.getUserID());
        print.printStudentConnection(this, student);
    }
}
