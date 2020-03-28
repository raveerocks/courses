package io.github.raveerocks;

public class Solution {
    
    /**
     * @param A : Contains the integers
     * @return  : Maximum value of f(i, j).
     */
    public int maxArr(int[] A) {
        
        int  plusMin,plusMax,minusMin,minusMax;
        
        plusMin=plusMax=minusMin=minusMax=A[0];
        
        for(int i = 1; i<A.length ; i++){
              plusMin  = Math.min(plusMin, A[i]+i);
              plusMax  = Math.max(plusMax, A[i]+i);
              minusMin = Math.min(minusMin, A[i]-i);
              minusMax = Math.max(minusMax, A[i]-i);
        }
        
        return Math.max(plusMax-plusMin ,minusMax -minusMin );
        
    }
}
