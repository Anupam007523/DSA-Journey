# Remove Duplicates from Sorted Array

## Platform
LeetCode

## Difficulty
Easy

## Topic
Arrays, Two Pointers

## Problem Link
https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Approach
Used the two-pointer technique to remove duplicates in-place. The first pointer (`i`) tracked the position of the last unique element, while the second pointer (`j`) traversed the array. Whenever a new unique element was found, `i` was incremented and the element was placed at index `i`. Finally, returned `i + 1`, which represents the number of unique elements.

## Time Complexity
O(n)

## Space Complexity
O(1)

> **Alternative:** Although a `HashSet` can be used to remove duplicates, it requires extra space. The two-pointer approach is optimal because the array is already sorted and satisfies the in-place requirement of the problem.

## Key Learning
- Learned how to use the two-pointer technique on a sorted array.
- Understood how to modify an array in-place without using extra memory.
- Practiced maintaining the index of the last unique element.
- Learned why sorted arrays make duplicate removal more efficient.

## Status
✅ Solved