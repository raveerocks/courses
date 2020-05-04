package io.github.raveerocks;

public class Solution {

    long modulus = 1000000007;

    public int solve(int A, int B, int C) {
        if(A>=C){

            int n =A-1;
            int r =C-1;

            r = 2*r<=n?r:n-r;

            long combinationsSuccess = combination(n,r);
            long successProbability = exponentiation(B,((modulus-2)*A));
            long failureProbability = exponentiation(B-1,A-C);
            long result = multiply(multiply(combinationsSuccess,successProbability),failureProbability);
            return (int) result;
        }
        return 0;
    }

    public long combination(int n, int r){
        if (n == 0) {
            return 1;
        }

        else if (r >= modulus || n >= modulus) {
            return 0;
        }

        long numerator = 1 , denominator=1;


        for (int i = 1; i <= r; i++) {
            numerator = (numerator * (n-i+1)) % modulus;
            denominator = (denominator*i)%modulus;
        }

        return (numerator* inverse(denominator))%modulus;
    }

    public long inverse(long n){
        if(n==1){
            return 1;
        }
        if(n>=modulus){
            return 0;
        }
        return exponentiation(n,modulus-2);
    }

    public long exponentiation(long base, long exponent) {
        long result = 1;
        exponent = exponent%(modulus-1);
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % modulus;
            }
            base = (base * base) % modulus;
            exponent >>= 1;
        }
        return result;
    }

    public long multiply(long a, long b) {
        long product = (a % modulus * b % modulus) % modulus;
        return product;
    }
}
