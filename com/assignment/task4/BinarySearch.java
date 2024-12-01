package com.assignment.task4;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();
        int left = 0, right = n - 1;
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                System.out.println("Number found at index: " + mid);
                found = true;
                break;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Number not found in the array.");
        }
        scanner.close();
    }
}
