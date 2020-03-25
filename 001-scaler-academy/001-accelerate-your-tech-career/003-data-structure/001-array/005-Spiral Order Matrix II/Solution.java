package io.github.raveerocks;

public class Solution {

    /**
     *
     * @param A : Integer
     * @return  : Square Matrix
     */
    public int[][] generateMatrix(int A) {

        if(A == 1){
            return new int[][]{{1}};
        }
        int counter =1;

        int [][] spiral = new int [A] [A];

        int row_start=0, row_end = A-1, col_start = 0, col_end = A-1;

        while(counter<= A*A){

            for(int i =col_start; i <= col_end ; i++){

                spiral[row_start][i] = counter++;
            }

            row_start +=1;

            for(int i =row_start; i <= row_end ; i++){

                spiral[i][col_end] = counter++;
            }

            col_end -=1;

            for(int i =col_end; i >= col_start ; i--){

                spiral[row_end][i] = counter++;
            }
            row_end -=1;

            for(int i =row_end; i >= row_start ; i--){

                spiral[i][col_start] = counter++;
            }
            col_start +=1;

        }
        return spiral;

    }
}
