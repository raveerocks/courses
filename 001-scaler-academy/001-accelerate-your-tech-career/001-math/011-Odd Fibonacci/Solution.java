package io.github.raveerocks;

public class Solution {
    public int solve(int A, int B) {
        
        int position = A % 3;
        int even=0;
        
        switch(position){
            case 0:
                even = 1+((B-A)/3);
                break;
            case 1:
                even = 1+((B-A-2)/3);
                break;
            case 2 :
                even = 1+((B-A-1)/3);
                break;
        }
        return even>0?(B-A+1-even):B-A;
        
    }
}
