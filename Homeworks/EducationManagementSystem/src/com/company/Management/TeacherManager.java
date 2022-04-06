package com.company.Management;

import com.company.Console.Print;
import com.company.Person.Teacher;

import java.util.ArrayList;

public class TeacherManager {

    ArrayList<Teacher> teachers = new ArrayList<>();
    Print print = new Print();


    public void addTeacher (Teacher teacher) {
        teachers.add(teacher);
        print.printAddTeacher(teacher);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}
