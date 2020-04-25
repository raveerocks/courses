package io.github.raveerocks;

public class Solution {
    
    public int[] nextPermutation(int[] A) {
        
        int n = A.length;
        int last = A[n-1];
        int i = n-2;
        
        // looping through increments
        
        while(i>=0 && A[i]>=last ){
            last = A[i];
            --i;
        }
        
        if(i==-1){
            reverse(A,0,n-1);
            return A;
        }
        
  
        int replacement = A[i];
        
        int j=n-1;
        
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
