package com.assignment.task3;

public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Upper part of diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int k = 1; k <= (2 * i - 3); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int k = 1; k <= (2 * i - 3); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
