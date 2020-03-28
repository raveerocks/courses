package io.github.raveerocks;

public class Solution {

    /**
     * @param A : Represents the elevation map
     * @return : The total water it is able to trap after raining.
     */
    public int trap(final int[] A) {

        int n = A.length;
        int maxLeftHeight[] = new int[n];
        int maxRightHeight[] = new int[n];

        // Scanning through the array to find the maxLeftHeight for each gap
        int currentLeftHeight = 0;
        for (int i = 0; i < n; i++) {
            maxLeftHeight[i] = currentLeftHeight;
            currentLeftHeight = Math.max(currentLeftHeight,A[i]);
        }

        // Scanning through the array to find the maxRightHeight for each gap
        int currentRightHeight = 0;
        for (int i = n - 1; i >= 0; i--) {
            maxRightHeight[i] = currentRightHeight;
            currentRightHeight = Math.max(currentRightHeight,A[i]);
        }

        // Calculating the total water trapped within the gaps
        int totalWaterTrapped=0;
        for (int i = 0; i < n; i++) {
            totalWaterTrapped += Math.max(0, Math.min(maxLeftHeight[i], maxRightHeight[i]) - A[i]);
        }
        return totalWaterTrapped;
    }
}
