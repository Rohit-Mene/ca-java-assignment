package com.assignment.task2;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        double hra, da, grossSalary;

        if (basicSalary <= 15000) {
            hra = 0.25 * basicSalary;
            da = 0.82 * basicSalary;
        } else if (basicSalary <= 20200) {
            hra = 0.27 * basicSalary;
            da = 0.90 * basicSalary;
        } else {
            hra = 0.36 * basicSalary;
            da = 0.95 * basicSalary;
        }

        grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary: " + grossSalary);
        scanner.close();
    }
}