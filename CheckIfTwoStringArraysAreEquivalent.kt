// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent
// Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
// A string is represented by an array if the array elements concatenated in order forms the string.

class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        var string1 = ""
        var string2 = ""
        
        word1.forEach {
            string1 += it
        }
        
        word2.forEach {
            string2 += it
        }
        
        return string1 == string2
    }
}
