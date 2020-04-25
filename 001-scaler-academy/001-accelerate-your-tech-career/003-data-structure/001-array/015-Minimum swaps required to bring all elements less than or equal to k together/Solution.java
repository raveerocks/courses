package io.github.raveerocks;

public class Solution {
    public int solve(int[] A, int B) {
        
        if(A.length<2){
            return 0;
        }
        
        int count=0;
        
         // Couting number of integers less than or equal to B
        for(int i =0; i<A.length;i++){
            count = A[i]<=B? count+1:count;
        }
        
        int exchanges=0;
        
        // In the first bracket of size 'count' checking how many exchanges are required
        for(int i=0;i<count;i++){
            exchanges = A[i]>B? exchanges+1 : exchanges;
        }
        
        int min = exchanges;
    
       // Among all brackets of size 'count' checking minimum exchanges required
        for(int i=count; i<A.length;i++){
            exchanges = A[i-count]>B?exchanges-1:exchanges;
            exchanges = A[i]>B?exchanges+1:exchanges;
            min = Math.min(min,exchanges);
        }
        return min;
    }
}
