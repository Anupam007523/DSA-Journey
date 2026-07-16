# Search Insert Position

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays, Binary Search

## Problem Link
https://leetcode.com/problems/search-insert-position/

## Approach
Applied Binary Search to efficiently find the target element in the sorted array. Maintained two pointers, `low` and `high`, and repeatedly checked the middle element. If the target was found, returned its index. Otherwise, adjusted the search range based on whether the target was smaller or larger than the middle element. When the search ended, `low` represented the correct position where the target should be inserted to maintain the sorted order.

## Time Complexity
O(log n)

## Space Complexity
O(1)

> **Alternative:** A linear search can also be used by traversing the array until an element greater than or equal to the target is found. However, this approach takes **O(n)** time, whereas Binary Search is much more efficient for sorted arrays.

## Key Learning
- Learned how to apply Binary Search on a sorted array.
- Understood why `low + (high - low) / 2` is preferred over `(low + high) / 2` to avoid integer overflow.
- Practiced updating the search range using `low` and `high`.
- Learned that after Binary Search ends, `low` points to the correct insertion position if the target is not present.

## Status
✅ Solved