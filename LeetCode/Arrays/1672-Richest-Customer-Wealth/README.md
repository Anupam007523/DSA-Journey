# Richest Customer Wealth

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays, Matrix

## Problem Link
https://leetcode.com/problems/richest-customer-wealth/

## Approach
Traversed each customer's accounts using nested loops. For every customer, calculated the sum of all their bank accounts and stored it in `currentSum`. Compared this sum with `maxWealth` and updated the maximum whenever a richer customer's total wealth was found.

Finally, returned the maximum wealth among all customers.

## Time Complexity
O(m × n)

- `m` = Number of customers
- `n` = Number of bank accounts

## Space Complexity
O(1)

> **Key Idea:** Each row in the `accounts` matrix represents one customer, so the task is to calculate the sum of every row and find the maximum among those sums.

## Key Learning
- Learned how to traverse a two-dimensional array using nested loops.
- Practiced calculating the sum of elements in each row.
- Understood how to use `Math.max()` to keep track of the maximum value.
- Learned how matrices can represent real-world data such as customers and their bank accounts.

## Status
✅ Solved