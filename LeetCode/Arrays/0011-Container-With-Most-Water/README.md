# Container With Most Water

## Platform
LeetCode

## Difficulty
Medium

## Topic
Arrays, Two Pointers, Greedy

## Problem Link
https://leetcode.com/problems/container-with-most-water/

## Approach
Used the **Two Pointer** technique with `left` at the beginning and `right` at the end of the array.

For every pair of positions, calculated the container's area using:

`width × minimum height`

where `width = right - left` and the minimum height is the shorter of `height[left]` and `height[right]`.

After calculating the current area, updated `maxWater` if a larger area was found.

To optimize the traversal, moved the pointer with the smaller height. Before moving, stored its current height and skipped all consecutive heights that were less than or equal to it, since they could not produce a better container due to the reduced width.

## Time Complexity
O(n)

## Space Complexity
O(1)

> **Key Idea:** The area of the container is limited by the shorter line. Therefore, moving the pointer at the taller line cannot improve the height limitation while the width decreases. The shorter side must be moved to have a chance of finding a larger area.

## Key Learning
- Learned how to apply the Two Pointer technique to an array.
- Understood why the shorter height determines the amount of water that can be contained.
- Learned how reducing the width affects the possible area.
- Practiced optimizing pointer movement by skipping heights that cannot produce a better result.
- Learned how a seemingly O(n²) problem can be solved in O(n) time.

## Status
✅ Solved