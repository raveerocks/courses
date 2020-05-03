package io.github.raveerocks;

public class Solution {
    public int findRank(String A) {

        int n = A.length(), modulus = 1000003, result=0,fact=1;

        for(int i =n-1; i>=0; i--){
            int count = 0;
            
            // We need to find the number of characters A[j]s to the right of A[i] such that A[j]<A[i]
            for(int j = i+1; j<n; j++){
                if(A.charAt(i)>A.charAt(j)){
                    count = (count+1)%modulus;
                }
            }
            // For a given position the characters ahead could be rearranged in n! ways
            result = (result+count * fact)%modulus;
            fact = (fact*((n-i)))%modulus;
        }
        // result containts number of permutations possible before A hence the final rank will be result+1
        return result+1;
    }
}
