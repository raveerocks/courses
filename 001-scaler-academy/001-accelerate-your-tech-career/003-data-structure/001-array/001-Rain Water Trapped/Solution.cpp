int Solution::trap(const vector<int> &A) {
int n = A.size();
int maxLeftHeight[n];
int maxRightHeight[n];

        // Scanning through the array to find the maxLeftHeight for each gap
        int currentLeftHeight = 0,i;
        for (i = 0; i < n; i++) {
            maxLeftHeight[i] = currentLeftHeight;
            currentLeftHeight = max(currentLeftHeight,A[i]);
        }

        // Scanning through the array to find the maxRightHeight for each gap
        int currentRightHeight = 0;
        for (i = n - 1; i >= 0; i--) {
            maxRightHeight[i] = currentRightHeight;
            currentRightHeight = max(currentRightHeight,A[i]);
        }

        // Calculating the total water trapped within the gaps
        int totalWaterTrapped=0;
        for (i = 0; i < n; i++) {
            totalWaterTrapped += max(0, min(maxLeftHeight[i], maxRightHeight[i]) - A[i]);
        }
        return totalWaterTrapped;
}