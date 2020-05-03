package io.github.raveerocks;

 public class Solution {
    public int solve(int n, int r, int m) {

      PrimeModulus primeModulus = new PrimeModulus(m,n);

      long result = primeModulus.factorial(n);
        result = primeModulus.multiply(result,primeModulus.inverseFactorial(r));
        result = primeModulus.multiply(result,primeModulus.inverseFactorial(n-r));
        return (int)result;
    }
}
