package com.assignment.task7;

import java.util.HashSet;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "hello";
        if (hasAllUniqueCharacters(str)) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string does not have all unique characters.");
        }
    }

    private static boolean hasAllUniqueCharacters(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }
}
