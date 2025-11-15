# KMP String Matching Algorithm — Bonus Task

This project implements the Knuth–Morris–Pratt (KMP) string-search algorithm in Java.  
The implementation is split into four classes for clarity and structure:
- LPSBuilder.java
- KMPSearch.java
- TestCases.java
- Main.java

## Test Strings
Short string:
ababcabc

Medium string:
abcxabcdabxabcdabcdabcy

Long string:
aaaaabaaaaabaaaaabaaaaabaaaaab

Patterns tested:
- abc
- abcdabcy
- aaaaab

## Sample Output
Pattern found at index 2  
Pattern found at index 15  
Pattern found at index 0

## Time Complexity
Preprocessing (LPS): O(m)  
Search: O(n)  
Overall: **O(n + m)**

## Space Complexity
LPS array: O(m)

## Summary
The project demonstrates a clean implementation of KMP and includes tests on three different string sizes to observe the algorithm's behavior under varying conditions.