package io.github.raveerocks;

public class Solution {
    
     /**
     *
     * @param A : First Number
     * @param B : Second Number
     * @return  : GCD
     */
    public int gcd(int A, int B) {
        return B==0? A:gcd(B,A%B);
    }
}
