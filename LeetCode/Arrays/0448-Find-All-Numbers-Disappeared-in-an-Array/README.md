# Find All Numbers Disappeared in an Array

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays

## Problem Link
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

## Approach
Used the array itself for marking visited numbers. For every element, took its absolute value and marked the corresponding index as negative. After marking all present numbers, traversed the array again. The indices that still contained positive values represented the missing numbers.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Learned how to use array indexing to mark visited elements without extra space.
- Understood why `Math.abs()` is necessary after modifying array values.
- Learned an in-place technique that avoids using additional data structures like HashSet or Boolean arrays.

## Status
✅ Solved