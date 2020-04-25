package io.github.raveerocks;

public class Solution {
    public int solve(int A) {
        int count=0;
        
        for(int i = 0 ; i*(i+1) < 2*A ; i++){
            
            int product = (i*(i+1))/2;
            
            double a = (1.0* A - product)/(i+1);
            
            if(a-(int)a == 0.0){
                count++;
            }
        }
        return count;
    }
}
