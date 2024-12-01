package com.assignment.task2;

import java.util.Scanner;

public class AssignGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        int percentage = scanner.nextInt();
        if (percentage > 90) {
            System.out.println("Grade: A");
        } else if (percentage > 75) {
            System.out.println("Grade: B");
        } else if (percentage > 65) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
        scanner.close();
    }
}