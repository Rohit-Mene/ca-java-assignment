package com.assignment.task7;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 1);
        map.put("cherry", 2);

        System.out.println("Sorted by keys:");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("Sorted by values:");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
