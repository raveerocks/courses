package io.github.raveerocks;

public class Solution {

    public int[] plusOne(int[] A) {

        int n = A.length;

        // Initially carry is taken 1 to add one to the given number
        int carry=1,sum=0;

        int result[];

        
        // Iterating each digit from LSB to MSB
        for(int i =n-1; i>=0;i--){
            sum= A[i]+carry;        // Sum is calculated
            A[i] = sum%10;          // Last digit is taken into A
            carry = sum/10;         // Carry is propagated
        }
        
        int startSum=0,startResult=0;
        
        if(carry!=0){
            // If a carry is generated at MSB result needs n+1 digits
            result = new int[n+1];
            result[0]=carry;                // Carry will be at index 0(MSB) of the result
            startResult=1;                  // Rest of the result needs to be copied from index 1
        }
        else{
            // If a carry is not generated at MSB result needs n or lesser digits
            while(startSum<n+1&&A[startSum]==0){
                // startSum is the first non-zero digit in the sum
                startSum++;
            }
            
            // Result will need 'n-startSum' digits to accommodate the sum trimming leftmost zeroes
            result = new int[n-startSum];
        }

        System.arraycopy(A,startSum,result,startResult,n-startSum);
        
        return result;
    }
}
