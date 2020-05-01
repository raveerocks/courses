package io.github.raveerocks;

public class Solution {
    private int modulus = 1000000007;

    public int solve(int A, int B) {
        int fibA = fibonacci(A + 1);
        int fibB = fibonacci(B + 2);
        return (fibB - fibA + modulus) % modulus;
    }

    private int fibonacci(int n) {
        long[][] f = {{1, 1}, {1, 0}};
        long fib[][] = matrixExponentiation(f, n - 1);
        return (int) fib[0][0];
    }

    private long[][] matrixExponentiation(long base[][], int exponent) {
        long[][] result = {{1, 0}, {0, 1}};
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = matrixMultiplication(result, base);
            }
            base = matrixMultiplication(base, base);
            exponent >>= 1;
        }
        return result;
    }

    private long[][] matrixMultiplication(long A[][], long B[][]) {
        long c[][] = new long[2][2];

        c[0][0] = ((A[0][0] * B[0][0]) + (A[0][1] * B[1][0])) % modulus;
        c[0][1] = ((A[0][0] * B[0][1]) + (A[0][1] * B[1][1])) % modulus;
        c[1][0] = ((A[1][0] * B[0][0]) + (A[1][1] * B[1][0])) % modulus;
        c[1][1] = ((A[1][0] * B[0][1]) + (A[1][1] * B[1][1])) % modulus;
        return c;
    }

}
