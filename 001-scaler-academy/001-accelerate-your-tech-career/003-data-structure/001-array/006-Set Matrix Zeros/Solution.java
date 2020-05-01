package io.github.raveerocks;

class Solution {
    
    /**
     *
     * @param a : 2-d integer matrix
     */
    public void setZeroes(int [][] a) {

        
        boolean row= false, column=false;
        
        // 'column' = true denotes first column needs to mark as '0'
        for(int i =0 ; i < a.length; i++ ){
            if(a[i][0]==0){
                column =true;
            }
        }
        
        // 'row' = true denotes first row needs to mark as '0'
        for(int j =0 ; j < a[0].length; j++ ){
            if(a[0][j]==0){
                row =true;
            }
        }

        // First row and first column is marked as '0' if a given element is '0'
        for(int i = 0 ; i < a.length; i++ ){
            for(int j =0; j< a[i].length;j++){
                if(a[i][j] == 0){
                    a[0][j]=0;
                    a[i][0]=0;
                }
            }
        }

        
        // Looking at the first row and column updating rest of the elements
        for(int i=1;i < a.length; i++ ){
            for(int j =1 ; j< a[i].length; j++){
                if(a[i][0] == 0||a[0][j]==0){
                    a[i][j]=0;
                }

            }
        }

        
        // Setting First Row
        if(row){
            for(int j =0 ; j < a[0].length; j++ ){
                a[0][j]=0;
            }
        }

        // Setting First Column
        if(column){
            for(int i =0 ; i < a.length; i++ ){
                a[i][0]=0;
            }
        }
    }
}
