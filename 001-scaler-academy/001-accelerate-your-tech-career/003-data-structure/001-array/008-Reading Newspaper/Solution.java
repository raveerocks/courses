package io.github.raveerocks;

import java.util.ArrayList;

public class Solution {
    public int solve(int A, ArrayList<Integer> B) {
        int read = 0,i=-1;

        while(read<A){

            i = (i+1)%(B.size());
            read+=B.get(i);


        }


        return i+1;

    }
}
