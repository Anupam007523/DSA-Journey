# Plus One

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays, Math

## Problem Link
https://leetcode.com/problems/plus-one/

## Approach
Started from the last digit of the array because adding `1` affects the number from right to left. If the current digit is `9`, changed it to `0` and continued to the previous digit because a carry was generated. If the digit was less than `9`, incremented it by `1` and returned the array immediately.

If all digits were `9`, every digit became `0`, so created a new array of size `n + 1` and placed `1` at the first position.

## Time Complexity
O(n)

## Space Complexity
O(1)

> **Note:** The solution uses O(1) extra space for the normal case because the input array is modified directly. In the special case where all digits are `9`, a new array of size `n + 1` is required.

## Key Learning
- Learned how to perform addition directly on an array representing a large integer.
- Practiced handling carry propagation from right to left.
- Understood why `9` needs special handling when adding `1`.
- Learned how to handle the important edge case where all digits are `9`, such as `999 + 1 = 1000`.
- Avoided converting the array into an integer, which would cause overflow for very large numbers.

## Status
✅ Solved