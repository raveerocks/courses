# Victory

## Problem Description
Given three integers **A**, **B**, **C**. Probability of India winning a match against Pakistan is **1/B**.
Find the probability **P** of India winning **C<sup>th</sup>** match in its **A<sup>th</sup>** Match against Pakistan. 
If **P = Q/R**, return **(Q * (R-1)) modulo 10<sup>9</sup>+7**. 

**NOTE**: India should win **A<sup>th</sup>** match and that should be **C<sup>th</sup>** win of India in total.   

## Problem Constraints
```
1 <= A <= 109
1 <= B <= 102
1 <= C <= 109
1 <= C <= A
0 <= A - C <= 106
```

## Input Format
```
The first argument given is integer A. The Second argument given is integer B. The Third argument given is integer C.   
```

## Output Format
```
Find the probability P of India winning Cth match in its Ath Match against Pakistan. If P = Q/R, return (Q * (R-1)) modulo 10^9+7.   
```
## Example 1
```
Input :
  A = 2
  B = 2
  C = 2

Output :
  250000002
```

## Example Explanation
```
P = W W = ( 1/2 )*( 1/2 ) = 1/4 = (1) * (4^(-1)) mod 10^9+7 = 250000002
```
## Example 2
```
Input :
  A = 3
  B = 3
  C = 2

Output :
  481481485
```

## Example Explanation
```
P = W L W + L W W = ( 1/3 ) * ( 2/3 ) * ( 1/3 ) + ( 2/3 ) * ( 1/3 ) * ( 1/3 ) = 4/27
```

