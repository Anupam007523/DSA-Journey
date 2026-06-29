# Palindrome Number

## Platform
LeetCode

## Difficulty
Easy

## Topic
Math

## Problem Link
https://leetcode.com/problems/palindrome-number/

## Approach
Stored the original number in a separate variable and reversed the digits of the given number using a `while` loop. Compared the reversed number with the original number. If both were equal, the number was a palindrome; otherwise, it was not.

## Time Complexity
O(log n)

## Space Complexity
O(1)

## Key Learning
- Learned how to reverse the digits of an integer using modulo (`%`) and division (`/`).
- Understood the importance of storing the original number before modifying it.
- Practiced comparing the reversed number with the original to determine whether a number is a palindrome.
- Used `long` for the reversed number to safely handle potential overflow during reversal.

## Status
✅ Solved