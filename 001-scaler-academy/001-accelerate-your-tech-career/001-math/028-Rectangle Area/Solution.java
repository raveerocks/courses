package io.github.raveerocks;

 public class Solution {
     public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {

        int length,breadth;
        length = commonLength(A,C,E,G);
        breadth = commonLength(B,D,F,H);

        return length*breadth;
    }

    private int commonLength(int min1,int max1, int min2, int max2){
        int length;

        // [min1 max1] [min2 max2]
        if((max1<=min2) ||(max2<=min1)){
            length=0;
        }
        // [min2 [min1 max1] max2]
        else if(min1>=min2&&max1<=max2){
            length = max1-min1;
        }
        //  [min1 [min2 max2] max1]
        else if(min2>=min1&&max2<=max1){
            length = max2-min2;
        }
        else {
            length = Math.min(max1,max2)-Math.max(min1,min2);
        }

        return length;

    }
}
