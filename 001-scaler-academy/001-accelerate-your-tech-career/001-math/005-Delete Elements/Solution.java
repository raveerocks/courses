package io.github.raveerocks;

public class Solution {
    public int solve(int[] A) {
        
        int gcd=A[0];
        
        for(int i=1; i<A.length && gcd!=1;i++){
            gcd = gcd(gcd,A[i]);
        }
        
        return gcd==1?0:-1;
    }
    
    private int gcd(int A, int B) {
        return B==0? A:gcd(B,A%B);
    }
}
