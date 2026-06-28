# Alternates in an Array

## Platform
GeeksforGeeks

## Difficulty
Basic

## Topic
Arrays

## Problem Link
https://www.geeksforgeeks.org/problems/alternates-in-an-array/1

## Approach
Traversed the array by incrementing the index by 2, starting from index `0`. At each step, added the current element to an `ArrayList`. This directly collects all elements present at even indices, which represent the required alternate elements.

## Time Complexity
O(n)

## Space Complexity
O(n)

> **Note:** The extra space is required only for the output `ArrayList`. Apart from the returned list, no additional data structure is used.

## Key Learning
- Learned how to traverse an array by skipping elements using `i += 2`.
- Understood how to store selected elements in an `ArrayList`.
- Practiced simple array traversal with custom step sizes.

## Status
✅ Solved