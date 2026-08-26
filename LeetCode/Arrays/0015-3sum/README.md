# 3Sum

## Platform
LeetCode

## Difficulty
Medium

## Topic
Arrays, Sorting, HashSet

## Problem Link
https://leetcode.com/problems/3sum/

## Approach
First, sorted the array to make it easier to handle duplicate values. Used the first element as a fixed value and then traversed the remaining elements using a `HashSet`.

For every pair of elements, calculated the required third value using:

`required = -(nums[i] + nums[j])`

Checked whether this required value was already present in the `HashSet`. If it was, a valid triplet whose sum was `0` was found and added to the result.

Skipped duplicate values for the fixed element and also skipped consecutive duplicates for the second element to avoid adding duplicate triplets.

## Time Complexity
O(n²)

## Space Complexity
O(n)

> **Alternative:** The most common optimized approach uses **Sorting + Two Pointers**, which also runs in O(n²) time but uses only O(1) extra space apart from the output. This is generally preferred for the 3Sum problem.

## Key Learning
- Learned how sorting can simplify duplicate handling.
- Practiced using a `HashSet` to find a required element efficiently.
- Understood how to convert the 3Sum problem into a two-sum search for each fixed element.
- Learned why duplicate values must be carefully skipped to avoid duplicate triplets.
- Understood that the two-pointer approach can reduce the extra space used by the HashSet.

## Status
✅ Solved