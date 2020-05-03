package io.github.raveerocks;

public class Solution {

    /**
     * 
     * @param A : Upper bound of divisors
     * @param B : First number
     * @param C : Second number
     * @return  : Number of divisors of B&C less than or equal to A
     */
    public int solve(int A, int B, int C) {
        return A / lcm(B, C);
    }

    /**
     * 
     * @param a : First Number
     * @param b : Second Number
     * @return  : GCD
     */
    public int gcd(int A, int B) {
        return B==0? A:gcd(B,A%B);
    }

    /**
     * 
     * @param a :  First Number
     * @param b : Second Number
     * @return  : LCM
     */
    private int lcm(int A, int B){
        return (A/gcd(A,B))*B;
    }
}
