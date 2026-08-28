# Pass the Pillow

## Platform
LeetCode

## Difficulty
Easy

## Topic
Simulation, Arrays

## Problem Link
https://leetcode.com/problems/pass-the-pillow/

## Approach
Simulated the movement of the pillow between the people. Started with person `1` and a direction of `1`, representing movement from left to right.

For every unit of time, moved the pillow to the next person. When the pillow reached person `n`, reversed the direction. Similarly, when it reached person `1`, changed the direction back to forward.

Continued this process until `time` became `0`, then returned the person holding the pillow.

## Time Complexity
O(time)

## Space Complexity
O(1)

> **Alternative:** The problem can also be solved mathematically using the repeating cycle of `2 × (n - 1)`, which reduces the time complexity to **O(1)**. The simulation approach is simpler and directly represents how the pillow moves.

## Key Learning
- Learned how to simulate movement using a `direction` variable.
- Practiced changing direction when reaching the boundaries.
- Understood how to model a back-and-forth process using simple conditions.
- Learned that repetitive simulation problems can often be optimized by identifying their mathematical cycle.

## Status
✅ Solved