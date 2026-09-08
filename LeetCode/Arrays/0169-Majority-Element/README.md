# Majority Element

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays, Sorting

## Problem Link
https://leetcode.com/problems/majority-element/

## Approach
Used **Sorting** to find the majority element.

First, sorted the array using `Arrays.sort(nums)`.

Since the majority element appears **more than `n / 2` times**, after sorting, it is guaranteed to occupy the middle position of the array.

Therefore, returned:

`nums[nums.length / 2]`

## Time Complexity
O(n log n)

## Space Complexity
O(1) auxiliary space

> **Alternative:** The **Boyer-Moore Voting Algorithm** can solve this problem in O(n) time and O(1) space without sorting.

> **Key Idea:** If an element appears more than half the time, it must be present at the middle index after the array is sorted.

## Key Learning
- Learned how sorting can simplify array-based problems.
- Understood why the majority element must occupy the middle position after sorting.
- Practiced using `Arrays.sort()`.
- Learned that Boyer-Moore Voting can further optimize the solution to O(n).

## Status
✅ Solved