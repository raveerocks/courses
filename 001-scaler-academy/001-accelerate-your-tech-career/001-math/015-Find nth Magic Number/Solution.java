package io.github.raveerocks;

public class Solution {
    public int solve(int A) {
        int power = 5, result=0;
        for(int n=A; n>0; n>>=1, power*=5){
            result +=(n&1)==1?power:0;
        }
        return result;
    }
}
