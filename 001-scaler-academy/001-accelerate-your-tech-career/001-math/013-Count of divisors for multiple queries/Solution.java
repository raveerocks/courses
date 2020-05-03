package io.github.raveerocks;

public class Solution {
    
    public int[] solve(int[] A) {

        int n = A.length;

        // Calculating max to determine the sieve array length
        int max = A[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, A[i]);
        }

        // 1 is divisor of every number hence initialized with 1
        int divisorsCount[] = new int[max + 1];
        Arrays.fill(divisorsCount,1);

        // Counting rest of the divisors
        for (int i = 2; i <= max; i++) {
            for (int j = i; j <= max; j +=i) {
                    divisorsCount[j]++;
            }
        }

        // Preparing and returning the query result 
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = divisorsCount[A[i]];
        }
        return result;
    }
}
