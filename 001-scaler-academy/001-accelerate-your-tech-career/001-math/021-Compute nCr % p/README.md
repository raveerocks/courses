# Compute <sup>n</sup>C<sub>r</sub> % p

## Problem Description
Given three integers **A**, **B** and **C**, where **A** represents **n**, **B** represents **r** and **C** represents **p** and **p** is a prime number greater than equal to **n**, find and return the value of **<sup>n</sup>C<sub>r</sub> % p** where **<sup>n</sup>C<sub>r</sub> % p = (n! / ((n-r)! r!)) % p**. **x!** means factorial of **x** i.e. **x! = 1 * 2 * 3... * x**. 

**NOTE**: For this problem, we are considering 1 as a prime.   

## Problem Constraints
```
1 <= A <= 106
1 <= B <= A
A <= C <= 10^9+7
```

## Input Format
```
The first argument given is the integer A ( = n).
The second argument given is the integer B ( = r).
The third argument given is the integer C ( = p).
```

## Output Format
```
Return the value of nCr % p.
```
## Example 1
```
Input :
  A = 5
  B = 2
  C = 13

Output :
  10
```

## Example Explanation
```
nCr( n=5 and r=2) = 10. p=13.
Therefore, nCr%p = 10.
```
## Example 2
```
Input :
  A = 6
  B = 2
  C = 13

Output :
  2
```
