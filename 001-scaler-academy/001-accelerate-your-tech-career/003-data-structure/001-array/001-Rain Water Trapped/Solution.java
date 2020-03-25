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
        int currentLeftHeight, currentRightHeight;
        int totalWaterTrapped = 0;

        // Scanning through the array to find the maxLeftHeight for each gap
        currentLeftHeight = 0;
        for (int i = 0; i < n; i++) {
            maxLeftHeight[i] = currentLeftHeight;
            if (currentLeftHeight < A[i]) {
                currentLeftHeight = A[i];
            }
        }

        // Scanning through the array to find the maxRightHeight for each gap
        currentRightHeight = 0;
        for (int i = n - 1; i >= 0; i--) {
            maxRightHeight[i] = currentRightHeight;
            if (currentRightHeight < A[i]) {
                currentRightHeight = A[i];
            }
        }

        // Calculating the total water trapped within the gaps
        for (int i = 0; i < n; i++) {
            totalWaterTrapped += Math.max(0, Math.min(maxLeftHeight[i], maxRightHeight[i]) - A[i]);
        }
        return totalWaterTrapped;
    }
}
