package com.assignment.task4;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the sorted array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int index = 1;
        for (int i = 1; i < n; i++) {
            if (array[i] != array[i - 1]) {
                array[index++] = array[i];
            }
        }


        for (int i = index; i < n; i++) {
            array[i] = 0;
        }

        System.out.println("Array after removing duplicates:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
