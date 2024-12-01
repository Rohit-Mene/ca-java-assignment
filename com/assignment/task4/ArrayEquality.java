package com.assignment.task4;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        if (Arrays.equals(array1, array2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
