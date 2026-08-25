# Sqrt(x)

## Platform
LeetCode

## Difficulty
Easy

## Topic
Math, Binary Search

## Problem Link
https://leetcode.com/problems/sqrtx/

## Approach
Used **Binary Search** to find the integer square root without using any built-in power or square-root functions.

For a given `mid`, checked whether `mid` could be a valid square root by comparing `mid` with `x / mid` instead of calculating `mid * mid`. This avoids integer overflow for large values of `x`.

If `mid <= x / mid`, `mid` was a possible answer, so stored it in `ans` and searched for a larger value. Otherwise, searched in the left half.

The largest valid `mid` found was returned as the integer square root rounded down.

## Time Complexity
O(log n)

## Space Complexity
O(1)

> **Important:** Instead of using `mid * mid <= x`, the solution uses `mid <= x / mid`. This prevents overflow because `x` can be as large as `2³¹ - 1`.

## Key Learning
- Learned how to apply **Binary Search** to mathematical problems.
- Understood how to find the integer square root without using `Math.sqrt()` or `Math.pow()`.
- Learned why `mid <= x / mid` is safer than `mid * mid <= x`.
- Practiced maintaining the largest valid answer using the `ans` variable.
- Understood how Binary Search can be used even when the problem does not explicitly involve searching an array.

## Status
✅ Solved