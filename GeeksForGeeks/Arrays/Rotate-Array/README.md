# Rotate Array

## Platform
GeeksforGeeks

## Difficulty
Medium

## Topic
Arrays

## Problem Link
https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements/1

## Approach
First, calculated `d % n` to handle cases where the number of rotations was greater than the array size. Created a temporary array and copied the elements from index `d` to the end, followed by the first `d` elements. Finally, copied the contents of the temporary array back to the original array, resulting in a left-rotated array.

## Time Complexity
O(n)

## Space Complexity
O(n)

> **Alternative:** This problem can also be solved in **O(1)** extra space using the **Array Reversal Algorithm**:
> 1. Reverse the first `d` elements.
> 2. Reverse the remaining `n - d` elements.
> 3. Reverse the entire array.
>
> This approach performs the rotation in-place without using a temporary array.

## Key Learning
- Learned how to perform left rotation using a temporary array.
- Understood why `d = d % n` is necessary to avoid redundant full rotations and out-of-bounds issues.
- Practiced copying array elements in different ranges to achieve rotation.
- Learned that array rotation can also be performed in-place using the reversal algorithm.

## Status
✅ Solved