// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
// Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.
// Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, 
// return the index of the first word (minimum index). If there is no such word return -1.
// A prefix of a string s is any leading contiguous substring of s.

class Solution {
    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
        var wordsWithIndex = mutableMapOf<String, Int>()
        var index = 1
        var word = ""
        
        (sentence + " ").forEach {
            if (it == ' ') {
                if (!wordsWithIndex.keys.contains(word)) {
                    wordsWithIndex.put(word, index)
                    word = ""
                }
                
                index++
            } else word += it
        }
        
        wordsWithIndex.forEach {
            if (it.key.startsWith(searchWord)) return it.value
        }
        
        return -1
    }
}
