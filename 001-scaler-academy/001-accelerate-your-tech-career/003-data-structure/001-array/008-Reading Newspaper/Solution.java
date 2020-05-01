package io.github.raveerocks;

public class Solution {
    public int solve(int A, int[] B) {
        int read = 0,i=-1;
        while(read<A){
            i = (i+1)%7;
            read+=B[i];
        }
        return i+1;
    }
}
