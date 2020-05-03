# Factorial Array

## Problem Description
Groot has an array A of size N. Boring right? Groot thought so too, so he decided to construct another array B of the same size and defined elements of B as: B[i] = factorial of A[i] for every i such that 1<= i <= N.    
factorial of a number X denotes (1 x 2 x 3 x 4......(X-1) x (X)).
 Now Groot is interested in the total number of non-empty subsequences of array B such that every element in the subsequence has the same non empty set of prime factors. Since the number can be very large, return it modulo 109 + 7. NOTE: A set is a data structure having only distinct elements. Eg : the set of prime factors of Y=12 will be {2,3} and not {2,2,3}

## Problem Constraints
```
1 <= N <= 105
1 <= A[i] <= 106
Your code will run against a maximum of 5 test cases.
```

## Input Format
```
Only argument is an integer array A of size N.
```

## Output Format
```
Return an integer deonting the total number of non-empty subsequences of array B such that every element in the subsequence has the same set of prime factors modulo 109+7.
```
## Example 1
```
Input :
     A = [2, 3, 2, 3]

Output :
    6
```

## Example Explanation
```
 Array B will be : [2, 6, 2, 6]
 The total possible subsequences are 6 : [2], [2], [2, 2], [6], [6], [6, 6].
```

## Example 2
```
Input :
      A = [2, 3, 4]

Output :
    4
```

## Example Explanation
```
 Array B will be : [2, 6, 24]
 The total possible subsequences are 4 : [2], [6], [24], [6, 24].
```
