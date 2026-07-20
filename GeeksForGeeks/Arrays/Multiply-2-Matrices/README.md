# Matrix Multiplication

## Platform
GeeksforGeeks

## Difficulty
Medium

## Topic
Matrices

## Problem Link
https://www.geeksforgeeks.org/problems/matrix-multiplication0303/1

## Approach
Used three nested loops to perform matrix multiplication. The outer two loops traversed each cell of the resulting matrix, while the innermost loop calculated the dot product of the corresponding row of the first matrix and the column of the second matrix. Stored the computed values in an `ArrayList<ArrayList<Integer>>` and returned the resulting matrix.

## Time Complexity
O(n³)

## Space Complexity
O(n²)

> **Alternative:** For very large matrices, advanced algorithms such as **Strassen's Algorithm** can reduce the time complexity. However, the standard triple-loop approach is simpler, easier to understand, and commonly used for interview and competitive programming problems.

## Key Learning
- Learned the standard algorithm for matrix multiplication.
- Understood how rows of the first matrix are multiplied with columns of the second matrix.
- Practiced using three nested loops for matrix operations.
- Learned how to store a two-dimensional result using `ArrayList<ArrayList<Integer>>`.

## Status
✅ Solved