// https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/
// Two strings word1 and word2 are considered almost equivalent if the differences between the frequencies of each letter from 'a' to 'z' between word1 and word2 
// is at most 3. Given two strings word1 and word2, each of length n, return true if word1 and word2 are almost equivalent, or false otherwise.
// The frequency of a letter x is the number of times it occurs in the string.

class Solution {
    fun checkAlmostEquivalent(word1: String, word2: String): Boolean {
        var countInWord1 = 0
        var countInWord2 = 0
        var difference = 0
        var maxDifference = 0
        
        word1.forEach { letter ->
            countInWord1 = word1.filter { it == letter }.length
            countInWord2 = word2.filter { it == letter }.length
            
            difference = if (countInWord1 > countInWord2) countInWord1 - countInWord2 
            else countInWord2 - countInWord1
            
            if (difference > maxDifference) maxDifference = difference
        }
        
        word2.forEach { letter ->
            countInWord1 = word1.filter { it == letter }.length
            countInWord2 = word2.filter { it == letter }.length
            
            difference = if (countInWord1 > countInWord2) countInWord1 - countInWord2 
            else countInWord2 - countInWord1
            
            if (difference > maxDifference) maxDifference = difference
        }
        
        return maxDifference <= 3
    }
}
