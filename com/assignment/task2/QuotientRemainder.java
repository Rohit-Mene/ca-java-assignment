package com.assignment.task2;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        System.out.println("Quotient: " + (dividend / divisor));
        System.out.println("Remainder: " + (dividend % divisor));
        scanner.close();
    }
}