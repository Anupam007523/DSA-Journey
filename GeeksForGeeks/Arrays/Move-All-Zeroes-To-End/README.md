# Move All Zeroes to End

## Platform
GeeksforGeeks

## Difficulty
Easy

## Topic
Arrays

## Problem Link
https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1

## Approach
Created a temporary array of the same size as the original array. Traversed the original array and copied all non-zero elements into the temporary array while maintaining their relative order. Filled the remaining positions in the temporary array with `0`s. Finally, copied all elements from the temporary array back to the original array.

## Time Complexity
O(n)

## Space Complexity
O(n)

> **Alternative:** This problem can also be solved in **O(1)** extra space using the two-pointer technique by moving all non-zero elements to the front of the array and filling the remaining positions with zeros.

## Key Learning
- Learned how to preserve the relative order of non-zero elements while moving zeros to the end.
- Practiced using a temporary array for array rearrangement.
- Understood how to copy elements between arrays efficiently.
- Learned that the same problem can be optimized further using the two-pointer approach with constant extra space.

## Status
✅ Solved