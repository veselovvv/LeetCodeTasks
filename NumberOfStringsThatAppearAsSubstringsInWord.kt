// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
// Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
// A substring is a contiguous sequence of characters within a string.

class Solution {
    fun numOfStrings(patterns: Array<String>, word: String): Int {
        var count = 0
        
        patterns.forEach {
            if (word.contains(it)) count++
        }
        
        return count
    }
}
