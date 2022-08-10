// https://leetcode.com/problems/maximum-number-of-words-you-can-type/
// There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
// Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, 
// return the number of words in text you can fully type using this keyboard.

class Solution {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        var brokenLetterIsUsed = false
        var result = 0
        
        (text + ' ').forEach {
            if (brokenLetters.contains(it)) brokenLetterIsUsed = true
            if (it == ' ')
                if (brokenLetterIsUsed) brokenLetterIsUsed = false else result++
        }
        
        return result
    }
}
