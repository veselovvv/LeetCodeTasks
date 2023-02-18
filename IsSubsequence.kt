// https://leetcode.com/problems/is-subsequence/description/
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing 
// the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var sIndex = 0
        var substring = ""

        t.forEachIndexed { index, char ->
            if (substring == s)
                return true
            else if (s != "" && char == s.get(sIndex)) {
                substring += char
                sIndex++
            }
        }

        return substring == s
    }
}
