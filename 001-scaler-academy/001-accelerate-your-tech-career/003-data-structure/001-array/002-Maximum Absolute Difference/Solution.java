package io.github.raveerocks;

public class Solution {
    
    /**
     * @param A : Contains the integers
     * @return  : Maximum value of f(i, j).
     *
     *    f(i, j) :    |A[i] - A[j]| + |i - j|
     *          Consider i<=j
     *          |i - j| = i-j
     *
     *                  Case 1 : A[i] <= A[j]
     *                  |A[i] - A[j]| = A[i] - A[j]
     *                  f(i,j) = A[i]-A[j] + i-j = (A[i]+i) - (A[j]+j)
     *                  Hence max(f(i,j)) = Max(A[k]+k) - Min(A[k]+k)
     *
     *                  Case 2 : A[i] > A[j]
     *                  |A[i] - A[j]| = A[j] - A[i]
     *                  f(i,j) = A[j]-A[i] + i-j = (A[j]-j) - (A[i]+i)
     *                  Hence max(f(i,j)) = Max(A[k]-k) - Min(A[k]-k)
     *
     *                  Hence Ans  : Max{Max(A[k]+k) - Min(A[k]+k), Max(A[k]-k) - Min(A[k]-k) }
     *
     *       A similiar proof can be given when j>i
     */

    public int maxArr(int[] A) {
        int  plusMin,plusMax,minusMin,minusMax;
        
        plusMin=plusMax=minusMin=minusMax=A[0];
        
        for(int i = 1; i<A.length ; i++){
              // 'plusMin' is minimum all A[k]+k
              plusMin  = Math.min(plusMin, A[i]+i);
              // 'plusMax' is maximum all A[k]+k
              plusMax  = Math.max(plusMax, A[i]+i);
              // 'minusMin' is minimum all A[k]-k
              minusMin = Math.min(minusMin, A[i]-i);
             // 'minusMax' is maximum all A[k]-k
              minusMax = Math.max(minusMax, A[i]-i);
        }
        // returning : Max{ max(A[k]+k)-min(A[k]+k), max(A[k]-k)-min(A[k]-k)}
        return Math.max(plusMax-plusMin ,minusMax -minusMin );
        
    }
}
