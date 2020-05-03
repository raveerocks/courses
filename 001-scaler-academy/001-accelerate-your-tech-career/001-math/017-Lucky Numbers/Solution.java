package io.github.raveerocks;

public class Solution {
    public int solve(int A) {
        
        int divisorCount [] =new int[A+1];
        int magicCount=0;
      
        
        for(int i=2; i<=A; i++){
            if(divisorCount[i]==0){
                int j=2;
                while(j*i<=A){
                    divisorCount [i*j]++;
                    j++;
                }
            }
        }
        
        
        for(int i =0 ; i<=A ; i++){
            if(divisorCount [i]==2){
                magicCount++;
            }
        }
        return magicCount;
    }
}
