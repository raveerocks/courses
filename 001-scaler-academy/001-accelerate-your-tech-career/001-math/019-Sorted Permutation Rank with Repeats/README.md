# Sorted Permutation Rank with Repeats

## Problem Description
Given a string **A**, find the rank of the string amongst its permutations sorted lexicographically. Note that the characters might be repeated. If the characters are repeated, we need to look at the rank in unique permutations. Look at the example for more details. 

**Note**: The answer might not fit in an integer, so return your answer % 1000003 where 1000003 is a prime number. 

## Problem Constraints
```
0 < len(A) < 1000003
```

## Input Format
```
First argument is a string A.
```

## Output Format
```
Return an integer denoting the rank.
```
## Example
```
Input 1:
  A = "aba"

Output 1:
  2
```

## Example Explanation
```
The order permutations with letters 'a', 'a', and 'b' :
aab
aba
baa
So, the rank is 2.
```
