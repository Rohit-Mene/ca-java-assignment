package com.assignment.task4;

import java.util.Scanner;

public class TwoSumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("Pair found: " + array[i] + ", " + array[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found with the given sum.");
        }
        scanner.close();
    }
}
