package io.github.raveerocks;

import java.util.ArrayList;

public class Solution {

    /**
     *
     * @param a : 2-d integer matrix
     */
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        boolean row= false, column=false;
        
        // 'column' = true denotes first column needs to mark as '0'
        for(int i =0 ; i < a.size(); i++ ){
            if(a.get(i).get(0)==0){
                column =true;
            }
        }

         // 'row' = true denotes first row needs to mark as '0'
        for(int j =0 ; j < a.get(0).size(); j++ ){
            if(a.get(0).get(j)==0){
                row =true;
            }
        }

        // First row and first column is marked as '0' if a given element is '0'
        for(int i = 0 ; i < a.size(); i++ ){
            for(int j =0; j< a.get(i).size();j++){
                if(a.get(i).get(j) == 0){
                    a.get(0).set(j,0);
                    a.get(i).set(0,0);
                }
            }
        }

        // Looking at the first row and column updating rest of the elements
        for(int i=1;i < a.size(); i++ ){
            for(int j =1 ; j< a.get(i).size(); j++){
                if(a.get(i).get(0) == 0||a.get(0).get(j)==0){
                    a.get(i).set(j,0);
                }

            }
        }
        // Setting First Row
        if(row){
            for(int j =0 ; j < a.get(0).size(); j++ ){
                a.get(0).set(j,0);
            }
        }
        // Setting First Column
        if(column){
            for(int i =0 ; i < a.size(); i++ ){
                a.get(i).set(0,0);
            }
        }
    }
}
