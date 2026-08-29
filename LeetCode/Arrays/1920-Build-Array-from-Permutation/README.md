# Build Array from Permutation

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays

## Problem Link
https://leetcode.com/problems/build-array-from-permutation/

## Approach
Created a new array `ans` of the same length as `nums`. Traversed the given array and, for each index `i`, assigned:

`ans[i] = nums[nums[i]]`

Since `nums` is a permutation where every value is a valid index, `nums[nums[i]]` directly gives the required value for each position.

## Time Complexity
O(n)

## Space Complexity
O(n)

> **Alternative:** This problem can also be solved by modifying the original array in-place using mathematical encoding, achieving **O(1)** extra space. However, using a separate array is simpler and easier to understand.

## Key Learning
- Learned how to access array elements using values from the same array as indices.
- Practiced creating and filling a new array during traversal.
- Understood the concept of a permutation array.
- Learned the difference between using extra space and solving a problem in-place.

## Status
✅ Solved