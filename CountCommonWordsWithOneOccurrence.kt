// https://leetcode.com/problems/count-common-words-with-one-occurrence/description/
// Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.

class Solution {
    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        var count = 0

        val shortestArray = 
            if (words1.size < words2.size) words1 else words2

        shortestArray.forEach { word ->
            if (words1.count { it == word } == 1 && words2.count { it == word } == 1) count++
        }

        return count
    }
}
