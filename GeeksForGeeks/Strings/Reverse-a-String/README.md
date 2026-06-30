# Reverse a String

## Platform
GeeksforGeeks

## Difficulty
Basic

## Topic
Strings, Two Pointers

## Problem Link
https://www.geeksforgeeks.org/problems/reverse-a-string/1

## Approach
Converted the input string into a character array and used the two-pointer technique. One pointer started from the beginning and the other from the end. Swapped the characters at both pointers until they met, then converted the character array back into a string.

## Time Complexity
O(n)

## Space Complexity
O(n)

> **Alternative:** This problem can also be solved using Java's built-in `StringBuilder`:
>
> ```java
> return new StringBuilder(s).reverse().toString();
> ```
>
> This is a shorter and more concise approach, but implementing the two-pointer method helps in understanding string manipulation and in-place swapping.

## Key Learning
- Learned how to convert a `String` into a character array using `toCharArray()`.
- Practiced the two-pointer technique for reversing data.
- Understood how to swap characters using a temporary variable.
- Learned that Java's `StringBuilder` provides a built-in `reverse()` method as a simpler alternative.

## Status
✅ Solved