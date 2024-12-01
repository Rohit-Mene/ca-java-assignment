package com.assignment.task3;

import java.util.Scanner;

public class DoWhileAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.println("Sum: " + (num1 + num2));
            System.out.print("Do you want to perform another operation? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        scanner.close();
    }
}
