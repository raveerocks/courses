# Summation

## Problem Description
Given an integer **A**. Calculate the sum = **(<sup>A</sup>C<sub>r</sub>) * (r) * (r - 1) * (2<sup>r-2</sup>)** for all **r** from **0** to **A**. Return **sum % 10<sup>9</sup> + 7**. 

## Problem Constraints
```
2 <= A <= 10^6
```

## Input Format
```
The first and only argument given is the integer A.
```

## Output Format
```
Return a single integer denoting sum % 10^9 + 7.
```
## Example 1
```
Input :
  A = 3

Output :
  18
```

## Example Explanation
```
 (ACr) * (r) * (r - 1) * (2r-2)
 r = 0, (1) * (0) * (1) * (1/4) = 0
 r = 1, (3) * (1) * (0) * (1/2) = 0
 r = 2, (3) * (2) * (1) * (1) = 6
 r = 3, (1) * (3) * (2) * (2) = 12
 sum = 18
```
## Example 2
```
Input :
  A = 4

Output :
  108
```
