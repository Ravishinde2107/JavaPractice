package com.interview;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubString {
    public static void main(String[] args) {
        System.out.println(getUniqueCharacterSubstring("ravindrashinde"));
        System.out.println(getUniqueCharacterSubstring("A"));
        System.out.println(getUniqueCharacterSubstring("ABCDEF"));
        System.out.println(getUniqueCharacterSubstring("ABCDEFF"));
        System.out.println(getUniqueCharacterSubstring("CODINGISAWESOME"));
        System.out.println(getUniqueCharacterSubstring("always be coding"));

    }
    static String getUniqueCharacterSubstring(String input) {
        String output = "";
        for (int start = 0; start < input.length(); start++) {
            Set<Character> visited = new HashSet<>();
            int end = start;
            for (; end < input.length(); end++) {
                char currChar = input.charAt(end);
                if (visited.contains(currChar)) {
                    break;
                } else {
                    visited.add(currChar);
                }
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end);
            }
        }
        return output;
    }
}
