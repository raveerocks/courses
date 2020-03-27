package io.github.raveerocks;

public class Solution {
    public int solve(String A) {
        
        int countA = 0,countAG=0;
        
        for(int i =0; i< A.length(); i++){
            if(A.charAt(i)=='A'){
                countA++;
            }
            else if(A.charAt(i)=='G'){
                // Current counts of A's is the number AG's possible with current G
                countAG += countA;
            }
        }
        
        return countAG;
    }
}
