# Sorted Permutation Rank

## Problem Description
Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

**Note**: The answer might not fit in an integer, so return your answer % 1000003

## Problem Constraints
```
1 <= len(A) <= 1000
```

## Input Format
```
First argument is a string A.
```

## Output Format
```
Return an integer denoting the rank of the given string.
```
## Example
```
Input 1:
  A = "acb"

Output 1:
  2
```

## Example Explanation
```
Given A = "acd".
The order permutations with letters 'a', 'c', and 'b' : 
abc
acb
bac
bca
cab
cba
So, the rank of A is 2.
```
