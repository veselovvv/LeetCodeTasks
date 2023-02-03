// https://leetcode.com/problems/count-prefixes-of-a-given-string/description/
// You are given a string array words and a string s, where words[i] and s comprise only of lowercase English letters.
// Return the number of strings in words that are a prefix of s.
// A prefix of a string is a substring that occurs at the beginning of the string. A substring is a contiguous sequence of characters within a string.

class Solution {
    fun countPrefixes(words: Array<String>, s: String): Int {
        var count = 0

        words.forEach { word ->
            if (s.startsWith(word)) count++
        }

        return count
    }
}
