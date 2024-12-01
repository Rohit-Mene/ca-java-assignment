package com.assignment.task7;

public class MaxValueArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 9, 2};
        int max = findMaxValue(array);
        System.out.println("Maximum value in the array is: " + max);
    }

    private static int findMaxValue(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
