package io.github.raveerocks;

public class Solution {
    public int solve(int[][] A) {

        int n = A.length;
        int sum = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int count = (i+1)*(n-i)*(j+1)*(n-j);
                int element = A[i][j];
                sum+=(count*element);
            }
        }
        return sum;
    }
}
