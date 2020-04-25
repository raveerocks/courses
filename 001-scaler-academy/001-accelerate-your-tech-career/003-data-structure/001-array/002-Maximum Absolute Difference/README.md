# Maximum Absolute Difference

## Problem Description
You are given an array of N integers, A<sub>1</sub>, A<sub>2</sub> ,..., A<sub>N</sub>.

Return the maximum value of **`f(i, j)`** for all 1 ≤ i, j ≤ N.  **`f(i, j)`** is defined as **`|A[i] - A[j]| + |i - j|`**, where |x| denotes absolute value of x.

## Problem Constraints
```
1 <= N <= 100000 -1e9 <= A[i] <= 1e9
```

## Input Format
```
First argument is an integer of size N.
```

## Output Format
```
Return an integer denoting the maximum value of f(i, j).
```
## For Example
```
Input 1:
    A = [1, 3, -1]
Output 1:
    5
```

## Example Explanation
```
f(1, 1) = f(2, 2) = f(3, 3) = 0
f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

So, we return 5.
```


