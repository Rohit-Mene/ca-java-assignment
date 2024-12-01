package com.assignment.task4;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in the array.");
        }
        scanner.close();
    }
}
