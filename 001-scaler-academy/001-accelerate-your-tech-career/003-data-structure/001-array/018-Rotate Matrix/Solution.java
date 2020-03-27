package io.github.raveerocks;

public class Solution {
    public void solve(int[][] A) {

        int temp;
        int n= A.length;
        
        for(int i=0;i<=n-2; i++){
            
            // Every round reduces the size of the remaining matrix by 1 X 1
            for(int j = i; j<n-i-1 ; j++){
                
                int r1,c1,r2,c2,r3,c3,r4,c4;    // One round of exchange will swap four elements into their respective position

                r1 = i;
                c1 = j;             // A[r4][c4] is replaced by A[r1][c1]
                
                r2 = n-1-c1;
                c2 = r1;           // A[r1][c1] is replaced by A[r2][c2] 
                
                r3 = n-1-c2;
                c3 = r2;           // A[r2][c2] is replaced by A[r3][c3]
                
                r4 = n-1-c3;
                c4 = r3;            // A[r3][c3] is replaced by A[r4][c4]

                temp = A[r1][c1];
                A[r1][c1] = A[r2][c2];
                A[r2][c2] = A[r3][c3];
                A[r3][c3] = A[r4][c4];
                A[r4][c4] = temp;

            }
        }

    }
}
