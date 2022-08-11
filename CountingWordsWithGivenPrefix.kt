// https://leetcode.com/problems/counting-words-with-a-given-prefix/
// You are given an array of strings words and a string pref. Return the number of strings in words that contain pref as a prefix.
// A prefix of a string s is any leading contiguous substring of s.

class Solution {
    fun prefixCount(words: Array<String>, pref: String): Int {
        var count = 0
       
        words.forEach {
            if (it.startsWith(pref)) count++
        }
        
        return count
    }
}
