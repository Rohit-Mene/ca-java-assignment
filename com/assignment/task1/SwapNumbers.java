package com.assignment.task1;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (using third variable): a = " + a + ", b = " + b);

        // Without using third variable
        a = 5; b = 10; // Resetting values
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (without third variable): a = " + a + ", b = " + b);
    }
}