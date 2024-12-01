package com.assignment.task7;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        char result = findFirstNonRepeatedCharacter(str);
        if (result != '\0') {
            System.out.println("First non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    private static char findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}
