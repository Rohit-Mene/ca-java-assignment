package com.assignment.task7;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of " + str + ":");
        generatePermutations(str, "");
    }

    private static void generatePermutations(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(remaining, prefix + c);
            }
        }
    }
}
