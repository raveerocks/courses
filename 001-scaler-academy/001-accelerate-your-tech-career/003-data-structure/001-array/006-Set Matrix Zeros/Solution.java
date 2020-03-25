package io.github.raveerocks;

import java.util.ArrayList;

public class Solution {

    /**
     *
     * @param a : 2-d integer matrix
     */
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        boolean row= false, column=false;
        for(int i =0 ; i < a.size(); i++ ){
            if(a.get(i).get(0)==0){
                column =true;
            }
        }

        for(int j =0 ; j < a.get(0).size(); j++ ){
            if(a.get(0).get(j)==0){
                row =true;
            }
        }

        for(int i = 0 ; i < a.size(); i++ ){
            for(int j =0; j< a.get(i).size();j++){
                if(a.get(i).get(j) == 0){
                    a.get(0).set(j,0);
                    a.get(i).set(0,0);
                }
            }
        }

        for(int i=1;i < a.size(); i++ ){
            for(int j =1 ; j< a.get(i).size(); j++){
                if(a.get(i).get(0) == 0||a.get(0).get(j)==0){
                    a.get(i).set(j,0);
                }

            }
        }

        if(row){
            for(int j =0 ; j < a.get(0).size(); j++ ){
                a.get(0).set(j,0);
            }
        }

        if(column){
            for(int i =0 ; i < a.size(); i++ ){
                a.get(i).set(0,0);
            }
        }
    }
}
