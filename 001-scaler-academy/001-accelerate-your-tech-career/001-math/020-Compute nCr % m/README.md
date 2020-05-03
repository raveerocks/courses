# Compute <sup>n</sup>C<sub>r</sub> % m

## Problem Description
Given three integers **A**, **B** and **C**, where **A** represents **n**, **B** represents **r** and **C** represents **m**, find and return the value of **<sup>n</sup>C<sub>r</sub> % m** where **<sup>n</sup>C<sub>r</sub> % m= (n!/((n-r)!r!))% m**. **x!** means factorial of x i.e. **x! = 1 * 2 * 3... * x.**   

## Problem Constraints
```
1 <= A * B <= 106 1 <= B <= A 1 <= C <= 106
```

## Input Format
```
The first argument given is integer A ( = n).
The second argument given is integer B ( = r).
The third argument given is integer C ( = m).
```

## Output Format
```
Return the value of nCr % m.
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
  The value of 5C2 % 11 is 10.
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

## Example Explanation
```
 The value of 6C2 % 13 is 2.
```
