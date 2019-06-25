# UniqueSubstring
Codewars kata

Write a function that takes two strings, A and B, and returns the length of the longest possible substring 
that can be formed from the concatenation of either A + B or B + A 
containing only characters that do not appear in both A and B.

Example:
Given the strings "piquancy" and "refocusing":
A = "piquancy"
B = "refocusing"
A + B = "piquancyrefocusing"
B + A = "refocusingpiquancy"

Since 'i', 'n', 'u', and 'c' appear in both A and B, all acceptable substrings without those characters are:
"p", "q", "a", "yrefo", "s", "g" (from A + B)
"refo", "s", "gp", "q", "a", "y" (from B + A)

Therefore, it would be correct to return 5: the length of "yrefo".
