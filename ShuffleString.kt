// https://leetcode.com/problems/shuffle-string/description/

// You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to 
// indices[i] in the shuffled string.
// Return the shuffled string.

class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        var i = 0
        var result = CharArray(s.length)

        while (i != s.length) {
            result.set(indices[i], s[i])
            i++
        }

        return String(result)
    }
}
