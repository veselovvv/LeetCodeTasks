// https://leetcode.com/problems/shortest-completing-word/
// Given a string licensePlate and an array of strings words, find the shortest completing word in words.
// A completing word is a word that contains all the letters in licensePlate. Ignore numbers and spaces in licensePlate, and treat letters as case insensitive. 
// If a letter appears more than once in licensePlate, then it must appear in the word the same number of times or more.
// For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case), and 'c' twice. Possible completing words are "abccdef", "caaacab", 
// and "cbca". Return the shortest completing word in words. It is guaranteed an answer exists. If there are multiple shortest completing words, return the first one 
// that occurs in words.

class Solution {
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        var requiredLetters = arrayOf<Char>()
        var containsAllLetters = true
        var result = ""
        
        licensePlate.forEach {
            if (it in 'A'..'z') requiredLetters += it.toLowerCase()
        }
        
        words.forEach { word ->
            var tempWord = word
            
            requiredLetters.forEach { letter ->
                if (!tempWord.contains(letter)) 
                    containsAllLetters = false 
                else {
                    val indexOfLetterInTempWord = tempWord.indexOf(letter)
                    tempWord = tempWord.removeRange(indexOfLetterInTempWord, indexOfLetterInTempWord + 1)
                }
            }
            
            if (containsAllLetters) {
                if (result == "" || word.length < result.length) result = word
            } else containsAllLetters = true
        }
        
        return result
    }
}
