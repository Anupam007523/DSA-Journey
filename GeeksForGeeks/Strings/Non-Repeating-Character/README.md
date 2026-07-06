# Non Repeating Character

## Platform
GeeksforGeeks

## Difficulty
Easy

## Topic
Strings, Hashing

## Problem Link
https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1

## Approach
Created a frequency array of size `26` to count the occurrences of each lowercase English letter. First, traversed the string to update the frequency of every character. Then, traversed the string again and returned the first character whose frequency was `1`. If no such character existed, returned `'$'`.

## Time Complexity
O(n)

## Space Complexity
O(1)

> **Alternative:** This problem can also be solved using a `HashMap<Character, Integer>` to store character frequencies. Since the input consists of lowercase English letters, using a fixed-size frequency array is more space-efficient and provides constant-time access.

## Key Learning
- Learned how to use a frequency array for counting character occurrences.
- Understood how `s.charAt(i) - 'a'` maps lowercase characters to array indices.
- Practiced solving a problem using two traversals: one for counting frequencies and one for finding the answer.
- Learned that a frequency array is often a better choice than a `HashMap` when the character set is fixed.

## Status
✅ Solved