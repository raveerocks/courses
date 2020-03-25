package io.github.raveerocks;

public class Solution {
    
    /**
     * @param A : Contains the integers
     * @return  : Maximum value of f(i, j).
     */
    public int maxArr(int[] A) {

        int AplusMin = Integer.MAX_VALUE, AplusMax = Integer.MIN_VALUE;
        int AminusMin = Integer.MAX_VALUE, AminusMax = Integer.MIN_VALUE;

        int[] Aminus = new int[A.length];
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                AplusMin = AplusMax = A[i] + i;
                AminusMin = AminusMax = A[i] - i;

            } else {

                AplusMin = Math.min(AplusMin, A[i] + i);
                AplusMax = Math.max(AplusMax, A[i] + i);
                AminusMin = Math.min(AminusMin, A[i] - i);
                AminusMax = Math.max(AminusMax, A[i] - i);

            }

        }

        return Math.max(AplusMax - AplusMin, AminusMax - AminusMin);

    }
}
