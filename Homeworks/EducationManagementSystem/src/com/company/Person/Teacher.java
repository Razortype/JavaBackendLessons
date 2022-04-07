package com.company.Person;

import com.company.Console.Print;

import java.util.ArrayList;

public class Teacher extends User {

    ArrayList<Integer> studentIds = new ArrayList<Integer>();
    String courseName;
    int courseCredit;

    Print print = new Print();

    public Teacher(int userID, String name, String surname, int age, boolean gender, String courseName, int courseCredit) {
        super(userID, name, surname, age, gender);
        this.courseName = courseName;
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

    public ArrayList<Integer> getClassList() {
        return studentIds;
    }
}
