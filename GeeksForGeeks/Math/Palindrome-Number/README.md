# Palindrome Number

## Platform
GeeksforGeeks

## Difficulty
Easy

## Topic
Mathematics

## Problem Link
https://www.geeksforgeeks.org/problems/palindrome0746/1

## Approach
Converted the given number to its absolute value to handle negative inputs. Reversed the digits of the number using modulo (`%`) and division (`/`) operations. Finally, compared the reversed number with the absolute value of the original number. If both were equal, the number was a palindrome.

## Time Complexity
O(log n)

## Space Complexity
O(1)

> **Note:** This solution uses `Math.abs()` so that negative numbers are treated based on their absolute value. This behavior follows the requirements of the GeeksforGeeks problem and differs from the LeetCode version, where negative numbers are always considered non-palindromes.

## Key Learning
- Learned how to reverse the digits of a number using arithmetic operations.
- Understood the use of `Math.abs()` for handling negative inputs.
- Practiced comparing the reversed number with the original number to determine whether it is a palindrome.
- Reinforced the use of modulo (`%`) and division (`/`) for digit extraction.

## Status
✅ Solved