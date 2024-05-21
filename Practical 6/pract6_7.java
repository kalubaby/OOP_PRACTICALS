Student package:
package student;

public class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}


Exam package:
package exam;

import student.Student;

public class Result {
    public static void generateMarkSheet(Student student, int marks) {
        System.out.println("------------- MARK SHEET -------------");
        System.out.println("Name:               |" + student.getName());
        System.out.println("Roll Number:        |" + student.getRollNumber());
        System.out.println("Marks Obtained:     |" + marks);
        System.out.println("--------------------------------------");
    }
}	
Main file:
import student.Student;
import exam.Result;

public class pract6_7 {
    public static void main(String[] args) {
        // Creating a student object
        Student student = new Student("Aryan Nai", 7015);

        // Generating mark sheet using Result class
        Result.generateMarkSheet(student, 95);
    }
}
