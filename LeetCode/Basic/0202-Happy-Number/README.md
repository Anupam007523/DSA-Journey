# Happy Number

## Platform
LeetCode

## Difficulty
Easy

## Topic
Math

## Problem Link
https://leetcode.com/problems/happy-number/

## Approach
Created a helper method to calculate the sum of the squares of the digits of a number. Repeatedly replaced the number with this sum until it became `1` (happy number) or `4`. The value `4` is a special mathematical observation—every non-happy number eventually enters a cycle that includes `4`. Therefore, reaching `4` guarantees that the number will never become `1`.

## Time Complexity
O(log n)

## Space Complexity
O(1)

> **Alternative:** A common solution uses a `HashSet` to store previously seen numbers and detect cycles. In this approach, the mathematical observation that all non-happy numbers eventually reach `4` eliminates the need for extra space.

## Key Learning
- Learned how to extract digits using `%` and `/`.
- Practiced writing a helper function to compute the sum of the squares of digits.
- Understood the mathematical observation that every non-happy number eventually reaches the cycle containing `4`.
- Learned how cycle detection can sometimes be achieved through mathematical properties instead of using extra data structures like a `HashSet`.

## Status
✅ Solved