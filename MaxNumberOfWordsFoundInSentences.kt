// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences
// A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
// You are given an array of strings sentences, where each sentences[i] represents a single sentence.
// Return the maximum number of words that appear in a single sentence.

class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        var maxWords = 0
        
        sentences.forEach { sentence ->
            val words = sentence.filter { it == ' ' }.count() + 1
            if (words > maxWords) maxWords = words
        }
        
        return maxWords
    }
}
