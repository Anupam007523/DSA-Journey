# Roman to Integer

## Platform
LeetCode

## Difficulty
Easy

## Topic
Strings, Hashing (Character Mapping)

## Problem Link
https://leetcode.com/problems/roman-to-integer/

## Approach
Created a helper method to map each Roman numeral character to its corresponding integer value using a `switch` statement. Traversed the string from left to right and compared the current numeral with the next one. If the current value was smaller than the next value, it was subtracted from the total; otherwise, it was added. The last character was always added to the final sum.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Learning
- Learned how to map Roman numeral symbols to their integer values using a helper function.
- Understood the subtractive notation in Roman numerals (e.g., `IV = 4`, `IX = 9`, `XL = 40`).
- Practiced comparing the current and next characters while traversing a string.
- Improved understanding of conditional logic for handling different numeral combinations.

> **Alternative:** This problem can also be solved using a `HashMap<Character, Integer>` instead of a `switch` statement to store the Roman numeral values. Both approaches have the same time complexity, but the `switch` statement is simple and efficient for a fixed set of Roman numeral symbols.

## Status
✅ Solved