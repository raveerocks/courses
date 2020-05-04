package io.github.raveerocks;

public class Solution {
    public int solve(int A) {
        long result = (A)%1000000007;
        result = (result*(A-1))%1000000007;
        long power = exponentiation(3,A-2,1000000007);
        return (int)((result*power)%1000000007);
    }
    
    private long exponentiation(long base, long exponent,int modulus){
        long result =1;
        while(exponent>0){
            if((exponent&1)==1){
                result = (result * base)%modulus;
            }
            base = (base * base) % modulus;
            exponent >>=1;
        }

        return result;
    }
}

