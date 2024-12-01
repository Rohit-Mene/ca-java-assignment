package com.assignment.task2;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 600000) {
            tax = 0.1 * (income - 250000);
        } else if (income <= 1200000) {
            tax = 0.1 * 350000 + 0.18 * (income - 600000);
        } else {
            tax = 0.1 * 350000 + 0.18 * 600000 + 0.25 * (income - 1200000);
        }

        System.out.println("Income Tax: " + tax);
        scanner.close();
    }
}