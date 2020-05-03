package io.github.raveerocks;

public class Solution {
    public int solve(int n, int r, int m) {
        
         // nCr = nCn-r, so we can use min(r,n-r) for optimization
         r = Math.min(r,n-r);

        // combinations[n+1][r+1] is used to store intermediate nCr values 
         int[] [] combinations = new int[n+1][r+1];

         for (int i=0; i<=n; i++){
             for (int j=0; j<=Math.min(i,r); j++){
                 // nCr = (n-1nCr-1)+(n-1Cr)
                 combinations[i][j] = (i==0||j==0)?  1 : (combinations[i-1][j-1]+combinations[i-1][j])%m;
             }
         }
        return combinations[n][r];
    }
}
