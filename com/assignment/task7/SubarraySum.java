package com.assignment.task7;

public class SubarraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7, 5};
        int targetSum = 12;
        findSubarrayWithSum(array, targetSum);
    }

    private static void findSubarrayWithSum(int[] array, int targetSum) {
        for (int start = 0; start < array.length; start++) {
            int sum = 0;
            for (int end = start; end < array.length; end++) {
                sum += array[end];
                if (sum == targetSum) {
                    System.out.print("Subarray with sum " + targetSum + ": ");
                    for (int i = start; i <= end; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println("No subarray with the given sum found.");
    }
}
