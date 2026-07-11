# Count Digits

## Platform
GeeksforGeeks

## Difficulty
Basic

## Topic
Mathematics

## Problem Link
https://www.geeksforgeeks.org/problems/count-digits5716/1

## Approach
Repeatedly extracted the last digit of the number using the modulo (`%`) operator and removed it using integer division (`/`). Increased a counter during each iteration until the number became `0`. The final count represented the total number of digits in the given number.

## Time Complexity
O(log₁₀ n)

## Space Complexity
O(1)

> **Alternative:** The number of digits can also be found using the logarithmic formula:
>
> ```java
> int digits = (int) Math.floor(Math.log10(n)) + 1;
> ```
>
> This approach works only for positive numbers and requires special handling when `n = 0`.

## Key Learning
- Learned how to extract digits using the modulo (`%`) operator.
- Understood how integer division (`/`) removes the last digit of a number.
- Practiced counting the number of digits without converting the number to a string.
- Learned that logarithms provide another efficient way to determine the number of digits.

## Status
✅ Solved