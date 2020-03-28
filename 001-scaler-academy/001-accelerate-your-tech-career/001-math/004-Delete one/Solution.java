package io.github.raveerocks;

import java.util.ArrayList;

public class Solution {

    /**
     *
     * @param A : Array of integers
     * @return  : Maximum GCD Excluding a Single element
     */
    public int solve(ArrayList<Integer> A) {
        
        int n= A.size();
        int prefixGCD [] =new int[n];
        int suffixGCD [] =new int[n];
        int excludedGCD[] = new int[n];
        
        prefixGCD[0] = A.get(0);
        suffixGCD[n-1] = A.get(n-1);
        excludedGCD[0] = suffixGCD[1];
        excludedGCD[n-1] = prefixGCD[n-2];
        
        
        
        // Calculating GCD from  left end to each element
        for(int i=1;i<n;i++){
            prefixGCD [i] = gcd(prefixGCD[i-1],A.get(i));
        }
        
        // Calculating GCD from  right end to each element
        for(int i=n-2;i>=0;i--){
            suffixGCD [i] = gcd(suffixGCD[i+1],A.get(i));
        }
        
        // Calculating excludedGCD from prefixGCD and suffixGCD
        for(int i=1; i< n-1; i++){
            excludedGCD[i] = gcd(prefixGCD [i-1],suffixGCD[i+1]);
        }
        
       
       int maxGCD = excludedGCD[0];
 
        for(int i =1; i<n; i++){
            maxGCD = maxGCD<excludedGCD[i]?excludedGCD[i]:maxGCD;
        }
        
        return maxGCD;
        
    }



    /**
     *
     * @param a : First Number
     * @param b : Second Number
     * @return  : GCD
     */
    private int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
