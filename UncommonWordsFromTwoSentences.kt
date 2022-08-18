// https://leetcode.com/problems/uncommon-words-from-two-sentences/
// A sentence is a string of single-space separated words where each word consists only of lowercase letters.
// A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
// Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

class Solution {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        var wordsWithTheirCount = hashMapOf<String, Int>()
        var result = arrayOf<String>()
        
        wordsWithTheirCount = countWords(s1, wordsWithTheirCount)
        wordsWithTheirCount = countWords(s2, wordsWithTheirCount)
        
        wordsWithTheirCount.forEach {
            if (it.value == 1) result += it.key
        }
        
        return result
    }
    
    fun countWords(s: String, wordsWithTheirCount: HashMap<String, Int>): HashMap<String, Int> {
        var word = ""
        
        s.forEachIndexed { index, letter ->
            if (letter != ' ') word += letter 
            if (letter == ' ' || index == s.length-1) {
                wordsWithTheirCount.put(word, wordsWithTheirCount.get(word)?.plus(1) ?: 1)
                word = ""
            }
        }
        
        return wordsWithTheirCount
    }
}
