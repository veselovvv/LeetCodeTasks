// https://leetcode.com/problems/string-matching-in-an-array/
// Given an array of string words. Return all strings in words which is substring of another word in any order. 
// String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].

class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        var result = mutableListOf<String>()
        
        words.forEach { firstWord ->
            words.forEach { secondWord ->
                if (secondWord.contains(firstWord) 
                    && firstWord != secondWord 
                    && !result.contains(firstWord)
                ) result.add(firstWord)
            }
        }
        
        return result
    }
}
