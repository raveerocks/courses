package io.github.raveerocks;

public class Solution {
    public int[] primesum(int A) {
     
     int result [] = new int[2];
     for(int i = 2 ; 2*i<= A; i++){
         if(isPrime(i)&&isPrime(A-i)){
            result[0] = i;
            result[1] = A-i;
            return result;
         }
            
     }
     return result;
    }
    
    private boolean isPrime(int A){
        for(int i=2 ; i*i<=A ; i++){
            if(A%i==0){
                return false;
            }
        }
        return true;
    }
}
