package io.github.raveerocks;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {

        int n = A.size();
        int last = A.get(n-1);
        int i = n-2;

        // looping through increments

        while(i>=0 && A.get(i)>=last ){
            last = A.get(i);
            --i;
        }

        if(i==-1){
            reverse(A,0,n-1);
            return A;
        }


        int replacement = A.get(i);

        int j=n-1;

        while(A.get(j)<replacement ){
            j--;
        }

        A.set(i, A.get(j));
        A.set(j, replacement);

        reverse(A,i+1,n-1);

        return A;

    }


    public void reverse(ArrayList<Integer> A, int from, int to){
        int i;

        while(from<to){
            i= A.get(from);
            A.set(from,A.get(to));
            A.set(to,i);
            from++;
            to--;
        }
    }
}
