package io.github.raveerocks;

import java.util.*;

public class Solution {
   public int solve(int[] A) {

        int max = max(A);
        int nearestPrime[] =nearestPrime(max);
        Map<Integer,Integer> countMap = new HashMap<>();

        for (int i=0;i<A.length;i++){
            int prime = nearestPrime[A[i]];
            countMap.put(prime,countMap.getOrDefault(prime,0)+1);
        }

        int result = 0;
        for (int key : countMap.keySet()){
            if (key!=1){
                result += Math.pow(2,countMap.get(key))-1;
            }
        }
        return result;
    }
    private int max(int[] A){
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            max = Math.max(max, A[i]);
        }
        return max;
    }
    private int[]  nearestPrime(int max){
        boolean[] isPrime = isPrime(max+1);
        int[] nearestPrime = new int[max+1];
        
        int lastPrime=1;
        for(int i=1; i<=max; i++){
            lastPrime = isPrime[i]?i:lastPrime;
            nearestPrime[i] = lastPrime;
        }
        return nearestPrime;
    }
    private boolean[] isPrime(int max){
        boolean result[] = new boolean[max + 1];
        for (int i = 0; i <= max; i++) {
            result[i] = true;
        }
        for (int i = 2; i*i <= max; i++) {
            if(result[i]){
                for (int j = i*i; j <= max; j +=i) {
                    result[j]=false;
                }
            }
        }
        return result;
    }
}
