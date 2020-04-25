module.exports = {
 //param A : array of integers
 //return an integer
	trap : function(A){

	n = A.length;
	maxLeftHeight=[]
	maxRightHeight=[]

	 // Scanning through the array to find the maxLeftHeight for each gap
        currentLeftHeight = 0;
        for (i = 0; i < n; i++) {
            maxLeftHeight[i] = currentLeftHeight;
            currentLeftHeight = Math.max(currentLeftHeight,A[i]);
        }

        // Scanning through the array to find the maxRightHeight for each gap
        currentRightHeight = 0;
        for (i = n - 1; i >= 0; i--) {
            maxRightHeight[i] = currentRightHeight;
            currentRightHeight = Math.max(currentRightHeight,A[i]);
        }


        // Calculating the total water trapped within the gaps
        totalWaterTrapped=0;
        for (i = 0; i < n; i++) {
            totalWaterTrapped += Math.max(0, Math.min(maxLeftHeight[i], maxRightHeight[i]) - A[i]);
        }
        return totalWaterTrapped;

	}
};
