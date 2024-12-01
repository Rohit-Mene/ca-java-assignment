package com.assignment.task6;

public class StudentNameOverloading {
    public static void main(String[] args) {
        Student student1 = new Student("Rohit");
        Student student2 = new Student();

        student1.displayName();
        student2.displayName();
    }
}

class Student {
    private String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }
}
