# Max Consecutive Ones

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays

## Problem Link
https://leetcode.com/problems/max-consecutive-ones/

## Approach
Traversed the array once while keeping track of the current streak of consecutive `1`s. Whenever a `1` was encountered, the count was incremented and the maximum streak was updated if needed. When a `0` was encountered, the count was reset to `0`.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Learned how to maintain a running count while traversing an array.
- Practiced updating the maximum value during iteration.
- Understood how to reset a counter when the required sequence is interrupted.

## Status
✅ Solved