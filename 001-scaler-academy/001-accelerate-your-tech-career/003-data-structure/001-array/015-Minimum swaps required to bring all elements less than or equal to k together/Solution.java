package io.github.raveerocks;

public class Solution {
    public int solve(int[] A, int B) {
        
        if(A.length<2){
            return 0;
        }
        
        int count=0;
        
        for(int i =0; i<A.length;i++){
            if(A[i]<=B){
                count++;
            }
        }
        
        int exchanges=0;
        
        for(int i=0;i<count;i++){
            if(A[i]>B){
                exchanges++;
            }
        }
        
        int min = exchanges;
        
        
        for(int i=count; i<A.length;i++){
            if(A[i-count]>B){
                --exchanges;
            }
            if(A[i]>B){
                ++exchanges;
            }
            
            if(min>exchanges){
                min = exchanges;
            }
        }
        return min;
    }
}
