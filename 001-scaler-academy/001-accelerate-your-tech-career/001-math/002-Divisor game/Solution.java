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
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    /**
     * 
     * @param a :  First Number
     * @param b : Second Number
     * @return  : LCM
     */
    private int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
