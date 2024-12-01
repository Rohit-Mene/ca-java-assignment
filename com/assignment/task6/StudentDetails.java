package com.assignment.task6;

public class StudentDetails {
    static class Student {
        private String name;
        private int enrollmentNo;

        public Student(String name, int enrollmentNo) {
            this.name = name;
            this.enrollmentNo = enrollmentNo;
        }

        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Enrollment Number: " + enrollmentNo);
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Amay", 132);
        student.displayDetails();
    }


}


