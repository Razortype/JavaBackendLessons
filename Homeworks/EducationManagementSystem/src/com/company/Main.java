package com.company;

import com.company.Console.Print;
import com.company.Management.StudentManager;
import com.company.Management.TeacherManager;
import com.company.Person.Student;
import com.company.Person.Teacher;

public class Main {

    public static void main(String[] args) {

        TeacherManager teacherManager = new TeacherManager();
        StudentManager studentManager = new StudentManager();

        Print print = new Print();

        Student student1 = new Student(
                1,
                "Orkun",
                "Kurul",
                21,
                false,
                1,
                3.0
        );

        Student student2 = new Student(
                2,
                "Jacob",
                "Glow",
                20,
                false,
                3,
                3.5
        );

        Student student3 = new Student(
                3,
                "Karren",
                "Cow",
                18,
                true,
                2,
                2.5
        );

        Student student4 = new Student(
                4,
                "Serap",
                "Saygın",
                19,
                true,
                4,
                1.6
        );

        Teacher teacher1 = new Teacher(
                5,
                "Ateş",
                "Ergüven",
                52,
                false,
                "Linear Algebra",
                6
        );

        Teacher teacher2 = new Teacher(
                6,
                "Sezin",
                "Kuşçu",
                43,
                true,
                "Calculus 2",
                3
        );

        // Initialising users as students
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);

        // Initialising users as teachers
        teacherManager.addTeacher(teacher1);
        teacherManager.addTeacher(teacher2);

        // Adding students to teachers' classroom
        teacher1.addToClassList(student1);
        teacher1.addToClassList(student3);
        teacher1.addToClassList(student4);


        teacher2.addToClassList(student2);
        teacher2.addToClassList(student3);

        teacherManager.removeTeacher(teacher1);
        studentManager.removeStudent(student3);
        studentManager.removeStudent(student3);

        print.printStudents(studentManager);
        print.printTeachers(teacherManager);
    }
}
