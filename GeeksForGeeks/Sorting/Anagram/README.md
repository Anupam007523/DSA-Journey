# Anagrams

## Platform
GeeksforGeeks

## Difficulty
Easy

## Topic
Strings, Sorting

## Problem Link
https://www.geeksforgeeks.org/problems/anagram-1587115620/1

## Approach
First, checked whether the lengths of both strings were equal. If they were different, returned `false` immediately since strings of different lengths cannot be anagrams. Converted both strings into character arrays, sorted them using `Arrays.sort()`, and then compared the sorted arrays using `Arrays.equals()`. If both arrays were identical, the strings were anagrams.

## Time Complexity
O(n log n)

## Space Complexity
O(n)

> **Alternative:** This problem can also be solved in **O(n)** time using a frequency array (for lowercase English letters) or a `HashMap` (for general characters), avoiding the need to sort the strings.

## Key Learning
- Learned how to convert a string into a character array using `toCharArray()`.
- Practiced sorting character arrays with `Arrays.sort()`.
- Understood how `Arrays.equals()` is used to compare two arrays.
- Learned why checking the string lengths first is an important optimization.

## Status
✅ Solved