package com.assignment.task7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        List<Integer> intersection = findIntersection(array1, array2);
        System.out.println("Intersection: " + intersection);
    }

    private static List<Integer> findIntersection(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
