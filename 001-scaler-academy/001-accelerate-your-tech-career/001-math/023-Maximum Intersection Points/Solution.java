package io.github.raveerocks;

public class Solution {
     public int getIntersection(int A, int B) {

        int lineIntersection = combination(A,2);
        int circleIntersection = combination(B,2);
        int lineCircleIntersection = A*B;

        return lineIntersection+2*(circleIntersection+lineCircleIntersection);
    }

    public int combination(int n, int r){
        if (n == 0 || n<r) {
            return 0;
        }

        int numerator = 1 , denominator=1;

        for (int i = 1; i <= r; i++) {
            numerator = (numerator * (n-i+1));
            denominator = (denominator*i);
        }

        return (numerator/(denominator));
    }
}
