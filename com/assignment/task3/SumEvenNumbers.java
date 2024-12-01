package com.assignment.task3;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int sum = 0;
        int count = 0;
        int number = 2;
        while (count < n) {
            sum += number;
            number += 2;
            count++;
        }
        System.out.println("Sum of first " + n + " even numbers is " + sum);
        scanner.close();
    }
}
