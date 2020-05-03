package io.github.raveerocks;

public class Solution {
    public int solve(int n, int r, int m) {
         r = 2*r>n? n-r:r;

         int[] [] combinations = new int[n+1][r+1];

         for (int i=0; i<=n; i++){
             for (int j=0; j<=Math.min(i,r); j++){
                 combinations[i][j] = (i==0||j==0)?  1 : (combinations[i-1][j-1]+combinations[i-1][j])%m;
             }
         }
        return combinations[n][r];
    }
}
