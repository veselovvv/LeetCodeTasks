// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
// A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        var result = true
        
        for (letter in 'a'..'z') {
            if (!sentence.contains(letter)) result = false
        }
        
        return result
    }
}
