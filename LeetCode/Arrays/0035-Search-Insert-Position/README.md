# Search Insert Position

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays, Linear Search

## Problem Link
https://leetcode.com/problems/search-insert-position/

## Approach
Traversed the sorted array from left to right using a linear search. At each index, checked if the target was less than or equal to the current element. If the condition was satisfied, returned the current index as the target's position or insertion point. If the target was greater than all elements in the array, returned `nums.length`, indicating that it should be inserted at the end.

## Time Complexity
O(n)

## Space Complexity
O(1)

> **Alternative:** Since the array is sorted, this problem can be solved more efficiently using **Binary Search** in **O(log n)** time. Binary Search is the preferred approach for large input sizes.

## Key Learning
- Practiced traversing a sorted array using a linear search.
- Learned how to determine the correct insertion position when the target is not present.
- Understood the importance of returning `nums.length` when the target is greater than all array elements.
- Learned that Binary Search provides a more efficient solution for sorted arrays.

## Status
✅ Solved