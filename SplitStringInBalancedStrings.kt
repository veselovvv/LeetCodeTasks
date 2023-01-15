// https://leetcode.com/problems/split-a-string-in-balanced-strings/description/

// Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
// Given a balanced string s, split it into some number of substrings such that:
// - Each substring is balanced.
// Return the maximum number of balanced strings you can obtain.

class Solution {
    fun balancedStringSplit(s: String): Int {
        var substring = ""
        var result = 0

        s.forEach { char ->
            if (substring.count { it == 'L' } == substring.count { it == 'R' }) {
                substring = ""
                result++
            }
            
            substring += char
        }

        return result
    }
}
