package com.assignment.task7;

public class StringCombinations {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All possible combinations of " + str + ":");
        generateCombinations(str, "");
    }

    private static void generateCombinations(String str, String prefix) {
        System.out.println(prefix);
        for (int i = 0; i < str.length(); i++) {
            generateCombinations(str.substring(i + 1), prefix + str.charAt(i));
        }
    }
}
