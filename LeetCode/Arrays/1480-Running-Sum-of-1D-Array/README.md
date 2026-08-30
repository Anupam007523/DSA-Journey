# Running Sum of 1D Array

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays, Prefix Sum

## Problem Link
https://leetcode.com/problems/running-sum-of-1d-array/

## Approach
Used a variable `sum` to maintain the cumulative sum while traversing the array from left to right. At each index, added the current element to `sum` and replaced the original element with the updated cumulative sum.

This modifies the input array directly and returns it as the result.

For example:

`[1, 2, 3, 4] → [1, 3, 6, 10]`

## Time Complexity
O(n)

## Space Complexity
O(1)

> **Key Idea:** Each element in the resulting array represents the sum of all elements from index `0` to the current index. This is the basic concept of a **Prefix Sum**.

## Key Learning
- Learned how to calculate a running or cumulative sum.
- Understood the basic concept of a prefix sum.
- Practiced updating an array in-place.
- Learned how a single variable can maintain cumulative information during array traversal.

## Status
✅ Solved