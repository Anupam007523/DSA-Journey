# Best Time to Buy and Sell Stock

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays, Greedy, Two Pointers

## Problem Link
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

## Approach
Used two pointers, `left` and `right`, where `left` represents the day to buy and `right` represents the current day to sell.

Traversed the array from left to right. If the selling price was greater than the buying price, calculated the profit and updated `maxProfit` if the current profit was higher.

If the current selling price was less than or equal to the buying price, moved `left` to `right` because the current lower price provides a better opportunity to buy.

The maximum profit found during the traversal was returned.

## Time Complexity
O(n)

## Space Complexity
O(1)

> **Key Idea:** Always keep track of the lowest buying price seen so far and calculate the profit using the current price. This allows the problem to be solved in a single traversal without trying every possible buy-sell combination.

## Key Learning
- Learned how to find the maximum profit from a single buy and sell transaction.
- Practiced the two-pointer technique for array traversal.
- Understood why a lower buying price is always preferable.
- Learned how to solve a stock problem efficiently using a greedy approach.
- Practiced handling edge cases such as `null` arrays and arrays with fewer than two prices.

## Status
✅ Solved