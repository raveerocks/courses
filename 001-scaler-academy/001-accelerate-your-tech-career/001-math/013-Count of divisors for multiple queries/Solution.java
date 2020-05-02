public class Solution {

    public int[] solve(int[] A) {

        int n = A.length;

        int max = 1;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, A[i]);
        }

        int divisorsCount[] = new int[max + 1];

        for (int i = 0; i <= max; i++) {
            divisorsCount[i] = 1;
        }

        for (int i = 2; i <= max; i++) {
            for (int j = i; j <= max; j +=i) {
                divisorsCount[j]++;
            }
        }


        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = divisorsCount[A[i]];
        }
        return result;
    }
}
