package io.github.raveerocks;

public class Solution {
    
    /**
     * @param A : Contains the integers
     * @return  : Maximum value of f(i, j).
     */
    public int maxArr(int[] A) {

        int AplusMin=A[0],AplusMax=A[0],AminusMin=A[0],AminusMax=A[0],max = 0;

        for (int i = 1; i < A.length; i++) {
                AplusMin = Math.min(AplusMin, A[i] + i);
                AplusMax = Math.max(AplusMax, A[i] + i);
                AminusMin = Math.min(AminusMin, A[i] - i);
                AminusMax = Math.max(AminusMax, A[i] - i);
        }
        return Math.max(AplusMax - AplusMin, AminusMax - AminusMin);

    }
}
