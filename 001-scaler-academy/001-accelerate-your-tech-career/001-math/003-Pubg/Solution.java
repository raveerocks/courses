package io.github.raveerocks;

public class Solution {

    /**
     *
     * @param A : Current Strength of the Players
     * @return  : Strength of the last Player
     */
    public int solve(int[] A) {
        int min = A[0];
        for(int i =1 ; i<A.length; i++){
            min = gcd(min,A[i]);
        }
        return min;
    }

    /**
     *
     * @param A : First Number
     * @param B : Second Number
     * @return  : GCD
     */
    public int gcd(int A, int B) {

        if(B==0){
            return A;
        }
        else
        {
            return gcd(B,A%B);
        }
    }
}
