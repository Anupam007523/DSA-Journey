# Valid Palindrome

## Platform
LeetCode

## Difficulty
Easy

## Topic
Strings, Two Pointers

## Problem Link
https://leetcode.com/problems/valid-palindrome/

## Approach
Used two pointers, `left` and `right`, starting from the beginning and end of the string.

Before comparing characters, skipped all non-alphanumeric characters using `Character.isLetterOrDigit()`. Then converted both characters to lowercase using `Character.toLowerCase()` to perform a case-insensitive comparison.

If the characters were different, returned `false`. Otherwise, moved both pointers toward the center. If all valid characters matched, returned `true`.

## Time Complexity
O(n)

## Space Complexity
O(1)

> **Key Idea:** Instead of creating a new cleaned string by removing spaces and special characters, the two-pointer approach skips unwanted characters directly. This saves extra space.

## Key Learning
- Learned how to use the two-pointer technique for string problems.
- Practiced skipping non-alphanumeric characters using `Character.isLetterOrDigit()`.
- Learned how to perform case-insensitive comparison using `Character.toLowerCase()`.
- Understood how to check a palindrome without creating an additional string.
- Improved understanding of efficient in-place string traversal.

## Status
✅ Solved