// https://leetcode.com/problems/truncate-sentence
// A sentence is a list of words that are separated by a single space with no leading or trailing spaces. 
// Each of the words consists of only uppercase and lowercase English letters (no punctuation).
// You are given a sentence s and an integer k. You want to truncate s such that it contains only the first k words. Return s after truncating it.

class Solution {
    fun truncateSentence(s: String, k: Int): String {
        var result = ""
        var words = 0
        
        s.forEach {
            if (words < k) {
                if (it == ' ') words++
                if (words != k) result += it
            }
        }
        
        return result
    }
}
