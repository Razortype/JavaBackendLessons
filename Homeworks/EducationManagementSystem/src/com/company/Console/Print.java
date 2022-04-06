package com.company.Console;

import com.company.Management.StudentManager;
import com.company.Management.TeacherManager;
import com.company.Person.Student;
import com.company.Person.Teacher;

public class Print {

    public void printAddStudent (Student student) {
        System.out.println("[Student] " + student.getFullName() + " is added to App." + " (" + student.getUserID() + ")");
    }

    public void printAddTeacher (Teacher teacher) {
        System.out.println("[Teacher] " + teacher.getFullName() + " is added to App." + " (" + teacher.getUserID() + ")");
    }

    public void printStudentConnection(Teacher teacher, Student student) {
        System.out.println("[Student] " + student.getFullName() + " added to [Teacher] " + teacher.getFullName() + "'s class.");
    }

    public void printStudents(StudentManager studentManager) {
        for (Student student : studentManager.getStudents()) {
            System.out.println("----------------------");
            System.out.println(student.getUserID());
            System.out.println(student.getFullName());
            System.out.println(student.getAge());
            System.out.println(student.getGender() ? "Female" : "Male");
            System.out.println(student.getYear());
            System.out.println(student.getAverageGrade());
            System.out.println("----------------------");
        }
    }

    public void printTeachers(TeacherManager studentManager) {
        for (Teacher teacher : studentManager.getTeachers()) {
            System.out.println("----------------------");
            System.out.println(teacher.getUserID());
            System.out.println(teacher.getFullName());
            System.out.println(teacher.getAge());
            System.out.println(teacher.getGender() ? "Female" : "Male");
            System.out.println(teacher.getCourseCredit());
            System.out.println("----------------------");
        }
    }

}
