package io.github.raveerocks;

public class Solution {
    public int[] flip(String A) {

        Pair[] pairs = new Pair[A.length()];
        boolean possible = false;
        int[] result = new int[2];


        // Every 0 is denoted by a sum of -1 and every 1 is denoted by a sum of +1
        for (int i = 0; i < A.length(); i++) {
            switch (A.charAt(i)) {
                case '0':
                    pairs[i] = new Pair(-1, i);
                    possible = true;
                    break;
                case '1':
                    pairs[i] = new Pair(1, i);
                    break;
            }
        }

        // If there are no more 1's possible return empty array
        if (!possible) {
            return new int[0];
        }


        int minSum = pairs[0].sum;
        for (int i = 1; i < A.length(); i++) {

            // A non positive sum indicates that the pairs[i - 1].from to i-1 number of 0's are more hence we can allow flips to increase 1's
            if (pairs[i - 1].sum <= 0) {
                pairs[i].sum = pairs[i].sum + pairs[i - 1].sum;
                pairs[i].from = pairs[i - 1].from;
            }

            // Finding the pair [L,R] which maximizes the count of 1's and is lexicographically smaller
            if (minSum > pairs[i].sum) {
                minSum = pairs[i].sum;
                result[0] = pairs[i].from + 1;
                result[1] = i + 1;
            }
        }
        return result;
    }
}
