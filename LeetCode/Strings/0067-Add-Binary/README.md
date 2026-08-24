# Add Binary

## Platform
LeetCode

## Difficulty
Easy

## Topic
Strings, Math

## Problem Link
https://leetcode.com/problems/add-binary/

## Approach
Used the two-pointer technique to traverse both binary strings from right to left, similar to normal binary addition. Added the current digits along with the `carry`, stored the resulting bit using `sum % 2`, and updated the carry using `sum / 2`. Continued until both strings and the carry were completely processed. Since the result was generated from right to left, reversed the `StringBuilder` at the end.

## Time Complexity
O(max(n, m))

## Space Complexity
O(max(n, m))

> **Alternative:** Java does not need to convert the binary strings into decimal integers. Direct string-based addition is safer for very large binary numbers because converting them to an integer type can cause overflow.

## Key Learning
- Learned how to perform binary addition manually using `carry`.
- Practiced traversing strings from right to left using two pointers.
- Understood how `% 2` gives the resulting binary digit and `/ 2` gives the carry.
- Learned how `StringBuilder` can efficiently construct and reverse the result.
- Understood how to handle binary strings of different lengths.

## Status
✅ Solved