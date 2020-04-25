package io.github.raveerocks;

public class Solution {
    
    public int[] nextPermutation(int[] A) {
        
        int n = A.length, i = n-2;
        while(i>=0 && A[i]>=A[i+1] ){
            --i;
        }
        
        if(i==-1){
            reverse(A,0,n-1);
            return A;
        }
        
  
        int replacement = A[i],j=n-1;
        while(A[j]<replacement ){
            j--;
        }
        
        A[i] = A[j];
        A[j] = replacement;
        
        reverse(A,i+1,n-1);
        
        return A;
        
    }
    
    
    public void reverse(int[] A, int from, int to){
        while(from<to){
            int temp= A[from];
            A[from] = A[to];
            A[to]=temp;
            from++;
            to--;
        }
    }
}
