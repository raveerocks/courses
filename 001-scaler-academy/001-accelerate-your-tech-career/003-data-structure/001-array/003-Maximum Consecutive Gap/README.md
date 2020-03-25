# Maximum Consecutive Gap

## Problem Description
Given an unsorted integer array A of size N.
<br>Find the maximum difference between the successive elements in its sorted form. Try to solve it in linear time/space.

You may assume that all the elements in the array are non-negative integers and fit in the 32-bit signed integer range.
<br>You may also assume that the difference will not overflow.

**Return 0 if the array contains less than 2 elements.**   

## Problem Constraints
```
1 <= N <= 1000000 1 <= A[i] <= 1e9
```

## Input Format
```
First argument is an integer array A of size N.
```

## Output Format
```
Return an integer denoting the maximum difference.
```
## For Example
```
Input 1:
    A = [1, 10, 5]
Output 1:
    5
```

## Example Explanation
```
After sorting, the array becomes [1, 5, 10]
Maximum difference is (10 - 5) = 5.
```

