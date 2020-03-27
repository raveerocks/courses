package io.github.raveerocks;

public class Solution {
    
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
