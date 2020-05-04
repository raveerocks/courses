# Rectangle Area

## Problem Description
Given eight integers **A**, **B**, **C**, **D**, **E**, **F**, **G** and **H** which represent two rectangles in a **2D plane**. <br>For the first rectangle it's bottom left corner is **(A, B)** and top right corner is **(C, D)** and for the second rectangle it's bottom left corner is **(E, F)** and top right corner is **(G, H)**. <br>Find and return the overlapping area of the two rectangles. 

## Problem Constraints
```
-10^4 <= A <= C <= 10^4
-10^4 <= B <= D <= 10^4
-10^4 <= E <= G <= 10^4
-10^4 <= F <= H <= 10^4
```

## Input Format
```
The eight arguments given are the integers A, B, C, D, E, F, G and H.
```

## Output Format
```
Return the overlapping area of the two rectangles.
```
## Example 1
```
Input :
 A = 0   B = 0
 C = 4   D = 4
 E = 2   F = 2
 G = 6   H = 6

Output :
 4
```
## Example 2
```
Input :
 A = 0   B = 0
 C = 4   D = 4
 E = 2   F = 2
 G = 3   H = 3

Output :
 1
```
