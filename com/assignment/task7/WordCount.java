package com.assignment.task7;

public class WordCount {
    public static void main(String[] args) {
        String str = "This is a sample string";
        int wordCount = countWords(str);
        System.out.println("Number of words: " + wordCount);
    }

    private static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
