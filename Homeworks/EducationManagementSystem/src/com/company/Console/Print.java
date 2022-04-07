package com.company.Console;

import com.company.Management.StudentManager;
import com.company.Management.TeacherManager;
import com.company.Person.Student;
import com.company.Person.Teacher;

public class Print {

    public void printAddStudent (Student student) {
        System.out.println("[Student] " + student.getFullName() + " is added to App." + " (" + student.getUserID() + ")");
    }

    public void printRemoveStudent (Student student) {
        System.out.println("[Student] " + student.getFullName() + " is removed from App." + " (" + student.getUserID() + ")");
    }

    public void printAddTeacher (Teacher teacher) {
        System.out.println("[Teacher] " + teacher.getFullName() + " is added to App." + " (" + teacher.getUserID() + ")");
    }

    public void printRemoveTeacher (Teacher teacher) {
        System.out.println("[Teacher] " + teacher.getFullName() + " is removed from App." + " (" + teacher.getUserID() + ")");
    }

    public void printStudentConnection(Teacher teacher, Student student) {
        System.out.println("[Student] " + student.getFullName() + " added to [Teacher] " + teacher.getFullName() + "'s class.");
    }

    public void printStudents(StudentManager studentManager) {
        for (Student student : studentManager.getStudents()) {
            System.out.println("----------------------");
            System.out.println("ID : " + student.getUserID());
            System.out.println("Full name : " + student.getFullName());
            System.out.println("Age : " + student.getAge());
            System.out.println("Gender : " + (student.getGender() ? "Female" : "Male"));
            System.out.println("Grade year : " + student.getYear());
            System.out.println("Average grade : " + student.getAverageGrade());
            System.out.println("----------------------");
        }
    }

    public void printTeachers(TeacherManager studentManager) {
        for (Teacher teacher : studentManager.getTeachers()) {
            System.out.println("----------------------");
            System.out.println("ID : " + teacher.getUserID());
            System.out.println("Full name : " + teacher.getFullName());
            System.out.println("Age : " + teacher.getAge());
            System.out.println("Gender : " + (teacher.getGender() ? "Female" : "Male"));
            System.out.println("Course Credit" + teacher.getCourseCredit());
            System.out.println("----------------------");
        }
    }

}
