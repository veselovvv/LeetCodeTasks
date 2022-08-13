// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
// You are given an array of strings words and a string chars.
// A string is good if it can be formed by characters from chars (each character can only be used once).
// Return the sum of lengths of all good strings in words.

class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        var wordMatches = true
        var result = 0
        
        words.forEach { word ->
            var unusedChars = mutableMapOf<Char, Int>()
            
            chars.forEach {
                unusedChars.put(it, unusedChars.get(it)?.plus(1) ?: 1)
            }
            
            word.forEach { letter ->
                if (unusedChars.keys.contains(letter) && unusedChars.get(letter) != 0) 
                    unusedChars.put(letter, unusedChars.get(letter)?.minus(1) ?: 0)
                else wordMatches = false
            }
            
            if (wordMatches) result += word.length else wordMatches = true
        }
        
        return result
    }
}
