# Pubg

## Problem Description
There are N players each with strength A[i]. when player i attack player j, player j strength reduces to max(0, A[j]-A[i]). When a player's strength reaches zero, it loses the game and the game continues in the same manner among other players until only 1 survivor remains.

Can you tell the minimum health last surviving person can have?

## Problem Constraints
```
1 <=  N    <= 100000
1 <=  A[i] <= 1000000
```

## Input Format
```
First and only argument of input contains a single integer array A.
```

## Output Format
```
Return a single integer denoting minimum health of last person.
```
## Example 1
```
Input 1:
     A = [6, 4]
     
Output 1:
    2
```

## Example Explanation
```
 Second player attack first player. [2, 4]
 First player attack second player twice. [2, 0]
```

## Example 2
```
Input 2:
      A = [2, 3, 4]
      
Output 2:
    1
```


