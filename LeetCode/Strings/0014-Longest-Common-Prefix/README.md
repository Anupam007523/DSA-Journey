# Longest Common Prefix

## Platform
LeetCode

## Difficulty
Easy

## Topic
Strings

## Problem Link
https://leetcode.com/problems/longest-common-prefix/

## Approach
Assumed the first string as the initial prefix. Traversed through the remaining strings and checked whether each string started with the current prefix using `startsWith()`. If it did not, repeatedly removed the last character of the prefix using `substring()` until it became a valid prefix for the current string. If the prefix became empty, returned an empty string.

## Time Complexity
O(n × m)

- `n` = Number of strings
- `m` = Length of the longest common prefix

## Space Complexity
O(1)

> **Alternative:** Another common approach is to sort the array of strings and compare only the first and last strings. The common prefix between these two strings is the answer, since they will be the most different lexicographically.

## Key Learning
- Learned how to use `startsWith()` to compare string prefixes.
- Understood how `substring()` can be used to gradually reduce a prefix.
- Practiced the horizontal scanning technique for solving string problems.
- Learned how to handle the case where no common prefix exists by returning an empty string.

## Status
✅ Solved