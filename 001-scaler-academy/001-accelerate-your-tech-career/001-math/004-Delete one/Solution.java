package io.github.raveerocks;

public class Solution {
    
    /**
     *
     * @param A : Array of integers
     * @return  : Maximum GCD Excluding a Single element
     */
    public int solve(int[] A) {
        
        int n= A.length;
        
        
        // Calculating GCD from  left end to each element
        int prefixGCD [] =new int[n];
        prefixGCD[0] = A[0];
        for(int i=1;i<n;i++){
            prefixGCD [i] = gcd(prefixGCD[i-1],A[i]);
        }
        
        
        // Calculating GCD from  right end to each element
        int suffixGCD [] =new int[n];
        suffixGCD[n-1] = A[n-1];
        for(int i=n-2;i>=0;i--){
            suffixGCD [i] = gcd(suffixGCD[i+1],A[i]);
        }
        
       
       // Calculating excludedGCD and maxGCD from prefixGCD and suffixGCD
       int maxGCD = Math.max(suffixGCD[1],prefixGCD[n-2]);
        for(int i =1; i<n-1; i++){
            int excludedGCD = gcd(prefixGCD [i-1],suffixGCD[i+1]);
            maxGCD = Math.max(maxGCD,excludedGCD);
        }
        
        return maxGCD;
        
    }
    
    private int gcd(int A, int B) {
        return B==0? A:gcd(B,A%B);
    }
}
