package io.github.raveerocks;

public class Solution {

    public int firstMissingPositive(ArrayList<Integer> A) {
    
     int length = A.size(),temp;
     
        for(int i=0; i<length; i++){
            
            /* The missing number must be between 1 to N+1 
                hence all numbers between this range is moved to its respective position */
                
            if(A.get(i)>0 && A.get(i)<=length && A.get(A.get(i)-1)!=A.get(i)){
                temp=A.get(i);
                A.set(i,A.get(temp-1));
                A.set(temp-1,temp);
                i--;
            }
        }
        
        for(int i=0 ; i<length; i++){
            if(A.get(i)!=(i+1)){
                return i+1;
            }
        }

        return length+1;
    }
}
