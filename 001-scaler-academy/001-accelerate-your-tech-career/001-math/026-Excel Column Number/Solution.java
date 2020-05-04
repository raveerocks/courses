package io.github.raveerocks;

public class Solution {
     public int titleToNumber(String A) {


        int n = A.length();
        int result = 0;
        int previousCharCount = 1;

        for (int i = n - 1; i >= 0; i--) {
            result += charIndex(A.charAt(i)) * previousCharCount;
            previousCharCount *= 26;
        }

        return result;
    }

    private int charIndex(char c) {
        return (c - 'A') + 1;
    }
}
