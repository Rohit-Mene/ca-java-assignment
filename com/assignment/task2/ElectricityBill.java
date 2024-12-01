package com.assignment.task2;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter electricity units consumed: ");
        int units = scanner.nextInt();
        double bill = 0;

        if (units <= 60) {
            bill = units * 0.30;
        } else if (units <= 150) {
            bill = 60 * 0.30 + (units - 60) * 0.75;
        } else if (units <= 300) {
            bill = 60 * 0.30 + 90 * 0.75 + (units - 150) * 1.10;
        } else {
            bill = 60 * 0.30 + 90 * 0.75 + 150 * 1.10 + (units - 300) * 2.50;
        }

        bill += bill * 0.20;
        System.out.println("Total Electricity Bill: " + bill);
        scanner.close();
    }
}