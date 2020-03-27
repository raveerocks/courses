package io.github.raveerocks;

public class Solution {

    /**
     *
     * @param A : Maximum jump length at a given position
     * @return  : Minimum number of jumps to reach end from start
     */
    public int solve(int[] A) {

        int n = A.length;
        int destination = n-1;
        int jumps [] = new int[n];

        // Setting jumps from each location to be n
        for(int i =0;i<n;i++){
            jumps[i] = n;
        }

        // Setting jumps from destination to itself as 0
        jumps[n-1] = 0;

        // For each location from second last to first we calculate the number of jumps required from there
        for(int source = n-2 ; source>=0 ; source--){
            
            // If the number of jumps available is enough to each destination only one hop is required
            if(destination-source<=A[source]){
                jumps[source] = 1;
            }
            
            else{
                // If the number of jumps available is not enough to each destination some stopover is required
                for (int stopover = source+1; stopover<=source+A[source] && stopover<n ;stopover++){
                    jumps[source] = Math.min(jumps[source],jumps[stopover]+1);
                }
            }
        }
        
        // jumps[0]==n implies the destination is not reachable
        return jumps[0]==n?-1:jumps[0];

    }
}
