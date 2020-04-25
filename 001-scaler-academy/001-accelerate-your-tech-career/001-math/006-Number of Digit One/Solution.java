package io.github.raveerocks;

public class Solution {
    public int solve(int A) {

        int count = 0;
        for(int  i =1; i<=A; i=i*10){
            int divisor = i*10;
            count += (A/divisor)*i+Math.min(Math.max(A%divisor-i+1,0),i);
        }
        return count;
    }
}
