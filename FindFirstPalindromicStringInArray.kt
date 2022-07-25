// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
// Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
// A string is palindromic if it reads the same forward and backward.

class Solution {
    fun firstPalindrome(words: Array<String>): String {
        words.forEach {
            if (it == it.reversed()) return it
        }
        
        return ""
    }
}
