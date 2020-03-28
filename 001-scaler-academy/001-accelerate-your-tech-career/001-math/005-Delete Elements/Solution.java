package io.github.raveerocks;

public class Solution {
    public int solve(int[] A) {
        
       
        int currentGCD=A[0];
        
        for(int i=1; i<A.length;i++){
            currentGCD = gcd(currentGCD,A[i]);
        }
        
        if(currentGCD==1){
            return 0;
        }
        
        return -1;
    }
    
    private int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
