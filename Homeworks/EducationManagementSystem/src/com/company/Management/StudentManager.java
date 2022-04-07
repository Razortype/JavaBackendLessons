package com.company.Management;

import com.company.Console.Print;
import com.company.Person.Student;

import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();
    Print print = new Print();


    public void addStudent(Student student) {
        students.add(student);
        print.printAddStudent(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        print.printRemoveStudent(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
