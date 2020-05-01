#Range Sum

## Problem Description
Given two integers **A** and **B** such that **A** <= **B**. A Function **F** is defined as follows:
```
F[0] = 0
F[1] = 1
F[n] = F[n-1] + F[n-2]; n > 1
```
Function **S(A, B) = F[A] + F[A+1] + F[A+2] + ... + F[B]**. Find and return **S(A, B)** modulo **(10<sup>9</sup>+7)**.  
## Problem Constraints
```
0 <= A <= B <= 10^9
```

## Input Format
```
The arguments given are two integers A and B.
```

## Output Format
```
Return an integer denoting the value of S(A, B) modulo (10^9+7).
```
## Example 1
```
Input :
 A = 0
 B = 3

Output :
 4
```

## Example Explanation 1
```
 F(0) = 0, F(1) = 1, F(2) = 1, F(3) = 2.
 S(0, 3) = F(0) + F(1) + F(2) + F(3) = 0 + 1 + 1 + 2 = 4.
```

## Example 2
```
Input :
 A = 3
 B = 4

Output :
 5
```

## Example Explanation 1
```
  F(3) = 2, F(4) = 3.
  S(3, 4) = F(3) + F(4) = 2 + 3 = 5.
```
