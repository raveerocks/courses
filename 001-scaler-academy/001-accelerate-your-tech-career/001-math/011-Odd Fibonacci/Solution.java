package io.github.raveerocks;

public class Solution {
    public int solve(int A, int B) {
        int total = B-A+1;
        int evenFibonacci = B/3 - (A-1)/3;
        return total - evenFibonacci;
    }
}
