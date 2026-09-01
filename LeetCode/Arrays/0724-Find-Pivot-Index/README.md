# Find Pivot Index

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays, Prefix Sum

## Problem Link
https://leetcode.com/problems/find-pivot-index/

## Approach
First, calculated the total sum of all elements in the array.

Then traversed the array while maintaining `leftSum`, which represents the sum of all elements to the left of the current index.

For each index, calculated the right-side sum using:

`rightSum = totalSum - leftSum - nums[i]`

If `leftSum` was equal to the right-side sum, the current index was the pivot index and was returned.

After checking the current index, added `nums[i]` to `leftSum` and continued.

If no pivot index was found, returned `-1`.

## Time Complexity
O(n)

## Space Complexity
O(1)

> **Key Idea:** Instead of calculating the left and right sums separately for every index, calculate the total sum once and maintain a running `leftSum`. This allows the right sum to be found in O(1) time.

## Key Learning
- Learned how to use the prefix sum concept.
- Practiced maintaining a running sum while traversing an array.
- Understood how to calculate the right-side sum using the total sum.
- Avoided using nested loops, reducing the solution from O(n²) to O(n).
- Learned how mathematical relationships can simplify array problems.

## Status
✅ Solved