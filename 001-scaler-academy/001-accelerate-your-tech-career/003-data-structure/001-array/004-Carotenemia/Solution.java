package io.github.raveerocks;

public class Solution {
    /**
     *
     * @param A : Array of integers
     * @param B : Number of oranges to be eaten
     * @return  : Index of the box where you finish eating
     */
    public int solve(int A[], int B) {
        
        int sum = 0, i=-1;
        
        while(i+1< A.length && sum<B){
            i++;
            sum+=A[i];
           
        }
        if(sum>=B){
            return i;
        }
        return -1;
    }
}
