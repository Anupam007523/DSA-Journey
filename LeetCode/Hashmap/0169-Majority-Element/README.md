# Majority Element

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays, HashMap, Counting

## Problem Link
https://leetcode.com/problems/majority-element/

## Approach
Used a **HashMap** to store the frequency of each element.

For every number in the array:
1. Get its current count using `getOrDefault()`.
2. Increase the count by `1`.
3. Store the updated count back in the HashMap.
4. If the count becomes greater than `n / 2`, immediately return that number.

Since the majority element is guaranteed to appear more than `n / 2` times, it will be found during the traversal.

## Time Complexity
O(n)

## Space Complexity
O(n)

> **Key Idea:** Keep track of the frequency of each number and return as soon as any number appears more than `n / 2` times.

> **Alternative:** The **Boyer-Moore Voting Algorithm** can solve this problem in O(n) time and O(1) space.

## Key Learning
- Learned how to use a `HashMap` for frequency counting.
- Practiced using `getOrDefault()` in Java.
- Learned how to return early when the majority condition is satisfied.
- Understood the trade-off between sorting, HashMap, and Boyer-Moore approaches.

## Status
✅ Solved