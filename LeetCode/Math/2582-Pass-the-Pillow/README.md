# Pass the Pillow

## Platform
LeetCode

## Difficulty
Easy

## Topic
Math, Simulation

## Problem Link
https://leetcode.com/problems/pass-the-pillow/

## Approach
Used the repeating pattern of the pillow's movement to solve the problem in O(1) time.

The pillow moves from person `1` to person `n` and then back to person `1`. Therefore, one complete cycle takes:

`2 × (n - 1)`

Used `time % cycle` to eliminate all complete cycles that do not affect the final position.

- If the remaining time `t` is within the forward journey (`t <= n - 1`), the person is `1 + t`.
- Otherwise, the pillow is moving backward, so the position is calculated using `n - (t - (n - 1))`.

## Time Complexity
O(1)

## Space Complexity
O(1)

> **Optimization:** The previous simulation solution processed every unit of time, resulting in **O(time)** complexity. This optimized solution identifies the repeating cycle and directly calculates the final position, reducing the complexity to **O(1)**.

## Key Learning
- Learned how to identify a repeating cycle in a simulation problem.
- Understood why one complete cycle has `2 × (n - 1)` steps.
- Practiced using the modulo operator to eliminate unnecessary complete cycles.
- Learned how mathematical observation can convert an O(time) simulation into an O(1) solution.
- Improved understanding of forward and backward movement within a repeating sequence.

## Status
✅ Optimized Solution