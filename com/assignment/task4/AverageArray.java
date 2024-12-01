package com.assignment.task4;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        double average = (double) sum / n;
        System.out.println("Average of the array elements is: " + average);
        scanner.close();
    }
}
