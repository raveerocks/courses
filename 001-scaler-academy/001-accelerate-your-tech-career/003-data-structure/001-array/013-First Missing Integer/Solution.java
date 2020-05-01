package io.github.raveerocks;

public class Solution {
    public int firstMissingPositive(int[] A) {
        
        int n = A.length;
        for(int i=0; i<n; i++){
            if(A[i]>0 && A[i]<=n && A[A[i]-1]!=A[i]){
                
            /* The missing number must be between 1 to N+1 
                hence all numbers between this range is moved to its respective position */
                
                int temp=A[i];
                A[i]= A[temp-1];
                A[temp-1]=temp;
                i--;
            }
        }
        
        for(int i=0 ; i<n; i++){
            if(A[i]!=(i+1)){
                return i+1;
            }
        }

        return n+1;
    }
}
